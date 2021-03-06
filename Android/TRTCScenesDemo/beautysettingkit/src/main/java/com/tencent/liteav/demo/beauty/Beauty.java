package com.tencent.liteav.demo.beauty;

import android.graphics.Bitmap;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;

import com.tencent.liteav.demo.beauty.model.BeautyInfo;
import com.tencent.liteav.demo.beauty.model.ItemInfo;
import com.tencent.liteav.demo.beauty.model.TabInfo;

public interface Beauty extends IBeautyKit {

    void setBeautyBik(@NonNull IBeautyKit beautyBik);
    void setBeautySpecialEffects(@NonNull TabInfo tabinfo, @IntRange(from = 0) int tabPosition, @NonNull ItemInfo itemInfo, @IntRange(from = 0) int itemPosition);
    void setBeautyStyleAndLevel(int style, int level);
    void setMotionTmplEnable(boolean enable);
    void fillingMaterialPath(@NonNull BeautyInfo beautyInfo);
    void setCurrentFilterIndex(@NonNull BeautyInfo beautyInfo, @IntRange(from = 0) int index);
    void clear();
    int getFilterProgress(@NonNull BeautyInfo beautyInfo, @IntRange(from = 0) int index);
    int getFilterSize(@NonNull BeautyInfo beautyInfo);
    ItemInfo getFilterItemInfo(@NonNull BeautyInfo beautyInfo, @IntRange(from = 0) int index);
    Bitmap getFilterResource(@NonNull BeautyInfo beautyInfo, @IntRange(from = 0) int index);
    BeautyInfo getDefaultBeauty();
}
