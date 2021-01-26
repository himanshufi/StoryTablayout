package com.himanshu.storytablayout.views

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import com.himanshu.storytablayout.R

class CustomTabView(context: Context, select: Boolean): FrameLayout(context, null) {

    private var view: View

    init {
        LayoutInflater.from(context).inflate(R.layout.custom_tab_view, this)
        view = findViewById(R.id.threadProgressView)

        view.setBackgroundColor(
            ContextCompat.getColor(
            context,
            if(select) android.R.color.white else android.R.color.darker_gray
        ))
    }

}