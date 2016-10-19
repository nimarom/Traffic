package com.nawarin.traffic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetailActivity extends AppCompatActivity {

    TextView txtTitleDetail,txtDetail;
    ImageView imvTitleDetail;

    String [] strTitle;
    int[] intIcon;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        initView();

        showWidget();


    }

    private void initView(){
        txtTitleDetail = (TextView) findViewById(R.id.txtTitleDetail);
        txtDetail = (TextView) findViewById(R.id.txtDetail);
        imvTitleDetail = (ImageView) findViewById(R.id.imvTrafficDetail);
    }

    private void showWidget(){

        Intent gotIntent = getIntent();
        i = gotIntent.getIntExtra("position",0);
        Mydata objMydata = new Mydata();
        intIcon = objMydata.icon();
        strTitle = objMydata.title();
        String[] detail = getResources().getStringArray(R.array.traffic_detail);


        txtTitleDetail.setText(strTitle[i]);
        imvTitleDetail.setBackgroundResource(intIcon[i]);
        txtDetail.setText(detail[i]);

    }
}
