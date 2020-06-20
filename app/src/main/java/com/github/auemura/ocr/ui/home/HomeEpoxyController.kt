package com.github.auemura.ocr.ui.home

import android.content.Context
import android.widget.Toast
import com.airbnb.epoxy.TypedEpoxyController
import com.airbnb.epoxy.stickyheader.StickyHeaderCallbacks
import com.github.auemura.ocr.viewHomeItem
import com.github.auemura.ocr.viewHomeLogo

class HomeEpoxyController(private val context: Context) : TypedEpoxyController<List<String>>(), StickyHeaderCallbacks {

    override fun buildModels(data: List<String>?) {
        viewHomeLogo {
            id(modelCountBuiltSoFar)
        }
        for (i in 0 until 100) {
            when {
                i % 5 == 0 -> {
                    stickyItemEpoxyHolder {
                        id(modelCountBuiltSoFar)
                        title("Header_$i")
                        listener {
                            Toast.makeText(context, "Clicked Header_$i", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
                else -> {
                    viewHomeItem {
                        id(modelCountBuiltSoFar)
                        title("$i")
                    }
                }
            }
        }
    }

    override fun isStickyHeader(position: Int): Boolean = adapter.getModelAtPosition(position) is StickyItemEpoxyHolder
}
