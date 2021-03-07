package com.example.helloworld

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * setContentView
         * レイアウトXMLで記述されたビューの定義から画面を生成します
         * void setContentView(int layoutResId)
         * layoutResId: レイアウトXMLのリソースID
         */
        setContentView(R.layout.activity_main)

        tapHere.setOnClickListener {
            textView.text = "ボタンがタップされました"
        }
    }
}