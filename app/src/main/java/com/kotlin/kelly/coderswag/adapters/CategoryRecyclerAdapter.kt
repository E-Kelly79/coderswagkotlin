package com.kotlin.kelly.coderswag.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.kotlin.kelly.coderswag.R
import com.kotlin.kelly.coderswag.model.Category
import kotlinx.android.synthetic.main.category_list_item.view.*

class CategoryRecyclerAdapter(val ctx : Context, val categories: List<Category>, var itemClick: (Category) -> Unit) :
    RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>()  {

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCats(categories[position], ctx)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.category_list_item, parent, false)
        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }


    inner class Holder(itemView: View?, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val catImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val catTitle = itemView?.findViewById<TextView>(R.id.categoryTitle)

        fun bindCats(category: Category, contex:Context){
            val resourceId = contex.resources.getIdentifier(category.image, "drawable", contex.packageName)
            catImage?.setImageResource(resourceId)
            catTitle?.text = category.title
            itemView.setOnClickListener{ itemClick(category)}
        }
    }
}