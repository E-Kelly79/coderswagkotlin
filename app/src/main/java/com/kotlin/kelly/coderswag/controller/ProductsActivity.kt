package com.kotlin.kelly.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.kelly.coderswag.R
import com.kotlin.kelly.coderswag.utils.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categortType = intent.getStringExtra(EXTRA_CATEGORY)
    }
}
