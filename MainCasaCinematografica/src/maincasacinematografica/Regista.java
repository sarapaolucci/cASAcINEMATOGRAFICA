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
public class Regista extends Membro{
    
    Random random = new Random();
    
    public Regista(String n, String c,double co, int e){
        super(n,c,co,e);
    }
    
    public void Registra(){
        int soglia = 0;
        if(esperienza > 8){
            soglia = 90;
        }
        else{
            soglia = 50;
        }
        int r = random.nextInt(101);
        if(r < soglia){
            qualita = 10;
        }
        else{
            qualita = 5;
        }
    }
    
}
