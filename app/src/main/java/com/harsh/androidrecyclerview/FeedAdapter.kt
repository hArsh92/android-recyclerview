package com.harsh.androidrecyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.harsh.androidrecyclerview.data.Feed

class FeedAdapter(
    private val feeds: List<Feed>,
    private val supportFragmentManager: FragmentManager
) : RecyclerView.Adapter<FeedView>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedView =
        FeedView(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_feed, parent, false)
        )


    override fun getItemCount(): Int = feeds.size

    override fun onBindViewHolder(holder: FeedView, position: Int) {
        holder.bind(feeds[position])
        holder.itemView.setOnClickListener {
            val feedDetailFragment: BottomSheetDialogFragment = FeedDetailFragment()
            val feed = feeds[holder.adapterPosition]
            val data = Bundle()

            data.putString("feed", feed.comment)
            feedDetailFragment.arguments = data

            feedDetailFragment.show(supportFragmentManager, feed.comment)
        }
    }
}
