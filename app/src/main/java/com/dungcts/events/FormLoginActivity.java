package com.dungcts.events;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FormLoginActivity extends AppCompatActivity {

    private EditText edt_email;
    private EditText edt_password;
    private Button btn_login;

    private void initGui(){
        edt_email= findViewById(R.id.edt_email);
        edt_password=findViewById(R.id.edt_password);
        btn_login=findViewById(R.id.btn_login);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formlogin_relativelayout);
        initGui();

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredEmail = edt_email.getText().toString().trim();
                String enteredPassword = edt_password.getText().toString().trim();
                if (enteredEmail.equals("linhtam2001a@gmail.com") && enteredPassword.equals("123")) {
                    Intent intent = new Intent(FormLoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(FormLoginActivity.this, "Email hoặc mật khẩu không đúng", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}