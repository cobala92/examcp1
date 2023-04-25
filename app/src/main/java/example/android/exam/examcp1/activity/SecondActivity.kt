package example.android.exam.examcp1.activity

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.navigation.navArgs
import example.android.exam.examcp1.R

class SecondActivity : FragmentActivity() {

    companion object {
        const val KEY_SECOND_DATA = "KEY_SECOND_DATA"
    }

    private val args: SecondActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        getArgsSecondData()
    }

    private fun getArgsSecondData() {
        val tvResult = findViewById<TextView>(R.id.tvResult)
        Log.d("TAG11", "second activity = ${args.secondData}")
        args.secondData?.let {
            tvResult.text = "Result :\n Title: ${it.title}\n Description: ${it.description}"
        }
    }
}