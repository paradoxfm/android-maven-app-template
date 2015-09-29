package ru.megzlo.templateapp.activity;

import android.app.Activity;
import android.os.Bundle;
import org.androidannotations.annotations.EActivity;
import ru.megzlo.templateapp.R;

/**
 * @author paradoxfm - 28.09.2015
 */
@EActivity(R.layout.home)
public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
