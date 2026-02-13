package es.fplumara.dam1.files;

import es.fplumara.dam1.model.Message;

public interface TextStore { //en las interfaces te dice que metodo se deben o pueden usar, pero no se implementa

    //metodo para guardar mensaje
    public void save(Message message);

    //metodo para leer todo el texto
    public void readAll();

    //metodo para leer las ultimas n lineas
    public String readLast(int n);

}
