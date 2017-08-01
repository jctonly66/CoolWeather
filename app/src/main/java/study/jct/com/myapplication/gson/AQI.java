package study.jct.com.myapplication.gson;

/**
 * Created by 10764 on 2017/8/1.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
