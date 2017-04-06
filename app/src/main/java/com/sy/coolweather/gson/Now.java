package com.sy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sy on 2017/4/5 0005.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
