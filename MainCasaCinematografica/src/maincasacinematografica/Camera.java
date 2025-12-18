/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maincasacinematografica;

/**
 *
 * @author sarap
 */
public class Camera extends Produzione {
    private Tipo tipo;
    private int batteria;
    
    public Camera(int l,double c,Tipo t){
        super(l,c);
        this.tipo = t;
        this.batteria = 100;
    }
    
    public void danni(){
        luce -=5;
        batteria = 10;
    }
    
}
