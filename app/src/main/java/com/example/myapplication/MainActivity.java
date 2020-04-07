package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
//store in "nameOFEmployee" in database
    String nameOfEmployee;
    int a1=0;
    String dummyName;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name=(TextView)findViewById(R.id.textView);
        mDatabase= FirebaseDatabase.getInstance().getReference("rateyouremployee");




    }
    public void askMe(View view){
        LayoutInflater li=LayoutInflater.from(this);
        View promptsView=li.inflate(R.layout.prompts,null);
        final AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setView(promptsView);


        //add companyName to database

        final EditText nameBox=(EditText)promptsView.findViewById(R.id.editText2);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                nameOfEmployee=nameBox.getText().toString();

                //add to database

            }
        });
        builder.setNegativeButton("CANCLE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog=builder.create();
        alertDialog.show();



    }
    public void takeNum(View view){
        int q1=0;
        switch (view.getId()){

            case R.id.btn1:

                Button b1=(Button)findViewById(R.id.btn1);
                //add to database
                q1=Integer.parseInt(b1.getText().toString());
                Log.d("sample q1", "value of q1 "+q1);
                //store the "q1" int database
                break;
            case R.id.btn2:
                //add to database
                Button b2=(Button)findViewById(R.id.btn2);
                q1=Integer.parseInt(b2.getText().toString());
                Log.d("sample q1", "value of q1 "+q1);
                //store the "q1" int database
                break;

            case R.id.btn3:
                //add to database
                Button b3=(Button)findViewById(R.id.btn3);
                q1=Integer.parseInt(b3.getText().toString());
                Log.d("sample q1", "value of q1 "+q1);
                //store the "q1" int database
                break;
            case R.id.btn4:
                //add to database
                Button b4=(Button)findViewById(R.id.btn4);
                q1=Integer.parseInt(b4.getText().toString());
                Log.d("sample q1", "value of q1 "+q1);
                //store the "q1" int database
                break;
            case R.id.btn5:
                //add to database
                Button b5=(Button)findViewById(R.id.btn5);
                q1=Integer.parseInt(b5.getText().toString());
                Log.d("sample q1", "value of q1 "+q1);
                //store the "q1" int database
                break;
        }
    }
    public void radioInputMethod(View view){
        String input="default";
        switch (view.getId()){
            case R.id.radioYes:
                RadioButton rbtn=(RadioButton)findViewById(R.id.radioYes);
                input=rbtn.getText().toString();
                //store input value in dataBase
                Log.d("radio", "radioInputMethod: "+input);
                break;
            case R.id.radioNo:
                RadioButton rbtnNo=(RadioButton)findViewById(R.id.radioNo);
                input=rbtnNo.getText().toString();
                //store input value in dataBase
                Log.d("radio", "radioInputMethod: "+input);
                break;
        }
    }
    public void radioLeader(View view) {
        String input = "default";
        switch (view.getId()) {
            case R.id.radioLeaderYes:
                RadioButton rbtn = (RadioButton) findViewById(R.id.radioLeaderYes);
                input = rbtn.getText().toString();
                //store input value in dataBase
                Log.d("radio", "radioInputMethod: " + input);
                break;
            case R.id.radioLeaderNo:
                RadioButton rbtnNo = (RadioButton) findViewById(R.id.radioLeaderNo);
                input = rbtnNo.getText().toString();
                //store input value in dataBase
                Log.d("radio", "radioInputMethod: " + input);
                break;
            case R.id.noLeader:
                RadioButton noLeader = (RadioButton) findViewById(R.id.noLeader);
                input = noLeader.getText().toString();
                //store input value in dataBase
                Log.d("radio", "radioInputMethod: " + input);
                break;
        }
    }
        public void database(View view){
            RatingBar rating=(RatingBar)findViewById(R.id.ratingBar);
            //add rating to database
            final TextView comName=(TextView) findViewById(R.id.tvCom);
            final EditText name=(EditText)findViewById(R.id.companyName);
            String companyName=name.getText().toString();
            comName.setText(companyName);
            Log.d("companyName",companyName);

            //add companyName to database
            Float ratingVal=rating.getRating();
            Log.d("rating",ratingVal+"");
            TextView comRating=(TextView)findViewById(R.id.finalView);
            comRating.setText(ratingVal+"");
        }
    }


    



