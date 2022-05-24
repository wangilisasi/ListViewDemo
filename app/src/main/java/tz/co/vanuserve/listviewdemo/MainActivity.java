package tz.co.vanuserve.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.all_simba_players);

        // Data Model
        ArrayList<String> data = new ArrayList<>();
        for (int i = 100; i > 0; i--) {
            data.add("Yanga player No: " + i);
        }

        for (String x : data) {
            Log.d(TAG, "onCreate: " + x);
        }

        //Adatpter i.e. Controller
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(MainActivity.this,"You clicked position "+i,Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, PlayerDetails.class);
                Bundle bundle = new Bundle();
                bundle.putInt("position", i);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}