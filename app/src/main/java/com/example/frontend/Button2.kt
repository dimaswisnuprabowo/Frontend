package com.example.frontend

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.frontend.ui.theme.GreenJC

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun Button2(){
    Scaffold (
        topBar={
            TopAppBar(title = {
                Text("Search")
            },
                navigationIcon =  {
                    IconButton(onClick = {  }) {
                        Icon(imageVector = Icons.Default.Search,
                            contentDescription = "Search")

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
                Material2()
            }
        }




    )





}

@Composable
fun Material2 () {
    var myList = getAllLaptops()
    LazyVerticalGrid(
        columns = GridCells.Fixed(count = 2),
        contentPadding = PaddingValues(vertical = 2.dp) ){
        itemsIndexed(myList){index, item ->
            LazyGrid(item = item)
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
fun LazyGrid(item : Laptop) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ){
        Image(painter = painterResource(id = item.imageRes), contentDescription = item.name,
            modifier = Modifier
                .size(84.dp))
        Column {
            Text(text = item.name,
                style = TextStyle(fontSize = 20.sp),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 10.dp, top = 10.dp)
            )

        }


    }
}