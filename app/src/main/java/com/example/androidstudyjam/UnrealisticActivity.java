package com.example.androidstudyjam;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Дом on 05.04.2016.
 */
public class UnrealisticActivity extends Activity  implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unrealistic);
    }

    @Override
    public void onClick(View v) {

    }
}
