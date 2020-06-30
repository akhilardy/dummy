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

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
//store in "nameOFEmployee" in database
    String nameOfEmployee;
    int a1=0;
    String dummyName;
    int resArr[]=new int[100];

    int arrInd=0;
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
    public Button findButton(int id){
        Button res=(Button)findViewById(R.id.btn1);
        switch (id){
            case 1: res=(Button)findViewById(R.id.btn1);
                    break;
            case 2: res=(Button)findViewById(R.id.btn2);
                    break;
            case 3: res=(Button)findViewById(R.id.btn3);
                break;
            case 4: res=(Button)findViewById(R.id.btn4);
                break;
            case 5: res=(Button)findViewById(R.id.btn5);
                break;
            case 6: res=(Button)findViewById(R.id.btn6);
                break;
            case 7: res=(Button)findViewById(R.id.btn7);
                break;
            case 8: res=(Button)findViewById(R.id.btn8);
                break;
            case 9: res=(Button)findViewById(R.id.btn9);
                break;
            case 10: res=(Button)findViewById(R.id.btn10);
                break;
            case 11: res=(Button)findViewById(R.id.btn11);
                break;
            case 12: res=(Button)findViewById(R.id.btn12);
                break;
            case 13: res=(Button)findViewById(R.id.btn13);
                break;
            case 14: res=(Button)findViewById(R.id.btn14);
                break;
            case 15: res=(Button)findViewById(R.id.btn15);
                break;
            case 16: res=(Button)findViewById(R.id.btn16);
                break;
            case 17: res=(Button)findViewById(R.id.btn17);
                break;
            case 18: res=(Button)findViewById(R.id.btn18);
                break;
            case 19: res=(Button)findViewById(R.id.btn19);
                break;
            case 20: res=(Button)findViewById(R.id.btn20);
                break;
            case 21: res=(Button)findViewById(R.id.btn21);
                break;
            case 22: res=(Button)findViewById(R.id.btn22);
                break;
            case 23: res=(Button)findViewById(R.id.btn23);
                break;
            case 24: res=(Button)findViewById(R.id.btn24);
                break;
            case 25: res=(Button)findViewById(R.id.btn25);
                break;

        }
        return res;
    }
    public void takeNum(View view){
        int q1=0;
        int floor=0;
        int ceil=0;
        Button res=(Button)findViewById(R.id.btn1);
        int idNum=0;
        switch (view.getId()) {

            case R.id.btn1:
                idNum=1;
                Button b1 = (Button) findViewById(R.id.btn1);
                res=(Button) findViewById(R.id.btn1);
                q1 = Integer.parseInt(b1.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn2:
                idNum=2;
                Button b2 = (Button) findViewById(R.id.btn2);
                res=(Button) findViewById(R.id.btn2);
                q1 = Integer.parseInt(b2.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                //store the "q1" int database
                break;

            case R.id.btn3:
                //add to database
                idNum=3;
                Button b3 = (Button) findViewById(R.id.btn3);
                res=(Button) findViewById(R.id.btn3);
                q1 = Integer.parseInt(b3.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                //store the "q1" int database
                break;
            case R.id.btn4:
                idNum=4;
                Button b4 = (Button) findViewById(R.id.btn4);
                res=(Button) findViewById(R.id.btn4);
                q1 = Integer.parseInt(b4.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                //store the "q1" int database
                break;
            case R.id.btn5:
                idNum=5;
                Button b5 = (Button) findViewById(R.id.btn5);
                res=(Button) findViewById(R.id.btn5);
                q1 = Integer.parseInt(b5.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn6:
                idNum=6;
                Button b6 = (Button) findViewById(R.id.btn6);
                res=(Button) findViewById(R.id.btn6);
                q1 = Integer.parseInt(b6.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn7:
                idNum=7;
                Button b7 = (Button) findViewById(R.id.btn7);
                res=(Button) findViewById(R.id.btn7);
                q1 = Integer.parseInt(b7.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn8:
                idNum=8;
                Button b8 = (Button) findViewById(R.id.btn8);
                res=(Button) findViewById(R.id.btn8);
                q1 = Integer.parseInt(b8.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn9:
                idNum=9;
                Button b9 = (Button) findViewById(R.id.btn9);
                res=(Button) findViewById(R.id.btn9);
                q1 = Integer.parseInt(b9.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn10:
                idNum=10;
                Button b10 = (Button) findViewById(R.id.btn10);
                res=(Button) findViewById(R.id.btn10);
                q1 = Integer.parseInt(b10.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn11:
                idNum=11;
                Button b11 = (Button) findViewById(R.id.btn11);
                res=(Button) findViewById(R.id.btn11);
                q1 = Integer.parseInt(b11.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn12:
                idNum=12;
                Button b12 = (Button) findViewById(R.id.btn12);
                res=(Button) findViewById(R.id.btn12);
                q1 = Integer.parseInt(b12.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn13:
                idNum=13;
                Button b13 = (Button) findViewById(R.id.btn13);
                res=(Button) findViewById(R.id.btn13);
                q1 = Integer.parseInt(b13.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn14:
                idNum=14;
                Button b14 = (Button) findViewById(R.id.btn14);
                res=(Button) findViewById(R.id.btn14);
                q1 = Integer.parseInt(b14.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn15:
                idNum=15;
                Button b15 = (Button) findViewById(R.id.btn15);
                res=(Button) findViewById(R.id.btn15);
                q1 = Integer.parseInt(b15.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn16:
                idNum=16;
                Button b16 = (Button) findViewById(R.id.btn16);
                res=(Button) findViewById(R.id.btn16);
                q1 = Integer.parseInt(b16.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn17:
                idNum=17;
                Button b17 = (Button) findViewById(R.id.btn17);
                res=(Button) findViewById(R.id.btn17);
                q1 = Integer.parseInt(b17.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn18:
                idNum=18;
                Button b18 = (Button) findViewById(R.id.btn18);
                res=(Button) findViewById(R.id.btn18);
                q1 = Integer.parseInt(b18.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn19:
                idNum=19;
                Button b19 = (Button) findViewById(R.id.btn19);
                res=(Button) findViewById(R.id.btn19);
                q1 = Integer.parseInt(b19.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn20:
                idNum=20;
                Button b20 = (Button) findViewById(R.id.btn20);
                res=(Button) findViewById(R.id.btn20);
                q1 = Integer.parseInt(b20.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn21:
                idNum=21;
                Button b21 = (Button) findViewById(R.id.btn21);
                res=(Button) findViewById(R.id.btn21);
                q1 = Integer.parseInt(b21.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn22:
                idNum=22;
                Button b22 = (Button) findViewById(R.id.btn22);
                res=(Button) findViewById(R.id.btn22);
                q1 = Integer.parseInt(b22.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn23:
                idNum=23;
                Button b23 = (Button) findViewById(R.id.btn23);
                res=(Button) findViewById(R.id.btn23);
                q1 = Integer.parseInt(b23.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn24:
                idNum=24;
                Button b24 = (Button) findViewById(R.id.btn24);
                res=(Button) findViewById(R.id.btn24);
                q1 = Integer.parseInt(b24.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;
            case R.id.btn25:
                idNum=25;
                Button b25 = (Button) findViewById(R.id.btn25);
                res=(Button) findViewById(R.id.btn25);
                q1 = Integer.parseInt(b25.getText().toString());
                Log.d("sample q1", "value of q1 " + q1);
                break;



        }
        resArr[arrInd++]=q1;
        floor=((idNum/5)*5)+1;
        ceil=((idNum/5)+1)*5;
        for(int i=floor;i<=ceil;i++) {
            if(i!=idNum) {
                Button btn = (Button) findButton(i);
                btn.setEnabled(false);
            }
        }
        res.setBackgroundResource(R.drawable.setcolorbackground);

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
        if(input.equalsIgnoreCase("yes")){
            resArr[arrInd++]=-1;
        }
        else{
            resArr[arrInd++]=-2;
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
        if(input.equalsIgnoreCase("yes")){
            resArr[arrInd++]=-1;
        }
        else if(input.equalsIgnoreCase("no")){
            resArr[arrInd++]=-2;
        }
        else{
            resArr[arrInd++]=-3;
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
            boolean flag=true;
            int cou=0;
            for(int i=0;i<100;i++){
                if(resArr[i]!=0){
                    cou++;
                }
            }
            if(cou<10){
                flag=false;
                Toast.makeText(getApplicationContext(),"Please fill up all the required fields",Toast.LENGTH_LONG).show();
            }
            else {
                //add companyName to database
                Float ratingVal = rating.getRating();
                Log.d("rating", ratingVal + "");
                TextView comRating = (TextView) findViewById(R.id.finalView);
                comRating.setText(ratingVal + "");
                Button btn=(Button)findViewById(R.id.submitButton);
                Toast.makeText(getApplicationContext(),"Your rating has been recorded successfully",Toast.LENGTH_LONG).show();
                btn.setEnabled(false);
            }
        }
    }


    



