package com.ghjh.mom_baby;


import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class Injection_Activity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_injection);
        TabHost tabhost = getTabHost();
        
        TabHost.TabSpec spec;
        Intent intent;
        Resources res = getResources();
         
        intent = new Intent().setClass(this, Calendar_Activity.class);
        spec = tabhost.newTabSpec("calendar");
        spec.setIndicator("Calendar");
        spec.setContent(intent);
        tabhost.addTab(spec);
         
        intent = new Intent().setClass(this, List_Activity.class);
        spec = tabhost.newTabSpec("list");
        spec.setIndicator("List");
        spec.setContent(intent);
        tabhost.addTab(spec);
        
        
    }

}