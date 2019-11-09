package com.harsh.androidrecyclerview.feed

import android.os.Parcel
import android.os.Parcelable
import com.harsh.androidrecyclerview.comment.Comment

data class Feed(
    val description: String,
    val comment: List<Comment> = listOf()
) : Parcelable {

    override fun writeToParcel(parcel: Parcel?, p1: Int) {
        parcel?.writeString(description)
        parcel?.writeList(comment)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Feed> {
        override fun createFromParcel(parcel: Parcel): Feed {
            val post = parcel.readString()
            val comments = arrayListOf<Comment>().apply {
                parcel.readArrayList(Comment::class.java.classLoader)
            }
            return Feed(post ?: "", comments)
        }

        override fun newArray(size: Int): Array<Feed?> {
            return arrayOfNulls(size)
        }
    }
}
