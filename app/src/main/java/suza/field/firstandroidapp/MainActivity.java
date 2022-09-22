package suza.field.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private Button btn1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1= (EditText) findViewById(R.id.txtName);
        btn1=(Button) findViewById(R.id.btnSubmit);
        btn1. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=editText1.getText().toString();
                Toast.makeText(getApplicationContext(), "Welcome "+text, Toast.LENGTH_LONG).show();
            }
        });
    }
    public void printText(View view){
        editText1.setText("TUMEANDIKA");
    }
}