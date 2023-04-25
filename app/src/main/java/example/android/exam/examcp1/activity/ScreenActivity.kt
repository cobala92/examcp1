package example.android.exam.examcp1.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import example.android.exam.examcp1.R

class ScreenActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)
    }
}