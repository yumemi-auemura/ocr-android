package com.github.auemura.ocr.ui.home

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Color
import android.graphics.ColorFilter
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat
import androidx.core.graphics.alpha
import com.airbnb.epoxy.TypedEpoxyController
import com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
import com.github.auemura.ocr.R
import com.github.auemura.ocr.viewHomeHeaderItem
import com.github.auemura.ocr.viewHomeItem

class HomeEpoxyController(private val context: Context) : TypedEpoxyController<List<String>>(), StickyHeaderCallbacks {

    override fun buildModels(data: List<String>?) {
        viewHomeHeaderItem {
            id(modelCountBuiltSoFar)
        }
        stickyItemEpoxyHolder {
            id(modelCountBuiltSoFar)
            title("Search")
            listener {}
        }
        data?.forEach {
            viewHomeItem {
                id(modelCountBuiltSoFar)
                title(it)
            }
        }
    }

    override fun isStickyHeader(position: Int): Boolean = adapter.getModelAtPosition(position) is StickyItemEpoxyHolder

    override fun setupStickyHeaderView(stickyHeader: View) {
        stickyHeader.elevation = 2f.toPx()
        stickyHeader.doAnimation(true)
    }

    private fun View.doAnimation(isSticky: Boolean) {
        val mlp = this.layoutParams as ViewGroup.MarginLayoutParams
        val searchView = this.findViewById<SearchView>(R.id.item_search_view)
        val start = 0f
        val end = 1f
        val frontColor = ContextCompat.getColor(context, R.color.F3ECE3)
        val backColor = ContextCompat.getColor(context, R.color.FFFFFF)
        ValueAnimator.ofFloat(start, end).also {
            it.setTarget(this)
            it.duration = 300
            it.interpolator = AccelerateDecelerateInterpolator()
            it.addUpdateListener { anim ->
                val animValue = anim.animatedValue as Float
                searchView.setBackgroundColor(frontColor)
                this.setBackgroundColor(backColor)
            }
        }.start()
    }

    private fun Float.toPx(): Float {
        val density = context.resources.displayMetrics.density
        return (this * density + 0.5f * if (this >= 0) 1 else -1)
    }
}
