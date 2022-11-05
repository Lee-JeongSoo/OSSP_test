package com.example.testapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.text.TextUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity(){
    private lateinit var btn_login:Button
    private lateinit var btn_signup:Button
    private lateinit var btn_findpwd:Button

    private lateinit var CID:EditText
    private lateinit var pwd:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login=findViewById(R.id.login_btn)
        btn_signup=findViewById(R.id.sign_btn)
        btn_findpwd=findViewById(R.id.find_pwd_btn)
        CID=findViewById(R.id.login_ID)
        pwd=findViewById(R.id.login_password)

        btn_login.setOnClickListener {
            val Email = CID.text.toString()
            val Password=pwd.text.toString()

            btn_signup.setOnClickListener {
                val intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
                finish()
            }

            if(TextUtils.isEmpty(Email) && TextUtils.isEmpty(Password)){
                Toast.makeText(this,"이메일 또는 비밀번호를 입력해주세요",Toast.LENGTH_SHORT).show()
            }
            else {
                //로그인 확인 과정없이 일단 아이디 비밀번호 입력시 로그인되게함. 파이어베이스 연결 필요
                val intent1 = Intent(this, expage::class.java)
                startActivity(intent1)
                finish()
            }
        }
    }
}
