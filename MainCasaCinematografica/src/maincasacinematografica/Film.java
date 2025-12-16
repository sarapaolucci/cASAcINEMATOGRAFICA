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
public class Film {
    private double durata;
    private ArrayList <Membro>  membri = new ArrayList<>();
    private ArrayList <Produzione> prodotti = new ArrayList<>();
    private double budget;
    private int qualita;
    private Genere genere;
    
    public Film(double b, Genere g){
        this.budget = b;
        this.genere = g;
    }
    
    public void setBudget(double b){
        this.budget = b;
    }
    
    public void setDurata(double d){
        this.durata = d;
    }
    
    public void aggiungiMembro(Membro m){
        if(membri.contains(m) == false || m != null){
            membri.add(m);
        }
    }
    
    public void eliminaMembro(Membro m){
        if(membri.contains(m) == true){
            membri.remove(m);
        }
    }
    
    public void aggiungiProdotto(Produzione p){
        if(p != null && prodotti.contains(p)== false){
            prodotti.add(p);
        }
    }
    
    public void rimuoviProdotto(Produzione p){
        if(p != null && prodotti.contains(p)== true){
            prodotti.remove(p);
        }
    }
}
