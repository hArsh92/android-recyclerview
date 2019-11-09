package com.harsh.androidrecyclerview.data

import kotlin.random.Random

class DataProvider {

    companion object {
        fun feeds(): List<Feed> {
            val feeds: MutableList<Feed> = mutableListOf()

            val random = Random(100)
            feeds.add(Feed("loreum ipsum ${random.nextLong()}"))
            feeds.add(Feed("loreum ipsum ${random.nextLong()}"))
            feeds.add(Feed("loreum ipsum ${random.nextLong()}"))
            feeds.add(Feed("loreum ipsum ${random.nextLong()}"))
            feeds.add(Feed("loreum ipsum ${random.nextLong()}"))
            feeds.add(Feed("loreum ipsum ${random.nextLong()}"))
            feeds.add(Feed("loreum ipsum ${random.nextLong()}"))

            return feeds.toList()
        }
    }
}
