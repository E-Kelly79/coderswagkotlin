package com.kotlin.kelly.coderswag.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import com.kotlin.kelly.coderswag.R
import com.kotlin.kelly.coderswag.adapters.CategoryAdapter
import com.kotlin.kelly.coderswag.adapters.CategoryRecyclerAdapter
import com.kotlin.kelly.coderswag.model.Category
import com.kotlin.kelly.coderswag.services.DataService
import com.kotlin.kelly.coderswag.utils.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecyclerAdapter(this, DataService.categories) { category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        categoriesList.adapter = adapter
        val layoutManager = LinearLayoutManager(this)
        categoriesList.layoutManager = layoutManager
        categoriesList.setHasFixedSize(true)


    }
}
