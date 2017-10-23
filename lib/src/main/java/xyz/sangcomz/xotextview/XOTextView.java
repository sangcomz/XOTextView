package xyz.sangcomz.xotextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by sangcomz on 21/10/2017.
 */

public class XOTextView extends AppCompatTextView {
    public XOTextView(Context context) {
        super(context);
    }

    public XOTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.XOTextView,
                0, 0);
        try {
            switch (a.getInteger(R.styleable.XOTextView_textStyle, 0)) {
                case 1: {
                    setStyle(R.style.TitleTextStyle);
                    break;
                }
                case 2: {
                    setStyle(R.style.ContentTextStyle);
                    break;
                }
                case 3: {
                    setStyle(R.style.CommentTextStyle);
                    break;
                }
            }
        } finally {
            a.recycle();
        }
    }

    public XOTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setStyle(int resId) {
        if (Build.VERSION.SDK_INT < 23) {
            setTextAppearance(this.getContext(), resId);
        } else {
            setTextAppearance(resId);
        }
    }
}