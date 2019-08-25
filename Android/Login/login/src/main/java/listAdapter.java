import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;



    public class MyListAdapter extends BaseAdapter {
        String titles[]={},dates[]={},status[]={};
        private Context context;
        public MyListAdapter(Context context, String[] title, String[] date, String[] status) {
            this.context=context;
            this.titles=title;
            this.dates=date;
            this.status=status;
        }
        @Override
        public int getCount() {
            return titles.length;
        }
        @Override
        public Object getItem(int position) {
            return null;
        }
        @Override
        public long getItemId(int position) {
            return 0;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
            TextView title,date,statusText;
            title=view.findViewById(R.id.title);
            date=view.findViewById(R.id.date);
            statusText=view.findViewById(R.id.statusText);
            title.setText(String.valueOf(titles[position]));
            date.setText(String.valueOf(dates[position]));
            statusText.setText(String.valueOf(status[position]));
            return view;
        }
    }



}
