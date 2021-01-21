package com.work.passionlifeplugin;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

/**
 * 测试页面
 * @author lzf
 */
public class ChildPluginActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_child);
    }
}
