package com.example.frontend

sealed class Screens (val screen: String){
    data object Button1: Screens( screen= "button1")
    data object Button2: Screens( screen= "button2")
    data object About: Screens( screen= "about")

}