package com.dungcts.events;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FormSignUpActivity extends AppCompatActivity {

    private EditText edt_email;
    private EditText edt_password;
    private EditText edt_change_password;
    private Button btn_login;

    private void initGui(){
        edt_email= findViewById(R.id.edt_email);
        edt_password=findViewById(R.id.edt_password);
        edt_change_password=findViewById(R.id.edt_changepassword);
        btn_login=findViewById(R.id.btn_login);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formsignup_linearlayout);
        initGui();

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy giá trị từ EditText
                String email = edt_email.getText().toString();
                String password = edt_password.getText().toString();
                String confirmPassword = edt_change_password.getText().toString();
                if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(FormSignUpActivity.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!password.equals(confirmPassword)) {
                    Toast.makeText(FormSignUpActivity.this, "Mật khẩu không khớp", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(FormSignUpActivity.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FormSignUpActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

}