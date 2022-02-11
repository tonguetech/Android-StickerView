package com.knef.stickerview

import android.content.Context
import android.graphics.PointF
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.knef.stickerview.util.GifView

/**
 * Created by dastaniqbal on 03/07/2017.
 * ask2iqbal@gmail.com
 * 03/07/2017 3:33
 */

class StickerGifView : StickerView{
    private var gif_main: GifView? = null
    var xy = PointF()
    var size = PointF()
    var stickerPath: String? = null

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    override fun getMainView(): View? {
        if (gif_main == null) {
            gif_main = GifView(context)
        }
        return gif_main
    }

    override fun updateSize() {
        size = PointF(this.width.toFloat(), this.height.toFloat())
        Log.d("StickerGifView", "Size ${size.x}, ${size.y}")
    }

    override fun updateXY() {
        xy = PointF((x + measuredWidth / 2), (y + measuredHeight / 2))
        val pos = IntArray(2)
        getLocationOnScreen(pos)
        Log.d("StickerGifView", "LocationScreen ${pos[0]}, ${pos[1]}")
        Log.d("StickerGifView", "centerX= ${xy.x}, centerY= ${xy.y}")
        Log.d("StickerGifView", "measureW= ${measuredWidth}, measureH= ${measuredHeight}")
    }

    fun setGifPath(path: String) {
        this.stickerPath = path
        this.gif_main?.setGifPath(path)
        this.gif_main?.play()
    }
}
