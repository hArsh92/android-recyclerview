package com.harsh.androidrecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.harsh.androidrecyclerview.data.Feed

class FeedView(
    itemView: View,
    private val tvPost: TextView = itemView.findViewById(R.id.tv_post)
) : RecyclerView.ViewHolder(itemView) {

    fun bind(feed: Feed) {
        tvPost.text = feed.comment
    }
}
