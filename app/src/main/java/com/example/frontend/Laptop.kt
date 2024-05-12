package com.example.frontend

data class Laptop(
    val name: String,
    val description: String,
    val imageRes : Int
)

fun getAllLaptops() : List<Laptop> {
    return listOf<Laptop>(
        Laptop(name = "asus rog", description = "laptop gaming", R.drawable.unknown),
        Laptop(name = "lenovo thinkpad", description = "laptop coding", R.drawable.unknown1),
        Laptop(name = "macbook pro m3", description = "laptop desain", R.drawable.unknown2)

    )
}
