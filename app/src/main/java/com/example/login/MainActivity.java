package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
//import android.util.Log;
import android.view.View;
import android.widget.Button;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /* private static final String TAG  = "MainActivity"; */

    Button btn1;
    Button btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
    }


    public void onResume()
    {
        super.onResume();
         btn2.setOnClickListener(new View.OnClickListener(){
               public void onClick(View view){
                   Intent i = new Intent(MainActivity.this, SIGNUP.class);
                   startActivity(i);
               }
         });

    }

    public void onRestart(){
        super.onRestart();
    }
       /* btn1.setOnClickListener((new View.OnClickListener(){
             public void onClick(View view){
                 customDialog("Dialog Box 1","Successfully submitted", "cancel method" ,"okMethod");
             }
        }));

        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                customDialog("Dialog Box 2", "cancel", "cancelMethod");
            }
        });
    }*/








    /*public void customDialog(String title, String message, final String cancelMethod, final String okMethod){
        final android.support.v4.app.AlertDialog.Builder builderSingle = new android.support.v4.app.AlertDialog.Builder(this);
        builderSingle.setIcon(R.drawable.ic_stat_name);
        builderSingle.setTitle(title);
        builderSingle.setMessage(message);

        builderSingle.setNegativeButton(
                "Cancel",
                new DialogInterface.OnCancelListener(){
                    public void onClick(DialogInterface dialog, int which){
                        Log.d(TAG,"onclick: cancel1 called");
                        if (cancelMethod.equals(("cancelMethod"))) {
                            cancelMethod();
                        }

                        else if(cancelMethod.equals("cancelMethod")){
                            cancelMethod();
                        }

                    }
                });


        builderSingle.setPositiveButton(
                "OK",
                 new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialogInterface, int i){
                        Log.d(TAG,"onclick: cancel1 called");
                        if (cancelMethod.equals(("cancelMethod"))) {
                            cancelMethod();
                        }

                        else if(cancelMethod.equals("cancelMethod")){
                            cancelMethod();
                        }
                    }
                 });
        builderSingle.show();
    }

    private void cancelMethod() {
        Log.d(TAG, "cancelMethod");
        toastMessage("Cancel Method.");
    }


    private void okMethod() {
        Log.d(TAG, "cancelMethod");
        toastMessage("ok Method.");
    }





    public void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }*/
}



