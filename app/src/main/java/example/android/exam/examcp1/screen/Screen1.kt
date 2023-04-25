package example.android.exam.examcp1.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import example.android.exam.examcp1.ui.theme.ExamCP1Theme

@Composable
fun Screen1() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "This is SCREEN 1",
            modifier = Modifier.align(Alignment.Center),
        )
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ClickableText(
            modifier = Modifier
                .height(56.dp)
                .background(color = Color.Gray)
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 10.dp),
            text = AnnotatedString("Move to Screen1"),
            style = TextStyle(color = Color.White),
            onClick = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ExamCP1Theme {
        Greeting("Android")
    }
}
