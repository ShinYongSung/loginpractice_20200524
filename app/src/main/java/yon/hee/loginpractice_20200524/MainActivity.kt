package yon.hee.loginpractice_20200524

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

            val inputid = idEdt.text.toString()
            val inputPw = pwEdt.text.toString()

            Log.d("입력아이디", inputid)
            Log.d("입력비번", inputPw)

            if(inputid == "admin@admin.com" && inputPw == "qwer") {
                Log.d("로그인확인", "관리자입니다.")
            }
            else{Log.d("로그인확인", "로그인에 실패했습니다".)}







//
//            when (inputid) {
//                "admin" -> {Log.d("입력ID", "관리자")}
//                "admin@admin.com" ->{
//                    Log.d("입력ID", "관리자이메일")
//                }
//                else -> {Log.d(("입력ID","틀린ID"))}
//            }
//
//            if (inputid == "admin") {
//
//                //둘이 실제로 같을때만 실행되는 코드
//                Log.d("입력확인", "admin임")
//            }
//            else if (inputid == "admin@admin.com") {
//                Log.d("입력ID확인", "관리자이메일임")
//            }
//            else {
//                Log.d("입력ID확인","틀린 아이디")
//            }

        }
    }
}
