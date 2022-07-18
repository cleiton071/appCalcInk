package com.cleiton.appcalcink.data;

import android.content.Context;
import android.content.SharedPreferences;

public class Data {
    private SharedPreferences mSharedPreferences;

    public Data(Context mContext) {
        this.mSharedPreferences = mContext.getSharedPreferences("numberOfWalls", Context.MODE_PRIVATE);
    }

    public void storeString(String key, String value) {
        this.mSharedPreferences.edit().putString(key, value).apply();

    }

    public String getNumWalls() {
        return getStoreString("numberOfWalls");

    }

    public String getStoreString(String key) {
        return this.mSharedPreferences.getString(key, "");
    }

    public void setNumWalls(String value) {
        this.storeString("numberOfWalls", value);

    }
}
