package com.baidu.apistore.sdk.weather;

/**
 * Created by peter on 16/5/15.
 */
public class Sport {
    private String brf;

    private String txt;

    public void setBrf(String brf) {
        this.brf = brf;
    }

    public String getBrf() {
        return this.brf;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getTxt() {
        return this.txt;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "brf='" + brf + '\'' +
                ", txt='" + txt + '\'' +
                '}';
    }
}