package com.github.roman1306.storage.repository;

import com.github.roman1306.storage.entity.Storage;

import java.io.FileReader;

public interface ConverterStorageRepository {

    public String convertObjectToXml(Storage storage);

    public String convertObjectToJson(Storage storage);

    public Storage convertXmlToObject(FileReader in);

    public Storage convertJsonToObject(FileReader in);

}
