package com.tiger.myapplication;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.tiger.myapplication.arouter.ArouterConstants;
import com.tiger.myapplication.arouter.Person;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

@Route(path = ArouterConstants.ACTIVITY_URL_MAIN)
public class MainActivity extends AppCompatActivity {

    private  static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // 时间分发
        eventDispatch();
        init();
    }


    //view event dispatch
    private void eventDispatch() {

        Log.d(TAG, "eventDispatch()");

        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d(TAG, "setOnClickListener()");

                ndkMethod();

                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                // ARouter instance()
                ARouter.getInstance()
                        .build(ArouterConstants.ACTIVITY_URL_LOGIN)
                        .withString("name", "tiger")
                        .withInt("age", 18)
                        .withParcelable("xuzhaohu", new Person("tiger2", 26, true))
                        .navigation();

            }
        });

        fab.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Log.d(TAG, "setOnTouchListener()");

//                return true;
                return false;
            }
        });

        // onTouch 返回值会影响 onClick的值

    }

    private void init() {

        Log.d(TAG, "init()");

        Handler handler = new Handler();

    }


    //ndk demo
    // 1. load library
    static {
        System.loadLibrary("hello");
    }

    // 2. define native method
    private native void methodFromNative();


    //3. Java call method
    private void ndkMethod() {
        Log.d(TAG, "ndkMethod()");

        Log.i(TAG, "methodFromNative");

        methodFromNative();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}