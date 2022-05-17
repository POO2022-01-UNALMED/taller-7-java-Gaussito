package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        return letras.length;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public String toString(){
        String todo_alfabeto = "";
        for ( int i = 0; i < letras.length; i++){
            if ( i != letras.length - 1 ){
                todo_alfabeto += letras[i] + ", ";
            } else {
                todo_alfabeto += letras[i];
            }
        }
        return todo_alfabeto;
    }

}
