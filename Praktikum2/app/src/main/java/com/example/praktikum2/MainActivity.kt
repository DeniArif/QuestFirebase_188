package com.example.praktikum2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum2.ui.theme.Praktikum2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->0
                    BasicColumn(modifier =Modifier.padding(innerPadding))


                }
            }
        }
    }


@Composable
fun BasicColumn(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.
        fillMaxSize().
        padding(top = 50.dp)
    ){
    Text("Hello",
        fontSize = 100.sp,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.padding(10.dp))
    Text("Jetpack compose",
        fontSize = 50.sp,
        fontStyle = FontStyle.Italic
    )
        Spacer(modifier = Modifier.padding(20.dp))

        Image(
            painter = painterResource(id =R.drawable.umy),
            contentDescription = "",
            modifier = Modifier.clip(CircleShape)
        )
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//@Preview( showBackground = true)
@Composable
fun GreetingPreview() {
    Praktikum2Theme {
        BasicColumn()
    }
}
}