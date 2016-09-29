package com.android.svg.sample.drawables;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.android.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_assignment_returned extends SVGRenderer {

    public ic_assignment_returned(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(48.0f);
        mHeight = dip2px(48.0f);
    }

    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(19.0f, 3.0f);
        mPath.rLineTo(-4.18f, 0f);
        mPath.cubicTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        mPath.rCubicTo(-1.3f, 0.0f, -2.4f, 0.84f, -2.82f, 2.0f);
        mPath.lineTo(5.0f, 3.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 14.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(14.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(21.0f, 5.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(19.0f, 3.0f);
        mPath.moveTo(12.0f, 3.0f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        mPath.rCubicTo(0.0f, 0.54999995f, -0.45f, 1.0f, -1.0f, 1.0f);
        mPath.rCubicTo(-0.5500002f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        mPath.rCubicTo(0.0f, -0.5500002f, 0.45f, -1.0f, 1.0f, -1.0f);
        mPath.close();
        mPath.moveTo(12.0f, 3.0f);
        mPath.moveTo(12.0f, 18.0f);
        mPath.rLineTo(-5.0f, -5.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.lineTo(10.0f, 9.0f);
        mPath.rLineTo(4.0f, 0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.rLineTo(3.0f, 0f);
        mPath.rLineTo(-5.0f, 5.0f);
        mPath.close();
        mPath.moveTo(12.0f, 18.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16776961, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}