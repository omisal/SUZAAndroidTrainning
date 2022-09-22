package suza.field.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleCalculator extends AppCompatActivity {
    private EditText txtNum1,txtNum2;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);
        txtNum1=(EditText) findViewById(R.id.txtNum1);
        txtNum2=(EditText) findViewById(R.id.txtNum2);
        result=(TextView) findViewById(R.id.txtResult);
    }
    public void addition(View view){
        long num1=Long.valueOf(txtNum1.getText().toString());
        long num2=Long.valueOf(txtNum2.getText().toString());
        long res=num1+num2;
        result.setText(String.valueOf(res));
    }
    public void substraction(View view){
        long num1=Long.valueOf(txtNum1.getText().toString());
        long num2=Long.valueOf(txtNum2.getText().toString());
        long res=num1-num2;
        result.setText(String.valueOf(res));
    }
    public void multiplication(View view){
        long num1=Long.valueOf(txtNum1.getText().toString());
        long num2=Long.valueOf(txtNum2.getText().toString());
        long res=num1*num2;
        result.setText(String.valueOf(res));
    }
    public void division(View view){
        long num1=Long.valueOf(txtNum1.getText().toString());
        long num2=Long.valueOf(txtNum2.getText().toString());
        if(num2 != 0){
            long res=num1/num2;
            result.setText(String.valueOf(res));
        }else{
            Toast.makeText(this, "Can not divide by 0", Toast.LENGTH_LONG).show();
        }
    }
}