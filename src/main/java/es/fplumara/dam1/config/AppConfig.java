package es.fplumara.dam1.config;

import es.fplumara.dam1.exceptions.ConfigException;
import es.fplumara.dam1.files.StoreType;
import es.fplumara.dam1.model.Message;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.*;
import java.nio.file.*;
import java.util.Properties;

public class AppConfig {
    // atributos de la configuracion

    private StoreType storeType;
    private String messagesFile;  //
    private int maxlength;  //tamaño del  texto

    // constructor
    public AppConfig() throws ConfigException{

        Path path = Path.of("data/config.properties");// lee el archivo fuera de java/src/...

        Properties props = new Properties();   // crea una instancia u objeto

        try (InputStream in = Files.newInputStream(path)) {

            props.load(in);
        } catch (IOException e){
            throw new ConfigException("no se encontro el archivo config.properties");
            //si arriba declaro 'throw ConfigException', es necesario?
        }
        // falta más condicionales... para reconocer y valdidar


    }
    // metodos de AppConfig

    public StoreType getStoreType(){ // devuelve el tipo de almacenamiento

        return storeType;
    }

    public String getMessagesFile(){

        return messagesFile;
    }

    public int getMaxlength(){

        return maxlength;
    }

}
