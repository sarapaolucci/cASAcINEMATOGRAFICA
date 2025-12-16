/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maincasacinematografica;

/**
 *
 * @author sarap
 */
public class Produzione {
    private boolean operativo;
    private double costo;
    private int luce;
    protected int qualita;
    
    public Produzione(int l,double c){
        this.operativo = true;
        this.luce = l;
    }
    
    public void setCosto(double c){
        this.costo = c;
    }
    
    public void setQualita(int q){
        this.qualita = q;
    }
    
    public int getQualita(){
        return this.qualita;
    }
    
    public void setOperativo(boolean o){
        this.operativo = o;
    }
    
    public void rottura(){
        setOperativo(false);
    }
    
    public void danni(){
        this.luce -=5;
    }
    
}
