/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaquiz2;

import javax.swing.JOptionPane;

/**
 *
 * @author gean3
 */
public class PracticaQuiz2 {
    public static void Menu(){
        int ID = Integer.parseInt(JOptionPane.showInputDialog("ID de la cancion"));
        String Titulo = JOptionPane.showInputDialog("Titulo de la cancion");
        String Autor = JOptionPane.showInputDialog("Autor de la cancion");
        String Duracion = JOptionPane.showInputDialog("Duracion de la cancion");
        String AnioC = JOptionPane.showInputDialog("Anio de cracion de la cancion");
        Play(ID, Titulo, Autor, Duracion, AnioC);
        
    }  
    
    public static void Change(){
        String anw = JOptionPane.showInputDialog("Desea cambiar la cancion?\n                                [S/N]");
        if (anw.compareTo("S") == 0){
            Menu();
        }
    }
    
    public static void Play(int ID, String Titulo, String Autor, String Duracion, String AnioC){
        //JOptionPane.showMessageDialog(null, ID + Titulo + Autor + Duracion + AnioC);
        Controller Song = new Controller(ID, Titulo, Autor, Duracion, AnioC);
        /*String Prev = "ID: " + Song.getID() + "\nTitulo: " + Song.getTitulo() + "\nAutor: " + Song.getAutor() + "\nDuracion: " + Song.getDuracion() + "\nAnio de cracion: " + Song.getAnioC();
        Song.setID(ID);
        Song.setTitulo(Titulo);
        Song.setAutor(Autor);
        Song.setDuracion(Duracion);
        Song.setAnioC(AnioC);*/
        
        JOptionPane.showMessageDialog(null, "Cancion seleccionada: \nID: " + Song.getID() + "\nTitulo: " + Song.getTitulo() + "\nAutor: " + Song.getAutor() + "\nDuracion: " + Song.getDuracion() + "\nAnio de cracion: " + Song.getAnioC());
        Change();
    }
    
    
    public static void main(String[] args) {
        Menu();
        
        JOptionPane.showMessageDialog(null, "Esperamos que disfrutara la experiencia! \n          ヾ(⌐■_■)ノ♪ ( ﾟдﾟ)つ Bye");
        
        
    }
    
}
