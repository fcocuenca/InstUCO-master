package com.jr91.instuco;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class imageList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ListView listview = (ListView) findViewById(R.id.imageListView);
        listview.setAdapter(new adapterListView(this, new String[]{"Jesus Rio",
                "Miguel Lama", "Paco Cuenca", "Jose A. Albalat"}, new String[]{"https://pbs.twimg.com/profile_images/514788735972827136/IomFqYrK.jpeg", "http://cdn.slidesharecdn.com/profile-photo-miguellama14-96x96.jpg?cb=1457346847", "https://scontent-mad1-1.xx.fbcdn.net/v/t1.0-0/p206x206/1185218_427392030703802_828367808_n.jpg?oh=aa78c4409dff3eab97644718bdffd2f4&oe=58BAF8C5", "https://yt3.ggpht.com/-1hizJAOBQlc/AAAAAAAAAAI/AAAAAAAAAAA/tM_4a4k4RfQ/s900-c-k-no-rj-c0xffffff/photo.jpg"}));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_image_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
