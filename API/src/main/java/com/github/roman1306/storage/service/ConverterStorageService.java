package com.github.roman1306.storage.service;

import java.io.FileReader;

public interface ConverterStorageService {

    void convertXmlToJson(FileReader reader);

    void convertJsonToXml(FileReader reader);

}
