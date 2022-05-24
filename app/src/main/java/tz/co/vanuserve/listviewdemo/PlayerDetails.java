package tz.co.vanuserve.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PlayerDetails extends AppCompatActivity {

    private TextView clickedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_details);
        clickedItem=findViewById(R.id.clicked_item);

        Intent intent=getIntent();
        int position=intent.getIntExtra("position",0);
        clickedItem.setText("You Clicked Pos: "+position);
    }
}