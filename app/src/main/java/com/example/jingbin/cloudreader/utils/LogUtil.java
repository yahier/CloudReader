package com.example.jingbin.cloudreader.utils;

import android.util.Log;

/**
 * Created by yahier on 17/6/3.
 */

public class LogUtil {
    private static final int maxLength = 3000;

    public final static void e(String tag, String msg) {
        if (msg.length() > maxLength) {
            e(tag, msg.substring(0, maxLength));
            e(tag, msg.substring(maxLength));
        } else {
            Log.e(tag, msg);
        }

    }
}
