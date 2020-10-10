package com.github.roman1306.storage;

import com.github.roman1306.storage.service.ConverterStorageService;
import com.github.roman1306.storage.service.ConverterStorageServiceImpl;

import java.io.*;
import java.util.Properties;

public class Implementation {

    public static void main( String[] args ) {
        ConverterStorageService storageService = new ConverterStorageServiceImpl();

        try {
            storageService.convertXmlToJson(new FileReader(getProperties().getProperty("path.xml")));
            storageService.convertJsonToXml(new FileReader(getProperties().getProperty("path.json")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Properties getProperties() {
        ClassLoader classLoader = Implementation.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("app.properties");
        Properties properties = new Properties();

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }
}
