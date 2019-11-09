package com.harsh.androidrecyclerview.comment

import android.os.Parcel
import android.os.Parcelable


data class Comment(val value: String): Parcelable {
    override fun writeToParcel(parcel: Parcel?, p1: Int) {
        parcel?.writeString(value)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Comment> {
        override fun createFromParcel(parcel: Parcel): Comment {
            return Comment(parcel.readString() ?: "")
        }

        override fun newArray(size: Int): Array<Comment?> {
            return arrayOfNulls(size)
        }
    }
}
