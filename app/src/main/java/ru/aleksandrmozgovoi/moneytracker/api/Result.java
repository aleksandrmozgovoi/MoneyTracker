package ru.aleksandrmozgovoi.moneytracker.api;

import android.text.TextUtils;

/**
 * Created by AleksandrMozgovoy on 03.07.2017.
 */

public class Result {
    String status;

    public boolean isSuccess() {
        return TextUtils.equals(status, "success");
    }
}