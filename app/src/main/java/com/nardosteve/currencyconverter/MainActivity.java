package com.nardosteve.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void ConvertCurrency(View view){

        EditText editText = (EditText) findViewById(R.id.editText);

        Double dollarAmount = Double.parseDouble(editText.getText().toString());

        Double poundAmount = dollarAmount * 0.0099;

        Toast.makeText(this, "$" + poundAmount.toString(), Toast.LENGTH_SHORT).show();


        Log.i("Currency : ", editText.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
