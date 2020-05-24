package yon.hee.loginpractice_20200524

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

            val inputid = idEdt.text.toString()
            val inputPw = pwEdt.text.toString()

            Log.d("입력아이디", inputid)
            Log.d("입력비번", inputPw)

        }
    }
}
