/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maincasacinematografica;

/**
 *
 * @author paolucci.sara
 */
public class Attore extends Membro {
    private String ruolo;
    
    public Attore(String n, String c, String r){
        super(n,c);
        this.ruolo = r;
    }
    
}
