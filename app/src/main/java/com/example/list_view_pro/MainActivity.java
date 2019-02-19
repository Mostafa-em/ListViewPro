package com.example.list_view_pro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView myView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myView=findViewById(R.id.list_view);

        List<list_Item_model> models=new ArrayList<list_Item_model>();
        models.add(new list_Item_model(R.mipmap.ic_launcher_round,"ali","athoore",100));
        models.add(new list_Item_model(R.mipmap.ic_launcher,"ali","athoore",98));
        models.add(new list_Item_model(R.layout.pic,"ali","athoore",98));
        models.add(new list_Item_model(1,"ali","athoore",98));
        models.add(new list_Item_model(1,"ali","athoore",98));
        models.add(new list_Item_model(1,"ali","athoore",98));
        models.add(new list_Item_model(1,"ali","athoore",98));
        models.add(new list_Item_model(1,"ali","athoore",98));
        models.add(new list_Item_model(1,"ali","athoore",98));
        models.add(new list_Item_model(1,"ali","athoore",98));
        models.add(new list_Item_model(1,"ali","athoore",877));


MyCustumAdapter adapter=new MyCustumAdapter(getApplicationContext(), (ArrayList<list_Item_model>) models);
myView.setAdapter(adapter);





    }
}
