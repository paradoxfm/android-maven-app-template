package ru.megazlo.and;

import android.app.Activity;
import android.os.Bundle;
import org.androidannotations.annotations.EActivity;

/**
 * @author iv - 27.03.2016
 */
@EActivity(R.layout.main)
public class HelloFlashlight extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
