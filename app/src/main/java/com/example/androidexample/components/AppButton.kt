package com.example.androidexample

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.example.androidexample.R

class AppButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatButton(context, attrs, defStyleAttr) {

    enum class Variation {
        PRIMARY, SECONDARY
    }

    private var variation: Variation = Variation.PRIMARY

    init {
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.AppButton,
            0, 0
        ).apply {
            try {
                val variationValue = getInt(R.styleable.AppButton_variation, 0)
                variation = if (variationValue == 1) Variation.SECONDARY else Variation.PRIMARY
            } finally {
                recycle()
            }
        }

        applyStyle()
    }

    private fun applyStyle() {
        when (variation) {
            Variation.PRIMARY -> {
                setBackgroundResource(R.drawable.bg_primary_button)
                setTextColor(ContextCompat.getColor(context, R.color.white))
            }
            Variation.SECONDARY -> {
                setBackgroundResource(R.drawable.bg_secondary_button)
                setTextColor(ContextCompat.getColor(context, R.color.black))
            }
        }
        gravity = android.view.Gravity.CENTER
        textSize = 16f
        typeface = Typeface.DEFAULT_BOLD
    }
}
