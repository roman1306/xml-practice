package com.github.roman1306.storage.service;

import java.io.FileReader;

public interface ConverterStorageService {

    public void convertXmlToJson(FileReader reader);

    public void convertJsonToXml(FileReader reader);

}
