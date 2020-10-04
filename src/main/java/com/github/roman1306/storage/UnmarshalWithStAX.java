package com.github.roman1306.storage;

import com.github.roman1306.storage.entity.Category;

import javax.xml.bind.*;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;
import java.util.ArrayList;
import java.util.List;

public class UnmarshalWithStAX {

    public static void main(String[] args) throws XMLStreamException, JAXBException {
        List<Category> categoryViewList = new ArrayList<>();
        XMLInputFactory factory = XMLInputFactory.newFactory();
        StreamSource xml = new StreamSource("src/main/resources/goods.xml");
        XMLStreamReader reader = factory.createXMLStreamReader(xml);

        JAXBContext jaxbContext = JAXBContext.newInstance(Category.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        JAXBElement<Category> jaxbElement;

        while (reader.getEventType() != XMLStreamConstants.END_DOCUMENT) {

            if (reader.hasName() && reader.getLocalName().equals("category")) {
                jaxbElement = unmarshaller.unmarshal(reader, Category.class);
                categoryViewList.add(jaxbElement.getValue());
            }
            reader.next();
        }

        System.out.println(categoryViewList);
        reader.close();
    }
}
