package com.github.roman1306.storage.entity;

import com.github.roman1306.storage.annotation.DateAdapter;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "storage")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Storage {

    @XmlElement(name = "category")
    private List<Category> categories;

    @XmlRootElement
    @XmlAccessorType(XmlAccessType.FIELD)
    @Data
    private static class Category {

        @XmlAttribute
        private String name;

        @XmlElement(name = "subcategory")
        private List<Subcategory> subcategories;

        @XmlRootElement
        @XmlAccessorType(XmlAccessType.FIELD)
        @Data
        private static class Subcategory {

            @XmlAttribute
            private String name;

            @XmlElement(name = "product")
            List<Product> products;

            @XmlRootElement
            @XmlAccessorType(XmlAccessType.FIELD)
            @Data
            private static class Product {

                private String maker;

                private String model;

                @XmlJavaTypeAdapter(DateAdapter.class)
                private Date productionDate;

                private String color;

                private Price price;

                @XmlRootElement
                @XmlAccessorType(XmlAccessType.FIELD)
                @Data
                private static class Price {

                    @XmlValue
                    @SerializedName("price")
                    private double cost;

                    @XmlAttribute
                    private String available;

                }
            }
        }
    }

}
