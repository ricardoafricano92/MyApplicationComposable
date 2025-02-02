package com.example.myapplicationcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box


import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationcomposable.ui.theme.MyApplicationComposableTheme


class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationComposableTheme {

boxes()

            }
        }
    }
}


@Composable
fun boxes(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(randomColor())
            .padding(30.dp),
            contentAlignment = Alignment.Center

    ){
        println(randomColor())
Button(onClick = {

    println("hola")
},modifier = Modifier.align(Alignment.TopStart)){Text(text = "cambiar colores")}




    //imagen painter y todo es es esencial
    Image(
        painter = painterResource(id = R.drawable.skeletor),

        //descripcion de la imagen es obligatoria
                contentDescription = "skeletor",

        //content reescala la imagen para que quede bien
                contentScale=ContentScale.Crop,


    )
        Text(
            text = "skeletor",
           textAlign = TextAlign.Center,
            fontSize = 40.sp,

        )

}
}

fun randomColor(): Color {
    val colorLong = (0xFF000000..0xFFFFFFFF).random() // Generate a random Long in the range of colors
    return Color(colorLong) // Convert the Long to a Color
}





