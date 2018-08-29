package com.example.student.actorinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    String name;
    int photoId;
    ImageView imageView;
    TextView nameText,detailstest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        initView();
        loadData();
    }

    private void loadData() {
        name = getIntent().getExtras().toString("name");
        photoId = getIntent().getExtras().getInt("photo");
    }

    private void initView() {


    }
}
