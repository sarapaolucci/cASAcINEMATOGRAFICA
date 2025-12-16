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
    private int anni;
    private int batteria;
    private int microfoni;
    
    public Camera(int l,double c,Tipo t, int m){
        super(l,c);
        this.tipo = t;
        this.microfoni = m;
    }
    
}
