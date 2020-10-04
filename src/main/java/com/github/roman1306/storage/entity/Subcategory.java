package com.github.roman1306.storage.entity;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Subcategory {

    @XmlAttribute
    private String name;

    @XmlElement(name = "product")
    List<Product> products;

    @Override
    public String toString() {
        return "\n\t\t\t" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
