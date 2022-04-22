package uz.shox.gridviewjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import uz.shox.gridviewjava.adapter.GridAdapter;
import uz.shox.gridviewjava.model.ListData;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }
    public void initView(){
        gridView = findViewById(R.id.gridView);

        ArrayList<ListData> data = new ArrayList<>();
        data.add(new ListData("Lamborghini",R.drawable.lambo));
        data.add(new ListData("Ferrari",R.drawable.ferra));
        data.add(new ListData("Mercedes Benz",R.drawable.mers));
        data.add(new ListData("BMW",R.drawable.bmw));

        refreshAdapater(data);
    }
    public void refreshAdapater(ArrayList<ListData> dataArrayList){

        GridAdapter gridAdapter = new GridAdapter(this,dataArrayList);
        gridView.setAdapter(gridAdapter);
    }
}