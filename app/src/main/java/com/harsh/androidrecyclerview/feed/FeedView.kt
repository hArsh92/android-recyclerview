package com.harsh.androidrecyclerview.feed

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.harsh.androidrecyclerview.R

class FeedView(
    itemView: View,
    private val tvPost: TextView = itemView.findViewById(R.id.tv_post)
) : RecyclerView.ViewHolder(itemView) {

    fun bind(feed: Feed) {
        tvPost.text = feed.description
    }
}