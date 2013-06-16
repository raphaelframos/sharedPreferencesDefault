package br.com.powell.sharedpreferences;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.PreferenceActivity;

public class MainActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.configuracoes);
        
        CheckBoxPreference checkPreference = (CheckBoxPreference) findPreference(getString(R.string.ligado_key));
        EditTextPreference editPreference = (EditTextPreference) findPreference(getString(R.string.nome_key));
    }

}
