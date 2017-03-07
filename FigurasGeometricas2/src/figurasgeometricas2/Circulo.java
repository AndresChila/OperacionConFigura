/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 *
 * @author Anderson Suarez y Andres Chila
 */
public class Circulo {
     /**
     * Atributo que contiene la cordenada x1 y1
     */
    private Punto punto1;
    
    /**
     * Atributo que contiene la cordenada x2 y2
     */    
    private Punto punto2;
    
    private double perimetro;
    
    public Circulo(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
        /**
     * Metodo que da los resultados del triangulo
     */
    public void darResultados() {
        System.out.println("Radio: " + darRadio());
        System.out.println("Perimetro: " + darPerimetro());
        System.out.println("Diametro: " + darDiametro());           
    }
     /**
     * Retorma longitud del radio
     * @return 
     */
    private double darRadio(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double radio = Math.sqrt(auxiliarX +  auxiliarY);
        return radio;
    }
    private double darPerimetro(){
        this.perimetro = 2*Math.PI*(darRadio()*darRadio());
        return this.perimetro;
    }
    private double darDiametro(){
        double diametro = darRadio()*2;
        return diametro;
    }
     /**
     * Retorna la cordenada x1 y1
     * @return 
     */
    public Punto getPunto1() {
        return punto1;
    }

    /**
     * Modifica la cordenada x1 y1
     * @param punto1 
     */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    /**
     * Retorna la cordenada x2 y2
     * @return 
     */    
    public Punto getPunto2() {
        return punto2;
    }

    /**
     * Modifica la cordenada x2 y2
     * @param punto2 
     */    
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
}
