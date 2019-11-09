package com.harsh.androidrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.harsh.androidrecyclerview.feed.Feed
import com.harsh.androidrecyclerview.feed.FeedAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val feeds: List<Feed> = DataProvider.feeds()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_feeds.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_feeds.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        rv_feeds.adapter =
            FeedAdapter(feeds, supportFragmentManager)
    }
}
