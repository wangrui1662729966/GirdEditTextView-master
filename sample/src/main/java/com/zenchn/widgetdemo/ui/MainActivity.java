package com.zenchn.widgetdemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zenchn.widget.GridEditView.GridEditView;
import com.zenchn.widgetdemo.R;

public class MainActivity extends AppCompatActivity {

    private GridEditView gevInput1;
    private GridEditView gevInput2;
    private GridEditView gevInput3;
    private GridEditView gevInput4;
    private GridEditView gevInput5;
    private GridEditView gevInput6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gevInput1 = (GridEditView) findViewById(R.id.gev_input1);
        gevInput2 = (GridEditView) findViewById(R.id.gev_input2);
        gevInput3 = (GridEditView) findViewById(R.id.gev_input3);
        gevInput4 = (GridEditView) findViewById(R.id.gev_input4);
        gevInput5 = (GridEditView) findViewById(R.id.gev_input5);
        gevInput6 = (GridEditView) findViewById(R.id.gev_input6);

    }

}
