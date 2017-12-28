package com.example.scitmaster.fifthdayquest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private LinearLayout mainLayout;
    private RelativeLayout messageLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           /* LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mainLayout);
            View.inflate(MainActivity.this,R.layout.messagelayout,linearLayout);*/
           RelativeLayout relativeLayout = (RelativeLayout)View.inflate(MainActivity.this,R.layout.messagelayout,null);
           LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mainLayout);
            if(linearLayout.getChildCount() %2 == 0) relativeLayout.setBackgroundColor(Color.GRAY);
            linearLayout.addView(relativeLayout);

        }
    };
}
