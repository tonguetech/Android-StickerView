package com.knef.stickerview

interface IStickerOperation {
    fun onSelect(tag: String)
    fun onDelete(tag: String)
}