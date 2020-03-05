package jp.techacademy.riko.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() ,View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.text="＋"
        button2.text="－"
        button3.text="÷"
        button4.text="×"

    button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }
    override fun onClick(v:View) {
        val intent=Intent(this, secondActivity::class.java)
        startActivity(intent)
        intent.putExtra("VALUE1", editText1.text.toString())
        intent.putExtra("VALUE2", editText2.text.toString())
        startActivity(intent)
    }

}
