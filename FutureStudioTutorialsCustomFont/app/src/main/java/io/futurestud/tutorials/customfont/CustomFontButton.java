package io.futurestud.tutorials.customfont;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by norman on 3/8/15.
 */
public class CustomFontButton extends Button {

    public CustomFontButton(Context context) {
        super(context);

        CustomFontUtils.applyCustomFont(this, context, null);
    }

    public CustomFontButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        CustomFontUtils.applyCustomFont(this, context, attrs);
    }

    public CustomFontButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        CustomFontUtils.applyCustomFont(this, context, attrs);
    }
}