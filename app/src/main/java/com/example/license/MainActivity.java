package com.example.license;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {
    EditText name, nn, sex, date, weight, height, add, lno, edate, acode, btype, ecolor,res, cond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name1);
        nn =findViewById(R.id.NN1);
        sex = findViewById(R.id.sex1);
        date = findViewById(R.id.date1);
        weight = findViewById(R.id.weight1);
        height = findViewById(R.id. height1);
        add = findViewById(R.id.Add1);
        lno = findViewById(R.id.lno1);
        edate = findViewById(R.id.edate1);
        acode =findViewById(R.id.acode1);
        btype = findViewById(R.id.btype1);
        ecolor = findViewById(R.id.ecolor1);
        res = findViewById(R.id.res1);
        cond = findViewById(R.id.cond1);
    }

    public void wews(View view) {
        String Name = name.getText().toString();
        String NN   = nn.getText().toString();
        String Sex = sex.getText().toString();
        String Date = date.getText().toString();
        String Weight = weight.getText().toString();
        String Height = height.getText().toString();
        String Add = add.getText().toString();
        String Lno = lno.getText().toString();
        String Edate = edate.getText().toString();
        String Acode = acode.getText().toString();
        String Btype = btype.getText().toString();
        String Ecolor = ecolor.getText().toString();
        String Res = res.getText().toString();
        String Cond = cond.getText().toString();



        if ((Name.length()==0) && (NN.length()==0) && (Sex.length()==0)&& (Date.length()==0) && (Weight.length()==0) && (Height.length()==0)
                && (Add.length()==0) && (Lno.length()==0) &&  (Edate.length()==0) &&  (Acode.length()==0) &&  (Btype.length()==0) && (Ecolor.length()==0)
                && (Res.length()==0)&& (Cond.length()==0))
        {
            Intent intent = new Intent(this,nodata.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "No Input Data", Toast.LENGTH_SHORT).show();
        }



        else if ((Name.length()==0) || (NN.length()==0) || (Sex.length()==0)|| (Date.length()==0) || (Weight.length()==0) || (Height.length()==0)
                || (Add.length()==0)|| (Lno.length()==0) || (Edate.length()==0) || (Acode.length()==0) || (Btype.length()==0) || (Ecolor.length()==0)
                || (Res.length()==0)|| (Cond.length()==0))
        {
            MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);
            builder.setTitle("Error!");
            builder.setMessage("Incomplete Data \n Do you want to Exit?");
            builder.setIcon(R.drawable.back);

            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {
                    finishAffinity();
                }
            });

            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                }
            });

            builder.show();
        }

        else
        {
            Intent intent = new Intent(this,Second.class);
            intent.putExtra("NAME",Name);
            intent.putExtra("NN",NN);
            intent.putExtra("SEX",Sex);
            intent.putExtra("DATE",Date);
            intent.putExtra("WEIGHT",Weight);
            intent.putExtra("HEIGHT",Height);
            intent.putExtra("ADD",Add);
            intent.putExtra("LNO",Lno);
            intent.putExtra("EDATE",Edate);
            intent.putExtra("ACODE",Acode);
            intent.putExtra("BTYPE",Btype);
            intent.putExtra("ECOLOR",Ecolor);
            intent.putExtra("RES",Res);
            intent.putExtra("COND",Cond);
            startActivity(intent);
        }


    }
}