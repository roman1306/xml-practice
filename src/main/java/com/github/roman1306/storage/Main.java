package com.github.roman1306.storage;

import com.github.roman1306.storage.service.ConverterStorageService;
import com.github.roman1306.storage.service.ConverterStorageServiceImpl;

import javax.xml.bind.JAXBException;
import java.io.*;

public class Main {

    public static final String XML_FILE = "src/main/resources/goods.xml";
    public static final String JSON_FILE = "src/main/resources/goods.json";

    public static void main(String[] args) throws FileNotFoundException, JAXBException {

        ConverterStorageService storageService = new ConverterStorageServiceImpl();

        storageService.convertXmlToJson(new FileReader(new File(XML_FILE)));
        storageService.convertJsonToXml(new FileReader(new File(JSON_FILE)));

    }
}
