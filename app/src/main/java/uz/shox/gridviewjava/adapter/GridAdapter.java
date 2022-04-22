package uz.shox.gridviewjava.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import uz.shox.gridviewjava.R;
import uz.shox.gridviewjava.model.ListData;

public class GridAdapter extends BaseAdapter {

    Context context;
    ArrayList<ListData> listData;
    LayoutInflater inflater;

    public GridAdapter(Context context, ArrayList<ListData> listData) {
        this.context = context;
        this.listData = listData;
        this.inflater = (LayoutInflater.from(context)) ;
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.item_grid,null);

        ImageView icons = view.findViewById(R.id.icons);
        TextView name = view.findViewById(R.id.name);

        ListData listData1 = listData.get(position);

        icons.setImageResource(listData1.getIcons());
        name.setText(listData1.getName());

        return view;
    }
}
