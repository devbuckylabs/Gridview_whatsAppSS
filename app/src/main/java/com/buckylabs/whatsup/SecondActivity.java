package com.buckylabs.whatsup;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView imageView=findViewById(R.id.imageFull);
        String path = getIntent().getStringExtra("imagePath");
        Bitmap bmp = BitmapFactory.decodeFile(path);
        imageView.setImageBitmap(bmp);


    }
}
