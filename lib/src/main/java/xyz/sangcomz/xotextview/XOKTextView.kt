package xyz.sangcomz.xotextview

import android.content.Context
import android.os.Build
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet

/**
 * Created by sangcomz on 24/10/2017.
 */
class XOKTextView : AppCompatTextView {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        val a = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.XOKTextView,
                0, 0)
        try {
            when (a.getInteger(R.styleable.XOKTextView_textStyleKT, 0)) {
                1 -> {
                    setStyle(R.style.TitleTextStyle)
                }
                2 -> {
                    setStyle(R.style.ContentTextStyle)
                }
                3 -> {
                    setStyle(R.style.CommentTextStyle)
                }
            }
        } finally {
            a.recycle()
        }
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    private fun setStyle(resId: Int) {
        if (Build.VERSION.SDK_INT < 23) {
            setTextAppearance(this.context, resId)
        } else {
            setTextAppearance(resId)
        }
    }


}