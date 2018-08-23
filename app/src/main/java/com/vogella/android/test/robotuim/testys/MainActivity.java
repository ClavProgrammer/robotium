package com.vogella.android.test.robotuim.testys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.first_button)
    Button first;
    @BindView(R.id.second_button)
    Button second;
    @BindView(R.id.third_button)
    Button third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timber.plant(new Timber.DebugTree());

        ButterKnife.bind(this);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Timber.i("First button onClick -> Starting new activity");

                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
