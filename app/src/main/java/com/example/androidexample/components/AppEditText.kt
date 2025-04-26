package com.example.androidexample

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class AppEditText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): AppCompatEditText(context, attrs, defStyleAttr) {
    init {
        styleText()
    }

    private fun styleText() {
        setPadding(32, 8, 8, 8)
        setBackgroundResource(R.drawable.bg_edit_text)
        typeface = Typeface.DEFAULT_BOLD
        textSize = 16f
        gravity = android.view.Gravity.CENTER_VERTICAL
    }
}