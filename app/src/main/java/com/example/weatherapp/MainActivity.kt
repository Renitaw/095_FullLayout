package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.weatherapp.ui.theme.WeatherAppTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()) {
        Text(
            text = "Renita Widiastuti",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            modifier = Modifier
                .padding(16.dp)
        )

        Spacer(modifier = Modifier.padding(13.dp))

        Box1()

        Spacer(modifier = Modifier.padding(13.dp))

        Lokasi()

        Spacer(modifier = Modifier.padding(13.dp))

        Box2()
    }
}

@Composable
fun Box1() {
    val image = painterResource(id = R.drawable.bg)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(25.dp))
            .background(Color.DarkGray)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(painter = image,
                contentDescription = null,
                modifier = Modifier.size(250.dp)
            )
            Text(
                text = "Rain",
                fontSize = 30.sp,
                color = Color.White
            )
        }
    }
}

@Composable
fun Lokasi() {
    val customColor = ContextCompat.getColor(LocalContext.current, R.color.teal_700)
    val myCustomColor = Color(customColor)
    Text(text = "19°C",
         fontSize = 64.sp,
         fontWeight = FontWeight.Bold,)

    Column {
        Row {
            Image(
                painter = painterResource(id = R.drawable.location),
                contentDescription = "",
                modifier = Modifier.size(55.dp)
            )

            Text(
                text = "Yogyakarta",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Text(
            text = "Kasihan, Kabupaten Bantul\n Derah Istimewa Yogyakarta",
            color = myCustomColor,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun Box2() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(25.dp))
            .background(color = Color.DarkGray)) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(3.dp)) {
                    Text(
                        text = "Humidity",
                        color = Color.LightGray
                    )
                    Text(
                        text = "98%",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        color = Color.White)

                    Spacer(modifier = Modifier.padding(30.dp))

                    Text(
                        text = "Sunrise",
                        color = Color.LightGray
                    )
                    Text(
                        text = "05.00 AM",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        color = Color.White
                    )
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(3.dp)) {
                    Text(
                        text = "UV Index",
                        color = Color.LightGray
                    )
                    Text(
                        text = "9 / 10",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.padding(30.dp))

                    Text(
                        text = "Sunset",
                        color = Color.LightGray
                    )
                    Text(
                        text = "05.40 PM",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WeatherAppTheme {
        HomeScreen()
    }
}