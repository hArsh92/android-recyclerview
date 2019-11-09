package com.harsh.androidrecyclerview

import android.app.Dialog
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.harsh.androidrecyclerview.comment.Comment
import com.harsh.androidrecyclerview.comment.CommentAdapter

class FeedDetailFragment : BottomSheetDialogFragment() {

    override fun setupDialog(dialog: Dialog, style: Int) {
        super.setupDialog(dialog, style)

        val comments = arguments?.getParcelableArrayList<Comment>("feed")
        val view = LayoutInflater.from(context).inflate(R.layout.feed_detail, null)


        val rvComments = view.findViewById<RecyclerView>(R.id.rv_comments)
        rvComments?.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rvComments?.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )
        rvComments?.adapter = CommentAdapter(comments!!.toList())

        dialog.setContentView(view)

        val params = (view.parent as View).layoutParams as CoordinatorLayout.LayoutParams
        val behavior = params.behavior
        behavior?.let {
            if (behavior is BottomSheetBehavior) {
                behavior.state = BottomSheetBehavior.STATE_EXPANDED
                behavior.peekHeight = Resources.getSystem().displayMetrics.heightPixels
                behavior.setExpandedOffset(50)

                behavior.addBottomSheetCallback(object :
                    BottomSheetBehavior.BottomSheetCallback() {
                    override fun onStateChanged(view: View, i: Int) {
                        when (i) {
                            BottomSheetBehavior.STATE_HIDDEN -> dialog.dismiss()
                            BottomSheetBehavior.STATE_HALF_EXPANDED -> dialog.dismiss()
                            else -> {
                            }
                        }
                    }

                    override fun onSlide(view: View, v: Float) {}
                })
            }
        }
    }
}
