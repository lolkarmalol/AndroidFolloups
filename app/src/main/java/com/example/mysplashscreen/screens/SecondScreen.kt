package com.example.mysplashscreen.screens
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SecondScreen(){
    Scaffold {
        SecondBodyContent()
    }
}
@Composable
fun SecondBodyContent(){
    Column {
        Text(text = "he ido a la segunda vista")
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Volver atras")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SegundaVistaPrevia(){
    SecondScreen()
}