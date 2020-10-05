package com.github.roman1306.storage.entity;

import com.github.roman1306.storage.annotation.DateAdapter;
import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Product {

    private String maker;

    private String model;

    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date productionDate;

    private String color;

    private Price price;
}
