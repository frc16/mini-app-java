package es.fplumara.dam1.files;

import es.fplumara.dam1.exceptions.StoreException;
import es.fplumara.dam1.model.Message;

import java.io.File;
import java.io.FileWriter;

public class CsvTextStore  implements TextStore{
    private final String filePath;

    private static final String HEADER_TIMESTAMP = "timestamp";
    private static final String HEADER_WORD_COUNT = "wordCount";
    private static final String HEADER_TEXT = "text";

    /*constructor
     filePath ruta del archivo
     */
    public CsvTextStore(String filePath){
        this.filePath = filePath;
    }

    // escritura de metodos.
    @Override
    public void save(Message message) throws StoreException {
        try{
            File file = new File(filePath);
            boolean fileExists = file.exists() && file.length() > 0;

            // modo para añadir al final
            FileWriter fileWriter = new FileWriter(file, true);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String readAll() throws StoreException{

        try{

            File file = new File(filePath);
            if(!file.exists()){
                throw new StoreException("el archivo CSV no existe" + filePath);
            }
        }catch (Exception e) {
            throw new StoreException("error al leer el archivo CSV: " + filePath);
        }
        return ;
    }

    @Override
    public String readLast(int n) {
        return "";
    }
}
