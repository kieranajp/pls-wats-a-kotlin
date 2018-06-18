package uk.kieranajp.competition

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val t = Toast.makeText(this, "Example", Toast.LENGTH_SHORT)
        t.show()
    }

    fun countMe(view: View) {
        val text = textView.text.toString()
        var count: Int = Integer.parseInt(text)
        count++

        textView.text = count.toString()
    }
}
