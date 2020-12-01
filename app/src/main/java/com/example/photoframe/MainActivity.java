package com.example.photoframe;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    String[] names = {"Bill", "Harry", "Rohit", "SRK", "Virat"};
    ImageButton prev, next;
    ImageView pic;
    TextView text;
    int currentImage = 0;
    // 0-1-2-3-4-0-1-2-3-4
    // aplpha is used to get the image blur or not the image is there but with 0 taking in it can
    // make the image invisible and 1 make it visible.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void prev(View v) {
        text = findViewById(R.id.text);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (5 + currentImage - 1) % 5;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);

        text.setText(names[currentImage]);

    }

    public void next(View v) {
        text = findViewById(R.id.text);
        String idX = "pic" + currentImage;
        int x = this.getResources().getIdentifier(idX, "id", getPackageName());
        pic = findViewById(x);
        pic.setAlpha(0f);

        currentImage = (currentImage + 1) % 5;
        String idY = "pic" + currentImage;
        int y = this.getResources().getIdentifier(idY, "id", getPackageName());
        pic = findViewById(y);
        pic.setAlpha(1f);
        text.setText(names[currentImage]);

    }
}