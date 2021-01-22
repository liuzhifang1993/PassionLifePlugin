package com.work.passionlifeplugin;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.qihoo360.replugin.loader.a.PluginActivity;

public class ChildPluginMainActivity extends PluginActivity {

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
