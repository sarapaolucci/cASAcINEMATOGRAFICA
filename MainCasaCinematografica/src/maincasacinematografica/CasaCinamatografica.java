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
    private ArrayList <Membro> membri = new ArrayList<>();
    private ArrayList <Produzione> prodotti = new ArrayList<>();
    
    public void aggiungiMembro(Membro m){
        if(m != null && membri.contains(m)== false){
            membri.add(m);
        }
    }
    
    public void aggiungiProdotto(Produzione p){
        if(p != null && prodotti.contains(p)== false){
            prodotti.add(p);
        }
    }
    
    public void rimuoviMembro(Membro m){
        if(m != null && membri.contains(m)== true){
            membri.remove(m);
        }
    }
    
    public void rimuoviProdotto(Produzione p){
        if(p != null && prodotti.contains(p)== true){
            prodotti.remove(p);
        }
    }
    
}
