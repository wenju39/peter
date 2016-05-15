package com.baidu.apistore.sdk.weather;

/**
 * Created by peter on 16/5/15.
 */
public class Now {

    @Override
    public String toString() {
        return "Now{" +
                "cond=" + cond +
                ", fl='" + fl + '\'' +
                ", hum='" + hum + '\'' +
                ", pcpn='" + pcpn + '\'' +
                ", pres='" + pres + '\'' +
                ", tmp='" + tmp + '\'' +
                ", vis='" + vis + '\'' +
                ", wind=" + wind +
                '}';
    }

    private Cond cond;

    private String fl;

    private String hum;

    private String pcpn;

    private String pres;

    private String tmp;

    private String vis;

    private Wind wind;

    public void setCond(Cond cond) {
        this.cond = cond;
    }

    public Cond getCond() {
        return this.cond;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public String getFl() {
        return this.fl;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getHum() {
        return this.hum;
    }

    public void setPcpn(String pcpn) {
        this.pcpn = pcpn;
    }

    public String getPcpn() {
        return this.pcpn;
    }

    public void setPres(String pres) {
        this.pres = pres;
    }

    public String getPres() {
        return this.pres;
    }

    public void setTmp(String tmp) {
        this.tmp = tmp;
    }

    public String getTmp() {
        return this.tmp;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    public String getVis() {
        return this.vis;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Wind getWind() {
        return this.wind;
    }

}
