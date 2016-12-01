package com.example.varun.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public Button rb,lb;
    public int points=0,l=0,r=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb= (Button)findViewById(R.id.rbutton);
        lb= (Button)findViewById(R.id.lbutton);

        while(l==r) {
            Random rand= new Random();
            l = rand.nextInt(100)+1;
            r = rand.nextInt(100)+1;
        }
        lb.setText(""+l);
        rb.setText(""+r);
    }

    public void leftbuttonclick(View view){
        if(l>r) {
            points++;
        }
        else{
            points--;
        }
            pointupdate();

            do {
                Random rand= new Random();
                l = rand.nextInt(100)+1;
                r = rand.nextInt(100)+1;
            }while(l==r);
            lb.setText("" + l);
            rb.setText("" + r);
    }
    public void rightbuttonclick(View view){
       if(r>l) {
           points++;
       }
        else{
           points--;
       }
           pointupdate();


           do {
               Random rand= new Random();
               l = rand.nextInt(100)+1;
               r = rand.nextInt(100)+1;
           }while(l==r);
           lb.setText("" + l);
           rb.setText("" + r);

    }
    public void pointupdate()
    {
        TextView text=(TextView)findViewById(R.id.point);
        text.setText("Points: "+points);
    }
}
