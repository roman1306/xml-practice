package com.github.roman1306.storage.service;

import com.github.roman1306.storage.entity.Storage;
import com.github.roman1306.storage.repository.ConverterStorageRepository;
import com.github.roman1306.storage.repository.ConverterStorageRepositoryImpl;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConverterStorageServiceImpl implements ConverterStorageService {

    ConverterStorageRepository converterStorage = new ConverterStorageRepositoryImpl();

    @Override
    public void convertXmlToJson(FileReader reader) {
        Storage storage = converterStorage.convertXmlToObject(reader);
        String json = converterStorage.convertObjectToJson(storage);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(
                "implementation/src/main/resources/converted_file/convertedXML.json"))){

            writer.write(json);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void convertJsonToXml(FileReader reader) {
        Storage storage = converterStorage.convertJsonToObject(reader);
        String xml = converterStorage.convertObjectToXml(storage);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(
                "implementation/src/main/resources/converted_file/convertedJSON.xml"))){

            writer.write(xml);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
