package com.zkw.sourcecode.bean;

import org.springframework.stereotype.Component;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-11 下午 8:54
 **/
@Component
public class Phone {
    private String brand;
    private String version;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
