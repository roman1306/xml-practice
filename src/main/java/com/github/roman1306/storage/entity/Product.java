package com.github.roman1306.storage.entity;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Product {

    private String maker;

    private String model;

    private String productionDate;

    private String color;

    private Price price;

}
