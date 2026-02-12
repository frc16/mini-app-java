package es.fplumara.dam1.files;

import es.fplumara.dam1.config.AppConfig;
import es.fplumara.dam1.exceptions.StoreException;
import es.fplumara.dam1.model.Message;

public class FileTextStore implements TextStore {

    //atributo
    private AppConfig appConfig;

    //constructor recibe el atributo "AppConfig" y lo guarda

    public FileTextStore(AppConfig appConfig){

        this.appConfig = appConfig;

    }

    @Override
    public void save(Message message) throws StoreException {
        try{
            // obtener la ruta del fichero

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public String readAll() {
        return "";
    }

    @Override
    public String readLast(int n) {

        return null;
    }
}
