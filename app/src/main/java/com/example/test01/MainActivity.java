package com.example.test01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView msgBox;
    EditText usrIdEdit;
    EditText passEdit;

    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        usrIdEdit = findViewById(R.id.usrIdEdit);
        passEdit = findViewById(R.id.usrPassEdit);
        msgBox = findViewById(R.id.msgbox);

        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = usrIdEdit.getText().toString();
                String pass = passEdit.getText().toString();
                if("".equals(id)){

                    Toast.makeText(MainActivity.this, "아이디 입력 바람", Toast.LENGTH_SHORT).show();

                    return;
                }else if("".equals(pass)){

                    Toast.makeText(MainActivity.this, "패스워드 입력 바람", Toast.LENGTH_SHORT).show();

                    return;
                }
                Toast.makeText(MainActivity.this, id, Toast.LENGTH_SHORT).show();

                StringBuffer sb = new StringBuffer();

                sb.append("ID :");
                sb.append(id);

                sb.append(" PW :");
                sb.append(pass);

                String msg = String.format("ID : %s, PW : %s", id, pass);

                Log.d("포멧 테스트", msg);

                msgBox.setText(sb.toString());

            }
        });
    }
}
