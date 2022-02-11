package com.knef.stickerview

import android.view.View
import java.util.*

/**
 * Created by dastaniqbal on 04/07/2017.
 * ask2iqbal@gmail.com
 * 04/07/2017 4:49
 */

class AllStickers {
    val stickerViewStickers = HashMap<String, View>()
    var currentSticker: StickerView? = null
        private set

    fun addInStickerViewList(obj: String, view: View) {
        stickerViewStickers.put(obj, view)
    }

    fun clearStickerViewList() {
        stickerViewStickers.clear()
    }

    fun selectUnselectGifSticker(tag: String) {
        for ((_, value) in stickerViewStickers) {
            val view = value as StickerView
            if (view.stickerTag == tag) {
                view.select(true)
                currentSticker = view
            } else {
                view.select(false)
            }
        }
    }

    fun lockUnlockStickers(islock: Boolean) {
        for ((_, value) in stickerViewStickers) {
            val view = value as StickerView
            view.select(!islock)
        }
    }

    fun getStickersHashMap(): TreeMap<Float, ArrayList<StickerView>> {
        //Collections.sort<Sticker>(stickers)
        val hashMap = TreeMap<Float, ArrayList<StickerView>>()
        for ((_, value) in stickerViewStickers) {
            val view = value as StickerView
            view.setVisible(false)
            val truncateLast2Digit = (view.durationStart - view.durationStart % 100) / 100
            val exitStickers = hashMap[truncateLast2Digit]
            if (exitStickers != null && exitStickers.size > 0) {
                exitStickers.add(view)
                hashMap.put(truncateLast2Digit, exitStickers)
            } else {
                val stickerList = ArrayList<StickerView>()
                stickerList.add(view)
                hashMap.put(truncateLast2Digit, stickerList)
            }
        }
        return hashMap
    }

    fun showOrHideStickers(isShow: Boolean) {
        for ((_, value) in stickerViewStickers) {
            val view = value as StickerView
            view.setVisible(isShow)
        }
    }

    fun removeSticker(tag: String) {
        stickerViewStickers.remove(tag)
    }
}
