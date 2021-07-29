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

// add a stickerText to canvas
StickerGifView gifSticker = new StickerGifView(this);
gifSticker.setGifPath(stkrName);
String tag = String.valueOf(<tag> + 1);
gifSticker.setStickerTag(tag);
gifSticker.setOnSelectListener(stickerOperation);
canvas.addView(gifSticker);

//Sticker Listener
private IStickerOperation stickerOperation=new IStickerOperation() {
        @Override
        public void onSelect(@NotNull String tag) {
      
        }

        @Override
        public void onDelete(@NotNull String tag) {
      
        }
    };
```
Orignal GifView Repository : https://github.com/Cutta/GifView

# License
Copyright 2017 Iqbal Ahmed.

Copyright 2017 ken_cheung.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
