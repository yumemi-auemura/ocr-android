package com.github.auemura.ocr.ext

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

fun <T : ViewDataBinding> Fragment.viewBinding(): ReadOnlyProperty<Fragment, T> {
    return object : ReadOnlyProperty<Fragment, T> {
        override fun getValue(thisRef: Fragment, property: KProperty<*>): T {
            val view = thisRef.requireView()
            return requireNotNull(DataBindingUtil.bind<T>(view)).apply {
                lifecycleOwner = viewLifecycleOwner
            }
        }
    }
}
