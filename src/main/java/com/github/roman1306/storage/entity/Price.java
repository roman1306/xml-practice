package com.github.roman1306.storage.entity;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Price {

    @XmlValue
    private double cost;

    @XmlAttribute
    private String available;

}
