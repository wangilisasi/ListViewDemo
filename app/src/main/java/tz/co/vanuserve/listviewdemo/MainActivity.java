package tz.co.vanuserve.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.all_simba_players);

        // Data Model
        ArrayList<String> data=new ArrayList<>();
        for(int i=100;i>0;i--){
            data.add("Simba player No: "+i);
        }
        for(String x:data) {
            Log.d(TAG, "onCreate: " + x);
        }

        //Adatpter i.e. Controller
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.list_item,data);
        listView.setAdapter(adapter);
    }
}