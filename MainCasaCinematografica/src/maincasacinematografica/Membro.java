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
    protected int qualita;
    private double costo;
    protected int esperienza;
    private boolean salute;
    
    /*
    public Membro(String nome, String cognome, int qualita, double costo, int esperienza, boolean salute) {
        this.nome = nome;
        this.cognome = cognome;
        this.qualita = qualita;
        this.costo = costo;
        this.esperienza = esperienza;
        this.salute = salute;
    }
    */
    public Membro(String n, String c, double co, int e){
        this.nome = n;
        this.cognome = c;
        this.costo = co;
        this.esperienza= e;
        this.salute = true;
    }
    
    public void setSalute(boolean s){
        this.salute = s;
    }
    
    public void malattia(){
        setSalute(false);
    }
    
    public void infortunio(){
        esperienza--;
    }
}
