package study.jct.com.myapplication.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 10764 on 2017/8/1.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
