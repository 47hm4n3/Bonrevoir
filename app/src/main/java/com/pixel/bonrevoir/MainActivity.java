package com.pixel.bonrevoir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.myBtn);
        btn.setOnClickListener(
                new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView tv = findViewById(R.id.myTxtV);
                    Button btn = findViewById(R.id.myBtn);
                    if(btn.getText().toString().equals(getString(R.string.dbjr))){
                        tv.setText(R.string.bjr);
                        btn.setText(getString(R.string.darv));
                    }else {
                        tv.setText(R.string.arv);
                        btn.setText(getString(R.string.dbjr));
                    }
                }
            }
            );
    }

}
