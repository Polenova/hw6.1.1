package ru.android.polenova;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String methodName;
    TextView textView;
    Button buttonActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.TextViewLog);
        buttonActivity = findViewById(R.id.buttonActivity);
        methodName = "onCreate";
        Log.d("LifeCycle", methodName);
        textView.append("\n" + methodName);

        buttonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        if(savedInstanceState ==null){
            textView.append("\n" + "Bundle null");
        } else {
            textView.append("\n" + "Bundle text");
        }
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        methodName = "onPostCreate";
        Log.d("LifeCycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        methodName = "onPostResume";
        Log.d("LifeCycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onStart() {
        super.onStart();
        methodName = "onStart";
        Log.d("LifeCycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onStop() {
        super.onStop();
        methodName = "onStop";
        Log.d("LifeCycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        methodName = "onDestroy";
        Log.d("LifeCycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onPause() {
        super.onPause();
        methodName = "onPause";
        Log.d("LifeCycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onResume() {
        super.onResume();
        methodName = "onResume";
        Log.d("LifeCycle", methodName);
        textView.append("\n" + methodName);
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        methodName = "onRestart";
        Log.d("LifeCycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        methodName = "onKeyDown";
        Log.d("LifeCycle", methodName);
        textView.append("\n" + methodName);
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        methodName = "onKeyLongPress";
        Log.d("LifeCycle", methodName);
        textView.append("\n" + methodName);
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        methodName = "onBackPressed";
        Log.d("LifeCycle", methodName);
        textView.append("\n" + methodName);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        methodName = "onSaveInstanceState";
        Log.d("LifeCycle", methodName);
        textView.append("\n" + methodName);
        outState.putString("key", "Запись Bundle");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(MainActivity.this,savedInstanceState.getString("key"), Toast.LENGTH_LONG).show();
        methodName = "onRestoreInstanceState";
        Log.d("LifeCycle", methodName);
        textView.append("\n" + methodName);
    }
}

