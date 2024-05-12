

package com.example.frontend

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.frontend.ui.theme.GreenJC
import java.security.AlgorithmParameters


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun Button1() {
    Scaffold (
        topBar={
            TopAppBar(title = {
                Text("Home")
            },
                navigationIcon =  {
                    IconButton(onClick = {  }) {
                        Icon(imageVector = Icons.Default.Home,
                            contentDescription = "Home")

                    }
                },
                actions = {
                }
            )


        },
        content = { paddingValues ->
            Surface (
                modifier = Modifier.padding(paddingValues),
            ){
                Material()
            }
        }




    )
//

}

@Composable
fun Material () {
    var myList = getAllLaptops()
    Box {
        Modifier
            .padding(top = 40.dp) // Adjust this value according to your needs
            .fillMaxSize()
        Column {
            LazyColumn(content = {
                itemsIndexed(myList, itemContent = { index, item ->
                    LaptopItem(item = item)
                })
            })
            LazyRow(content = {
                itemsIndexed(myList, itemContent = { index, item ->
                    Card(
                        modifier = Modifier
                            .width(200.dp)
                            .height(100.dp)
                            .padding(8.dp)

                    )
                    {
                        Column {
                            LaptopList(item = item)
                        }
                    }
                })


            })
        }
    }
}





@Composable
fun LaptopItem(item : Laptop) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Image(painter = painterResource(id = item.imageRes), contentDescription = item.name,
            modifier = Modifier
                .size(84.dp))
        Column {
//            Text(text = item.name,
//                style = TextStyle(fontSize = 20.sp),
//                fontWeight = FontWeight.Bold,
//                modifier = Modifier.padding(start = 10.dp, top = 10.dp)
//            )
            Text(text = item.description,
                style = TextStyle(fontSize = 20.sp),
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(start = 10.dp)
            )
        }


    }
}
@Composable
fun LaptopList(item : Laptop) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Image(painter = painterResource(id = item.imageRes), contentDescription = item.name,
            modifier = Modifier
                .size(54.dp))
        Column {
            Text(text = item.name,
                style = TextStyle(fontSize = 10.sp),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 17.dp, top = 10.dp)
            )
            Text(text = item.description,
                style = TextStyle(fontSize = 10.sp),
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(start = 15.dp, top = 10.dp)
            )

        }


    }
}
