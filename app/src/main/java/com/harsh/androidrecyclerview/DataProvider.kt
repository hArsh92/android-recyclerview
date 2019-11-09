package com.harsh.androidrecyclerview

import com.harsh.androidrecyclerview.comment.Comment
import com.harsh.androidrecyclerview.feed.Feed
import kotlin.random.Random

class DataProvider {

    companion object {
        fun feeds(): List<Feed> {
            val feeds: MutableList<Feed> = mutableListOf()

            feeds.add(Feed("loreum ipsum", comments()))
            feeds.add(Feed("loreum ipsum", comments()))
            feeds.add(Feed("loreum ipsum", comments()))
            feeds.add(Feed("loreum ipsum", comments()))
            feeds.add(Feed("loreum ipsum", comments()))
            feeds.add(Feed("loreum ipsum", comments()))
            feeds.add(Feed("loreum ipsum", comments()))

            return feeds.toList()
        }

        fun comments(): List<Comment> {
            val comments: MutableList<Comment> = mutableListOf()

            val random = Random(10)
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))
            comments.add(Comment("loreum ipsum ${random.nextLong()}"))

            return comments.toList()
        }
    }
}
