/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maincasacinematografica;

/**
 *
 * @author sarap
 */
public class Set extends Produzione {
    private Luogo luogo;
    private boolean costumi;
    
    public Set(int l,double c, Luogo lu){
        super(l,c);
        this.costumi = true;
        this.luogo = lu;
    }
    
    public void setCostumi(boolean c){
        this.costumi = c;
    }
    
    public void danni(){
        setCostumi(false);
    }
}
