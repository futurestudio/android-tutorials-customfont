package io.futurestud.tutorials.customfont;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by norman on 3/8/15.
 */
public class CustomFontTextView extends TextView {

    public static final String ANDROID_SCHEMA = "http://schemas.android.com/apk/res/android";

    public CustomFontTextView(Context context) {
        super(context);

        applyCustomFont(context, null);
    }

    public CustomFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context, attrs);
    }

    public CustomFontTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context, attrs);
    }

    private void applyCustomFont(Context context, AttributeSet attrs) {
        int textStyle = attrs.getAttributeIntValue(ANDROID_SCHEMA, "textStyle", 0);

        Typeface customFont;

        /*
         information about the TextView textStyle:
         http://developer.android.com/reference/android/R.styleable.html#TextView_textStyle
          */
        switch (textStyle) {
            case 1: // bold
                customFont = FontCache.getTypeface("SourceSansPro-Bold.ttf", context);
                break;

            case 2: // italic
                customFont = FontCache.getTypeface("SourceSansPro-Italic.ttf", context);
                break;

            case 0: // regular
            default:
                customFont = FontCache.getTypeface("SourceSansPro-Regular.ttf", context);

        }

        setTypeface(customFont);
    }
}