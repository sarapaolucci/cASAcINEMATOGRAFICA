/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maincasacinematografica;
import java.util.Random;
/**
 *
 * @author paolucci.sara
 */
public class Attore extends Membro {
    private String ruolo;
    Random random = new Random();
    public Attore(String n, String c, String r, double co, int e){
        super(n,c,co,e);
        this.ruolo = r;
    }
    
    public void infortunio(){
        if(ruolo.equals("protagonista")== true){
            setSalute(false);
        }
        else{
            esperienza--;
        }
    }
    
    public void recita(){
        if(esperienza > 8){
            int r = random.nextInt(101);
            if(r > 20){
                
            }
        }
        else{
            
        }
    }
}
