package com.example.gurpal.expenseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class Income extends AppCompatActivity {

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);

        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1

        TabHost.TabSpec spec = host.newTabSpec("Income");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Income");
        host.addTab(spec);

        //Tab 2

        spec = host.newTabSpec("Expense");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Expense");
        host.addTab(spec);
    }
}
