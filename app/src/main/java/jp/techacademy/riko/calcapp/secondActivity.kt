package jp.techacademy.riko.calcapp

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class secondActivity : AppCompatActivity() ,View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

    }
    override fun onClick(v:View) {

        val value1 = intent.getIntExtra("VALUE1", 0)
        val value2 = intent.getIntExtra("VALUE2", 0)

        when(v.id){
            R.id.button1->textView.text="${value1 + value2}"
            R.id.button2->textView.text="${value1 - value2}"
            R.id.button3->textView.text="${value1 / value2}"
            R.id.button4->textView.text="${value1 * value2}"
        }
    }
}
