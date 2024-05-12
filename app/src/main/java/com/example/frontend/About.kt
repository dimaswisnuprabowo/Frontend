package com.example.frontend

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.frontend.ui.theme.GreenJC

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun About(){
    Scaffold (
        topBar={
            TopAppBar(title = {
                Text("About")
            },
                navigationIcon =  {
                },
                actions = {
                }
            )


        },
        content = { paddingValues ->
            Surface (
                modifier = Modifier.padding(paddingValues),
            ){
                Material3()
            }
        }




    )

}

@Composable
fun Material3(){
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxSize()
            .align(Alignment.TopCenter),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.dimas), contentDescription = "Logo",
                modifier = Modifier.size(250.dp).padding(20.dp).border(BorderStroke(4.dp, Color.Green),
                    CircleShape
                )
                    .padding(4.dp)
                    .clip(CircleShape)

            )
            Text(text = "Dimas Wisnu Prabowo", fontSize = 20.sp, color = Color.Black, fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold
            )
            Text(text = "dimasbae211@gmail.com", fontSize = 20.sp, color = Color.Black, fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold)
            Text(text = "Universitas Jambi", fontSize = 20.sp, color = Color.Black, fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold)
            Text(text = "Sistem Informasi", fontSize = 20.sp, color = Color.Black, fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold)
        }
    }
}