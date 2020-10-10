package com.github.roman1306.storage.repository;

import com.github.roman1306.storage.entity.Storage;

import java.io.FileReader;

public interface ConverterStorageRepository {

    String convertObjectToXml(Storage storage);

    String convertObjectToJson(Storage storage);

    Storage convertXmlToObject(FileReader in);

    Storage convertJsonToObject(FileReader in);

}
