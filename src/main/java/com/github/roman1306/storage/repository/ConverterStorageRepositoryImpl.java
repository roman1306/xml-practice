package com.github.roman1306.storage.repository;

import com.github.roman1306.storage.entity.Storage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class ConverterStorageRepositoryImpl implements ConverterStorageRepository {

    JAXBContext jaxbContext;

    @Override
    public Storage convertXmlToObject(FileReader in) {
        Storage storage = null;

        try {
            jaxbContext = JAXBContext.newInstance(Storage.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            storage = (Storage) unmarshaller.unmarshal(in);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return storage;
    }

    @Override
    public Storage convertJsonToObject(FileReader in) {

        JsonReader jsonReader = new JsonReader(in);
        Gson gson = new Gson();
        return gson.fromJson(jsonReader, Storage.class);
    }

    @Override
    public String convertObjectToXml(Storage storage) {
        Writer outputStream = new StringWriter();

        try {
            jaxbContext = JAXBContext.newInstance(Storage.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(storage, outputStream);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return outputStream.toString();
    }

    @Override
    public String convertObjectToJson(Storage storage){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        gsonBuilder.disableHtmlEscaping();
        gsonBuilder.setDateFormat("yyyy-MM-dd");

        Gson gson = gsonBuilder.create();
        return gson.toJson(storage, Storage.class);
    }
}
