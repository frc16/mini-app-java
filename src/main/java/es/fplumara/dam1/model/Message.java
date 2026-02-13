package es.fplumara.dam1.model;

import java.time.Instant;

public class Message {

    //atributos de la clase
    private String text;
    private Instant timestamp;
    private int wordCount;

    // contrcutor (recibe datos tipo String "texto")
    public Message(String text){

        this.text = text; // para guardar texto?
        this.timestamp = Instant.now();  // este metodo sirve para registrar el tiempo transcurrido
        this.wordCount = calculateWordCount();
    }

    // metodo para calcular palabras
    private int calculateWordCount() {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // sirve para dividir por espacios y cuenta la cantidad de palabras
        String[] words = text.trim().split("\\s+"); // "\\s+" sirve para identificar espacios hasta mas de 1, esto trabaja con el "split".
        return words.length;
    }

    //getter para texto

    public String getText(){
        return text;
    }

    // getter para timestamp "tiempo de registro o algo asi xd"
    public Instant getTimestamp(){
        return timestamp;
    }

    // getter para wordCount "para contar palabras"
    public int getWordCount(){
        return wordCount;
    }

    @Override

    public String toString(){
        return "Message{" + "text='" + text + '\'' +
                ", timestamp=" + timestamp +
                ", wordCount=" + wordCount + '}';
    }


}