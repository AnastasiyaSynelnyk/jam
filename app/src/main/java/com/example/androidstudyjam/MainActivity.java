package com.example.androidstudyjam;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private Button mVenus;
    private Button mCobra;
    private Button mUnrealistic;
    private Button mDesignConcepts;
    private Button mCityPlaza;

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mCobra = (Button) findViewById(R.id.button_cobra);
        mCobra.setOnClickListener(this);

        mVenus = (Button) findViewById(R.id.button_venus);
        mVenus.setOnClickListener(this);

        mUnrealistic = (Button) findViewById(R.id.button_un);
        mUnrealistic.setOnClickListener(this);

        mDesignConcepts = (Button) findViewById(R.id.button_de);
        mDesignConcepts.setOnClickListener(this);

        mCityPlaza = (Button) findViewById(R.id.button_cplaza);
        mCityPlaza.setOnClickListener(this);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false));

        Resources mRes = getResources();
        String[] buildings = mRes.getStringArray(R.array.buildings_arr);

        mAdapter = new BuildingAdapter(getBaseContext(), buildings);
        mRecyclerView.setAdapter(mAdapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button_cobra:
                Intent intent1 = new Intent(this, CobraActivity.class);
                startActivity(intent1);
                break;

            case R.id.button_venus:
                Intent intent = new Intent(this, VenusTowerActivity.class);
                startActivity(intent);
                  break;

            case R.id.button_de:
                Intent intent3 = new Intent(this, DesignConceptsActivity.class);
                startActivity(intent3);
                break;

            case R.id.button_un:
                Intent intent4 = new Intent(this, UnrealisticActivity.class);
                startActivity(intent4);
                break;

            case R.id.button_cplaza:
                Intent intent2 = new Intent(this, CityPlazaActivity.class);
                startActivity(intent2);
                break;

            default:
                break;


        }

    }
}
