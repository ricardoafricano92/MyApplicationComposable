package com.example.myapplicationcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColumnTest()

        }
    }
}

@Composable
fun ColumnTest(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 35.dp)
        .background(Color.Cyan)) {



    Row(modifier = Modifier
        .background(Color.Red)
        .padding(bottom = 35.dp)){
Text(text = "hola mundo")
        Spacer(modifier = Modifier.width(15.dp))
        Text(text = "alo")


    }
           Row(modifier = Modifier
               .background(Color.Green)
               .padding(top = 20.dp)) {
                Text(text = "Columnas2")

            }
        Row(modifier = Modifier
            .background(Color.Blue)
            .padding(top = 20.dp)) {
            Text(text = "Columnas2")

        }
        Box(modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxHeight()){
            Image(
                painter = painterResource(id = R.drawable.windows11),
                contentDescription = "logowindows11",
                modifier = Modifier
                    .align(Alignment.Center).fillMaxSize(),
contentScale = ContentScale.Crop
            )
            Text(
                text = "texto superior derecho",
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .background(Color.Gray)
            )
            Text(text = "texto centro", modifier = Modifier.align(Alignment.Center).background(Color.Gray))
            Text(
                text = "texto inferiori izquierdo",
                modifier = Modifier.align(Alignment.BottomStart)
            )
            FloatingActionButton(
                modifier = Modifier.align(Alignment.BottomEnd).padding(12.dp),
                onClick = { println("haciendo prints en consola que mas se va ahacer") }
            ) {
                Text("+")
            }


        }


    }
}









@Preview
@Composable
fun Previewer(){

    ColumnTest()

}


