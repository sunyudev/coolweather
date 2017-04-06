package com.sy.coolweather.gson;

/**
 * Created by Sy on 2017/4/5 0005.
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;
        public String pm25;
    }
}
