# android-StickerView

## Description
StickerView is a android UI library that make you able to use
Single hand gesture to rotate, scale and flip the ‘sticker’.


![alt tag](/demo.gif)


## Usage

The usage is simple, just like adding a child view.
For example, if you have an activity:

```java
FrameLayout canvas = findViewById(R.id.vg_canvas); 

//……

// add a stickerImage to canvas
StickerImageView iv_sticker = new StickerImageView(getContext());
iv_sticker.setImageDrawable(((ImageView)view.findViewById(R.id.iv_sticker)).getDrawable());
canvas.adView(iv_sticker);

// add a stickerText to canvas
StickerTextView tv_sticker = new StickerTextView(getContext());
tv_sticker.setText(“call me baby”);
canvas.addView(tv_sticker);
```
