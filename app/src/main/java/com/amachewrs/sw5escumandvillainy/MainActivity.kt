package com.amachewrs.sw5escumandvillainy

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.amachewrs.sw5escumandvillainy.ui.theme.SW5eScumAndVillainyTheme


class MainActivity : ComponentActivity() {

    private val errorlist = listOf(1,2,3,4,5,6,7,8,9,10)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.gay)
        findViewById<Button>(R.id.button).setOnClickListener {
            for(i in 1..20){
                errorlist[i].plus(2)
            }
        }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SW5eScumAndVillainyTheme {
        Greeting("Android")
    }
}