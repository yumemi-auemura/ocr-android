package com.github.auemura.ocr.ui.home

import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.github.auemura.ocr.R
import com.github.auemura.ocr.common.KotlinEpoxyHolder

@EpoxyModelClass(layout = R.layout.view_home_search_item)
abstract class StickyItemEpoxyHolder : EpoxyModelWithHolder<StickyItemEpoxyHolder.StickyHolder>() {

    @EpoxyAttribute
    lateinit var listener: () -> Unit

    @EpoxyAttribute
    lateinit var title: String

    override fun bind(holder: StickyHolder) {
        holder.titleView.text = title
        holder.titleView.setOnClickListener { listener() }
    }

    class StickyHolder : KotlinEpoxyHolder() {
        val titleView by bind<TextView>(R.id.title_text_view)
    }
}
