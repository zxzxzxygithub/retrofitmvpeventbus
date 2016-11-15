package com.test.retrofit;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ContentMainActivity extends Activity implements View.OnClickListener {

    private RelativeLayout contentMain;
    private ProgressBar progressBar;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        contentMain = (RelativeLayout) findViewById(R.id.content_main);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        findViewById(R.id.button).setOnClickListener(this);
        textView3 = (TextView) findViewById(R.id.textView3);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                //TODO implement
                break;
        }
    }

}
