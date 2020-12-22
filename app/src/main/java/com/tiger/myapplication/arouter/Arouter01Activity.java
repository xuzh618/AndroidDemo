package com.tiger.myapplication.arouter;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.tiger.myapplication.R;

@Route(path = ArouterConstants.ACTIVITY_URL_LOGIN)
public class Arouter01Activity extends AppCompatActivity {

    private static final String TAG = Arouter01Activity.class.getSimpleName();

    @Autowired
    String name;

    @Autowired
    int age;

    @Autowired(name = "xuzhaohu")
    Person person;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitvity_login);


        // need to inject
        ARouter.getInstance().inject(this);

        Log.d(TAG, "name = " + name + "; age = " + age);
        if (person != null) {
            Log.d(TAG, person.toString());
        } else {
            Log.d(TAG, "persion is null");
        }

        findViewById(R.id.button_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "name = " + name + "; age = " + age);

                if (person != null) {
                    Log.d(TAG, person.toString());
                } else {
                    Log.d(TAG, "persion is null");
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
