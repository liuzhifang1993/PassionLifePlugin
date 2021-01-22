package com.work.passionlifeplugin;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.qihoo360.replugin.loader.a.PluginActivity;

/**
 * 测试页面
 * @author lzf
 */
public class ChildPluginActivity extends PluginActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_child);
    }
}
