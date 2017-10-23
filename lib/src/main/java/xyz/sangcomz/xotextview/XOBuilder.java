package xyz.sangcomz.xotextview;

import android.content.Context;

/**
 * Created by sangcomz on 24/10/2017.
 */

public class XOBuilder {
    private Context context;
    private XOTextView xoTextView;

    public static int STYLE_TITLE = 1;
    public static int STYLE_CONTENT = 2;
    public static int STYLE_COMMENT = 3;

    public static XOBuilder with(Context context, String content) {
        return new XOBuilder(context, content);
    }

    public XOBuilder(Context context, String content) {
        this.context = context;
        xoTextView = new XOTextView(context);
        xoTextView.setText(content);
    }

    public XOBuilder setTextSize(float size) {
        xoTextView.setTextSize(size);
        return this;
    }

    public XOBuilder setStyle(int style) {
        switch (style) {
            case 1: {
                xoTextView.setStyle(R.style.TitleTextStyle);
                break;
            }
            case 2: {
                xoTextView.setStyle(R.style.ContentTextStyle);
                break;
            }
            case 3: {
                xoTextView.setStyle(R.style.CommentTextStyle);
                break;
            }
        }
        return this;
    }

    public XOTextView get() {
        return xoTextView;
    }
}
