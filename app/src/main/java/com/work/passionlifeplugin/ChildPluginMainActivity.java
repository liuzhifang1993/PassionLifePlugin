package com.work.passionlifeplugin;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChildPluginMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_child);
        findViewById(R.id.test_plugin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChildPluginMainActivity.this, ChildPluginActivity.class));
            }
        });
    }
}
