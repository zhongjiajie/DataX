package com.alibaba.datax.plugin.writer.elasticsearchwriter;

/**
 * Created by xiongfeng.bxf on 17/3/2.
 */
public class ESColumn {

    private String name;//: "appkey",

    private String type;//": "TEXT",

    private String timezone;

    private String fromFormat;

    private String toFormat;

    private Boolean array;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTimeZone(String timezone) {
        this.timezone = timezone;
    }

    public void setFromFormat(String fromFormat) {
        this.fromFormat = fromFormat;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getFromFormat() {
        return fromFormat;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Boolean isArray() {
        return array;
    }

    public void setArray(Boolean array) {
        this.array = array;
    }

    public Boolean getArray() {
        return array;
    }

    public String getToFormat() {
        return toFormat;
    }

    public void setToFormat(String toFormat) {
        this.toFormat = toFormat;
    }
}
