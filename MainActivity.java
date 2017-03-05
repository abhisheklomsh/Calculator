package abhisheklomsh.calculator;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnrel;
    EditText txtval1,txtval2;
    TextView mTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnrel=(Button)findViewById(R.id.btnsum);
        Button  btnmul=(Button)findViewById(R.id.button);
        Button  btndiv=(Button)findViewById(R.id.button2);
        Button btnsub=(Button)findViewById(R.id.button3);

        txtval1=(EditText)findViewById(R.id.txtval1);
        txtval2=(EditText)findViewById(R.id.txtval2);
        mTextView = (TextView) findViewById((R.id.textView3));

        btnrel.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnsub.setOnClickListener(this);

    }

    public void onClick(View v) {

        int value1=Integer.parseInt(txtval1.getText().toString());
        int value2=Integer.parseInt(txtval2.getText().toString());

        int rel=value1+value2;
        int mul = value1*value2;
        float div = (float)value1/value2;
        int sub = value1-value2;
        switch (v.getId()) {
            case R.id.btnsum:
                Toast.makeText(this, String.valueOf(rel), Toast.LENGTH_SHORT).show();
                mTextView.setText(rel);
                break;
            case R.id.button:
                Toast.makeText(this, String.valueOf(mul), Toast.LENGTH_SHORT).show();
                mTextView.setText(mul);
                break;
            case R.id.button2:
                Toast.makeText(this, String.valueOf(div), Toast.LENGTH_SHORT).show();
                
                break;
            case R.id.button3:
                Toast.makeText(this, String.valueOf(sub), Toast.LENGTH_SHORT).show();
                mTextView.setText(sub);
                break;
            default:
                break;
        }







    }
}