package com.example.deepn.coderswag.Services

import com.example.deepn.coderswag.Model.Category
import com.example.deepn.coderswag.Model.Product

object DataService {
    val categories= listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage")
    )
    val hats= listOf(
            Product("Devslopes Graphic Beanie","₹500","hat1"),
            Product("Devslopes Hat Black","₹500","hat2"),
            Product("Devslopes Hat White","₹500","hat3"),
            Product("Devslopes Hat Snapback","₹500","hat4")
    )
    val hoodies= listOf(
            Product("Devslopes Hoodie Gray","₹1300","hoodie1"),
            Product("Devslopes Hoodie Red","₹1300","hoodie2"),
            Product("Devslopes Gray Hoodie ","₹1300","hoodie3"),
            Product("Devslopes Hoodie Black","₹1300","hoodie4")
    )
    val shirts= listOf(
            Product("Devslopes Shirt Black","₹1000","shirt1"),
            Product("Devslopes Badge Light Gray","₹1000","shirt2"),
            Product("Devslopes Logo Shirt Red","₹1000","shirt3"),
            Product("Devslopes Hustle","₹1000","shirt4"),
            Product("Kickflip Studios","₹1000","shirt5")
    )
}