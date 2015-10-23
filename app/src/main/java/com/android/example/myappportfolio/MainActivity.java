package com.android.example.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button1:
                showMessage(getString(R.string.spotify_streamer));
                break;

            case R.id.button2:
                showMessage(getString(R.string.scores_app));
                break;

            case R.id.button3:
                showMessage(getString(R.string.library_app));
                break;

            case R.id.button4:
                showMessage(getString(R.string.build_it_bigger));
                break;

            case R.id.button5:
                showMessage(getString(R.string.bacon_reader));
                break;

            case R.id.button6:
                showMessage(getString(R.string.my_capstone_app));
                break;

            default:
                break;

        }
    }

    private void showMessage(String appName) {
        Toast.makeText(MainActivity.this, getString(R.string.btn_action_message, appName), Toast.LENGTH_SHORT).show();
    }
}
