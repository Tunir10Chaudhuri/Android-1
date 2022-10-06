package com.example.calculatorapp;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText a = (EditText)findViewById(R.id.firstnumber);
        EditText b = (EditText)findViewById(R.id.secondnumber);
        Button add = (Button)findViewById(R.id.buttonadd);
        Button sub = (Button)findViewById(R.id.buttonsub);
        Button mul = (Button)findViewById(R.id.buttonmul);
        Button div = (Button)findViewById(R.id.buttondiv);
        Button mod = (Button)findViewById(R.id.buttonmod);
        Button per = (Button)findViewById(R.id.buttonper);
        Button pow = (Button)findViewById(R.id.buttonpow);
        Button sq = (Button)findViewById(R.id.buttonsq);
        Button inv = (Button)findViewById(R.id.buttoninv);
        Button vm = (Button)findViewById(R.id.buttonvm);
        Button del = (Button)findViewById(R.id.buttondel);
        TextView result = (TextView)findViewById(R.id.resultnumber);

        add.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                double n1 = Double.parseDouble(a.getText().toString());
                double n2 = Double.parseDouble(b.getText().toString());
                double r = n1+n2;
                temp=r;
                result.setText(Double.toString(r));
            }
        }

        );
        sub.setOnClickListener( new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view)
                                    {
                                        double n1 = Double.parseDouble(a.getText().toString());
                                        double n2 = Double.parseDouble(b.getText().toString());
                                        double r = n1-n2;
                                        temp=r;
                                        result.setText(Double.toString(r));
                                    }
                                }

        );
        mul.setOnClickListener( new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view)
                                    {
                                        double n1 = Double.parseDouble(a.getText().toString());
                                        double n2 = Double.parseDouble(b.getText().toString());
                                        double r = n1*n2;
                                        temp=r;
                                        result.setText(Double.toString(r));
                                    }
                                }

        );
        div.setOnClickListener( new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view)
                                    {
                                        double n1 = Double.parseDouble(a.getText().toString());
                                        double n2 = Double.parseDouble(b.getText().toString());
                                        double r = n1/n2;
                                        temp=r;
                                        result.setText(Double.toString(r));
                                    }
                                }

        );
        mod.setOnClickListener( new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view)
                                    {
                                        double n1 = Double.parseDouble(a.getText().toString());
                                        double n2 = Double.parseDouble(b.getText().toString());
                                        double r = n1%n2;
                                        temp=r;
                                        result.setText(Double.toString(r));
                                    }
                                }

        );
        per.setOnClickListener( new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view)
                                    {
                                        double n1 = Double.parseDouble(a.getText().toString());
                                        double n2 = Double.parseDouble(b.getText().toString());
                                        double r = (n1/n2)*100.0;
                                        temp=r;
                                        result.setText(Double.toString(r));
                                    }
                                }

        );
        pow.setOnClickListener( new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view)
                                    {
                                        double n1 = Double.parseDouble(a.getText().toString());
                                        double n2 = Double.parseDouble(b.getText().toString());
                                        double r = Math.pow(n1,n2);
                                        temp=r;
                                        result.setText(Double.toString(r));
                                    }
                                }

        );
        sq.setOnClickListener( new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view)
                                    {
                                        double n1 = Double.parseDouble(a.getText().toString());
                                        double r = Math.sqrt(n1);
                                        temp=r;
                                        result.setText(Double.toString(r));
                                    }
                                }

        );
        inv.setOnClickListener( new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view)
                                    {
                                        double n1 = Double.parseDouble(a.getText().toString());
                                        double r = 1.0/n1;
                                        temp=r;
                                        result.setText(Double.toString(r));
                                    }
                                }

        );
        vm.setOnClickListener( new View.OnClickListener(){
                                    @Override
                                    public void onClick(View view)
                                    {
                                        Intent in = new Intent(getApplicationContext(),NextActivity.class);
                                        in.putExtra("latestresult",temp);
                                        startActivity(in);
                                    }
                                }

        );
        del.setOnClickListener( new View.OnClickListener(){
                                   @Override
                                   public void onClick(View view)
                                   {
                                       Intent in2 = new Intent(getApplicationContext(),NextActivity.class);
                                       in2.putExtra("deleteresult",1.0);
                                       startActivity(in2);
                                   }
                               }

        );


    }
}