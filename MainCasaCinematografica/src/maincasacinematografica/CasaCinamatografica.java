/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maincasacinematografica;
import java.util.ArrayList;
/**
 *
 * @author sarap
 */
public class CasaCinamatografica {
    private ArrayList <Film> film = new ArrayList<>();
    
    public void aggiungiFilm(Film m){
        if(m != null && film.contains(m)== false){
            film.add(m);
        }
    }
    
    public void rimuoviFilm(Film m){
        if(m != null && film.contains(m)== true){
            film.remove(m);
        }
    }
    
}
