package com.harsh.androidrecyclerview.comment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.harsh.androidrecyclerview.R

class CommentAdapter(
    private val comments: List<Comment>
) : RecyclerView.Adapter<CommentView>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentView =
        CommentView(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_feed, parent, false)
        )


    override fun getItemCount(): Int = comments.size

    override fun onBindViewHolder(holder: CommentView, position: Int) {
        holder.bind(comments[position])
    }
}
