package com.github.auemura.ocr.ui.home

import com.airbnb.epoxy.TypedEpoxyController
import com.github.auemura.ocr.viewHomeItem

class HomeEpoxyController : TypedEpoxyController<List<String>>() {

    override fun buildModels(data: List<String>?) {
        data?.forEach {
            viewHomeItem {
                id(modelCountBuiltSoFar)
                title(it)
            }
        }
    }
}
