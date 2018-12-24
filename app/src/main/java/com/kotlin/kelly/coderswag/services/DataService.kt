package com.kotlin.kelly.coderswag.services

import com.kotlin.kelly.coderswag.model.Category
import com.kotlin.kelly.coderswag.model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hates = listOf(
        Product("Devslopes Graphic Beanie", "$18.00", "hat1"),
        Product("Devslopes Hat Black", "$20.00", "hat2"),
        Product("Devslopes Hat White", "$18.00", "hat3"),
        Product("Devslopes Hat Snapback", "$22.00", "hat4")
    )

    val Hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28.00", "hoodie1"),
        Product("Devslopes Hoodie Red", "$32.00", "hoodie2"),
        Product("Devslopes Hoodie Black", "$28.00", "hoodie3"),
        Product("Devslopes Hoodie White", "$32.00", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Gray", "$28.00", "shirt1"),
        Product("Devslopes Shirt Red", "$32.00", "shirt2"),
        Product("Devslopes Shirt Black", "$28.00", "shirt3"),
        Product("Devslopes Shirt White", "$32.00", "shirt4")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hates
            "HOODIES" -> Hoodies
            else -> digitalGood
        }
    }

}