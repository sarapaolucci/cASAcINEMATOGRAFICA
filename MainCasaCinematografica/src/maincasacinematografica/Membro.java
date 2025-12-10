/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maincasacinematografica;

/**
 *
 * @author paolucci.sara
 */
public class Membro {
    private String nome;
    private String cognome;
    private double costo;
    private int esperienza;
    private boolean salute;
    
    public Membro(String n, String c){
        this.nome = n;
        this.cognome = c;
        this.salute = true;
    }
    
    public void malattia(){
        this.salute = false;
    }
    
}
