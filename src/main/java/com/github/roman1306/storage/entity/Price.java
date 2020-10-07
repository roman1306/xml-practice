package com.github.roman1306.storage.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Price {

    @XmlValue
    @SerializedName("price")
    private double cost;

    @XmlAttribute
    private String available;

}
