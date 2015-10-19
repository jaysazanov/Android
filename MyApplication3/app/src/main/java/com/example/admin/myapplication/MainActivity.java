package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(TAG, "Naydem View Ellements");
        Button myBtn = (Button) findViewById(R.id.btnOk);
        myBtn.setText("Ok");
        myBtn.setEnabled(true);

        CheckBox myChb = (CheckBox) findViewById(R.id.checkBox);
        myChb.setChecked(true);

        Log.d(TAG, "Prisvaivaem");
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        //View.OnClickListener oclBtnOk=new View.OnClickListener() {
        View.OnClickListener oclBtn = new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG, "ID Click");
                switch (v.getId()) {
                    case R.id.btnOk:
                        Log.d(TAG, "Button OK");
                        tvOut.setText("Clicked button Ok");
                        //Toast.makeText(this , "Clicked button OK" , Toast.LENGTH_LONG).show();
                        break;
                    case R.id.btnCancel:
                        Log.d(TAG, "Button Cancel");
                        tvOut.setText("Clicked button Cancel");
                        break;
                }
                //tvOut.setText("Clicked button OK");
            }
        };
        btnOk.setOnClickListener(oclBtn);
        btnCancel.setOnClickListener(oclBtn);
        //btnOk.setOnClickListener(oclBtnOk);

        //View.OnClickListener oclBtnCancel=new View.OnClickListener(){
        //    public void onClick(View v){
        //        tvOut.setText("Clicked button Cancel");
        //    }
        //};
        //btnCancel.setOnClickListener(oclBtnCancel);

    /*
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("menu1");
        menu.add("menu2");
        menu.add("menu3");
        menu.add("menu4");
        return super.onCreateOptionsMenu(menu);
    }*/
}
}
