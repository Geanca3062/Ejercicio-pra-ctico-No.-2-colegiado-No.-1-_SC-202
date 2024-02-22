/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaquiz2;

/**
 *
 * @author gean3
 */
public class Controller {
    private int ID = 0;
    private String Titulo = "[Titulo]";
    private String Autor = "[Autor]";
    private String Duracion = "[0:00]";
    private String AnioC = "[0000]";

    
    
    public Controller(int NewID, String NewTitulo, String NewAutor, String NewDuracion, String NewAnioC){
        ID = NewID;
        Titulo = NewTitulo;
        Autor = NewAutor;
        Duracion = NewDuracion;
        AnioC = NewAnioC;
    }
    
    /*
    public NewCancion(int ID, String Titulo, String Autor, String Duracion, String AnioC){
        
    }*/
    
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getAnioC() {
        return AnioC;
    }

    public void setAnioC(String AnioC) {
        this.AnioC = AnioC;
    }
    
    
    
}
