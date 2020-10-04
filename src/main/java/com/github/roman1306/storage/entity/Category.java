package com.github.roman1306.storage.entity;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Category {

    @XmlAttribute
    private String name;

    @XmlElement(name = "subcategory")
    private List<Subcategory> subcategories;

}
