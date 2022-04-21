package com.example.pr8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button_share);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "ЕГОР КРИД – ПЕРВАЯ ПОПУЛЯРНОСТЬ Родители Егора довольно скептически относились к столь большой любви к музыке со стороны сына, но это ему не помешало.В возрасте 15-16 лет Егор записывает кавер на песню Тимати “Не Сходи С Ума” и немного позже создает свой первый клип “Любовь В Сети”.");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }
        });
        Button button2 = (Button) findViewById(R.id.button_send);
        Uri pic;
        pic = Uri.parse("drawable/_1.jpg");
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_STREAM, pic);
                shareIntent.setType("image/jpg");
                startActivity(shareIntent);

            }
        });
    }
}