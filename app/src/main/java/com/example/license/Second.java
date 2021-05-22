package com.example.license;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    TextView fname, nn, sex, date, weight, height, add, lno, exdate, acode, btype, ecolor, res, cond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        fname = findViewById(R.id.name);
        nn =findViewById(R.id.NN);
        sex = findViewById(R.id.sex);
        date = findViewById(R.id.date);
        weight = findViewById(R.id.weight);
        height = findViewById(R.id. height);
        add = findViewById(R.id.Add);
        lno = findViewById(R.id.Lno);
        exdate = findViewById(R.id.edate);
        acode =findViewById(R.id.acode);
        btype = findViewById(R.id.btype);
        ecolor = findViewById(R.id.textView29);
        res= findViewById(R.id.res);
        cond = findViewById(R.id.cond);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("NAME");
        fname.setText(Name);
        String NN = intent.getStringExtra("NN");
        nn.setText(NN);
        String Sex = intent.getStringExtra("SEX");
        sex.setText(Sex);
        String Date = intent.getStringExtra("DATE");
        date.setText(Date);
        String Weight = intent.getStringExtra("WEIGHT");
        weight.setText(Weight);
        String Height = intent.getStringExtra("HEIGHT");
        height.setText(Height);
        String Add = intent.getStringExtra("ADD");
        add.setText(Add);
        String Lno = intent.getStringExtra("LNO");
        lno.setText(Lno);
        String Edate = intent.getStringExtra("EDATE");
        exdate.setText(Edate);
        String Acode = intent.getStringExtra("ACODE");
        acode.setText(Acode);
        String Btype = intent.getStringExtra("BTYPE");
        btype.setText(Btype);
        String Ecolor = intent.getStringExtra("ECOLOR");
        ecolor.setText(Ecolor);
        String Res = intent.getStringExtra("RES");
        res.setText(Res);
        String Cond = intent.getStringExtra("COND");
        cond.setText(Cond);
    }

    public void btfunc(View view) {
        Intent intent3 = new Intent(this, MainActivity.class);
        startActivity(intent3);

    }
}