/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas2;

/**
 *Clase que representa un Cuadrado/Rectangulo con sus operaciones
 * @author Anderson Suarez y Andres Chila
 */
public class CuadradoRectangulo {
       /**
     * Atributo que contiene la cordenada x1 y1
     */
    private Punto punto1;
    
    /**
     * Atributo que contiene la cordenada x2 y2
     */    
    private Punto punto2;

    /**
     * Atributo que contiene la cordenada x3 y3
     */        
    private Punto punto3;
       /**
     * Atributo que contiene la cordenada x4 y4
     */
    private Punto punto4;
    
    private double perimetro;
    
    public CuadradoRectangulo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }
        /**
     * Metodo que da los resultados del triangulo
     */
    public void darResultados() {
        if(isCuadrado()) {
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
            System.out.println("Lado4: " + darLado4());
            System.out.println("Perimetro: " + darPermietro());
            System.out.println("Area: " + darArea());
        } else {
            System.out.println("No es un triangulo");
        }    
    }
    
    /**
     * Retorna verdadero si es un triangulo Falso contrario
     * @return 
     */
    private boolean isCuadrado() {
        if(punto1.getX() == punto2.getX()&& punto1.getY() == punto2.getY()){
            return false;        
        }else 
            return true;
    }
     /**
     * Retorma longitud de lado AB
     * @return 
     */
    private double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado BC
     * @return 
     */
    private double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado CD
     * @return 
     */
    private double darLado3(){
        double auxiliarX = Math.pow(punto4.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto4.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
     /**
     * Retorma longitud de lado DA
     * @return 
     */
    private double darLado4(){
        double auxiliarX = Math.pow(punto1.getX() - punto4.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto4.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    private double darPermietro() {        
        this.perimetro =  darLado1() + darLado2() + darLado3() + darLado4();
        return this.perimetro;
    } 
    private double darArea() {     
        double area = darLado1()*darLado2();
        return area;
    }
    public void darTipoCuadradoRectangulo(){
        if(darLado1() == darLado2()){
            System.out.println("Es un cuadrado");
        }else if(darLado1() != darLado2()){
            System.out.println("Es un rectangulo");
        }
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

    /**
     * Retorna la cordenada x3 y3
     * @return 
     */    
    public Punto getPunto3() {
        return punto3;
    }

    /**
     * Modifica la cordenada x3 y3
     * @param punto3 
     */    
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
    /**
     * Retorna la cordenada x4 y4
     * @return 
     */    
    public Punto getPunto4() {
        return punto4;
    }

    /**
     * Modifica la cordenada x4 y4
     * @param punto4 
     */    
    public void setPunto4(Punto punto4) {
        this.punto4 = punto4;
    }
    
}
