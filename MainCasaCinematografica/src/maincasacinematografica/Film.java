/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maincasacinematografica;
import java.util.ArrayList;
import java.util.Random;

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
    
    Random random = new Random();
    
    public Film(double b, Genere g){
        this.budget = b;
        this.genere = g;
    }
    
    public ArrayList<Membro> getMembri(){
        return this.membri;
    }
    
    public ArrayList<Produzione> getProdotti(){
        return this.prodotti;
    }
    
    public void diminuisciBudget(double b){
        this.budget -= b;
    }
    
    public void setQualita(int q){
        this.qualita = q;
    }
    
    public double getBudget(){
        return this.budget;
    }
    
    public double getDurata(){
        return this.durata;
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
    
    public void durataScena(){
        durata += random.nextDouble(10.0, 31.0);
    }

    
}
