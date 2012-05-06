package com.tinfoil.sms;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.Menu;
import android.view.MenuItem;

public class QuickPrefsActivity extends PreferenceActivity {
    
	/**
	 * Things done when the preference menu is created  
	 * Left as default
	 */
    @Override
    public void onCreate(Bundle savedInstanceState) {        
        super.onCreate(savedInstanceState);    
        
        /*
         * Add preferences from the options.xml file.
         */
        addPreferencesFromResource(R.xml.options);        
    }
    
    /**
     * Stuff you want done when the items on the preference menu are created upon run.
     * Left as default
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, 0, 0, "Show current settings");
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * Add something for a item on the preference list to do when it is selected.

     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 0:
            	startActivity(new Intent(this, addContact.class));
            return true;
        }
        return false;
    }
    
}