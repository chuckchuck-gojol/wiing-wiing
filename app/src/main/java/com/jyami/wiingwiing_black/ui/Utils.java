package com.jyami.wiingwiing_black.ui;

import android.app.Activity;
import android.os.Build;

import androidx.core.content.ContextCompat;

import com.jyami.wiingwiing_black.R;

public class Utils {
    public static void setStatusBarColor(Activity activity, StatusBarColorType colorType) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            activity.getWindow().setStatusBarColor(ContextCompat.getColor(activity, colorType.getBackgroundColorId()));
        }
    }

    public enum StatusBarColorType {
        GREY_STATUS_BAR(R.color.statusGrey);

        private int backgroundColorId;

        StatusBarColorType(int backgroundColorId) {
            this.backgroundColorId = backgroundColorId;
        }

        public int getBackgroundColorId() {
            return backgroundColorId;
        }
    }
}