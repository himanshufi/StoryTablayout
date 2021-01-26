package com.himanshu.storytablayout

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import com.himanshu.storytablayout.views.CustomTabView

class StoryTabLayout(context: Context,
                      attrs: AttributeSet?
): LinearLayout(context, attrs) {

    private var viewCount:Int = 0
    private val viewLayoutParam = LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f)

    init {
        orientation = HORIZONTAL
    }

    private fun bindViews() {
        removeAllViews()
        for (i in 0 until viewCount) {
            val bar = createBar(isSelected = i == 0 )
            addView(bar)
            invalidate()
        }
    }

    private fun createBar(isSelected: Boolean): CustomTabView {
        val bar = CustomTabView(context, isSelected)
        bar.layoutParams = viewLayoutParam
        return bar
    }

    fun setViewCount(count: Int) {
        viewCount = count
        bindViews()
    }

    fun setCurrentViewIndex(index: Int) {
        removeViewAt(index)
        addView(createBar(isSelected = true), index)

        if(index + 1 < viewCount) {
            removeViewAt(index + 1)
            addView(createBar(isSelected = false), index + 1)
        }
    }


}