package com.harsh.androidrecyclerview

import android.app.Dialog
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class FeedDetailFragment : BottomSheetDialogFragment() {

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(CoordinatorLayout.LayoutParams.MATCH_PARENT, CoordinatorLayout.LayoutParams.MATCH_PARENT)
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        super.setupDialog(dialog, style)

        val comment = arguments?.getString("feed")
        val view = LayoutInflater.from(context)
            .inflate(R.layout.feed_detail, null)

        val tvComment = view.findViewById<TextView>(R.id.tv_comment)
        tvComment.text = comment

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
                            else -> { }
                        }
                    }

                    override fun onSlide(view: View, v: Float) { }
                })
            }
        }
    }
}
