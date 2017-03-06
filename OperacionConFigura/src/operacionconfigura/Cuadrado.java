package operacionconfigura;
import java.util.Scanner;

/**
 * @author Andres Chila,Anderson Suarez
 * @version 1.0
 * @since 05/03/2017
 */
public class Cuadrado {
    Scanner teclado = new Scanner(System.in);
    public Cuadrado(){
        //se piden las coordenadas de los puntos
        System.out.print("digite un punto X1: ");
        byte puntoX1 = teclado.nextByte();
        System.out.print("digite un punto Y1: ");
        byte puntoY1 = teclado.nextByte();
        System.out.print("digite un punto X2: ");
        byte puntoX2 = teclado.nextByte();
        System.out.print("digite un punto Y2: ");
        byte puntoY2 = teclado.nextByte();
        System.out.print("digite un punto X3: ");
        byte puntoX3 = teclado.nextByte();
        System.out.print("digite un punto Y3: ");
        byte puntoY3 = teclado.nextByte();
        System.out.print("digite un punto X4: ");
        //se halla la distancia de un punto A a un punto B por metodo de componentes
        int coordI = puntoX1+puntoX2;
        int coordJ = puntoY1+puntoY2;
        //metodo pitagoras para hallar la magnitud de A a B
        double distanciaAB= Math.sqrt((coordJ*coordJ)+(coordI*coordI));//hay que dejarlo double porque la funcion raiz cuadrada lo pide double
        //se halla la distancia de un punto A a un punto C por metodo de componentes
        int coordI1 = puntoX1+puntoX3;
        int coordJ1 = puntoY1+puntoY3;
        //metodo pitagoras para hallar la magnitud de A a C
        double distanciaAC= Math.sqrt((coordJ1*coordJ1)+(coordI1*coordI1));//hay que dejarlo double porque la funcion raiz cuadrada lo pide double
        //como es un cuadrado/rectangulo, las medidas de los lados opuestos son iguales
        double distanciaBC= distanciaAC;
        double distanciaCD= distanciaAB;
        //se calcula el area (lado * lado)
        double area= distanciaAB*distanciaAC;
        //se calcula perimetro (lado + lado + lado + lado
        double perimetro= distanciaAB+distanciaAC+distanciaBC+distanciaCD;
        //se imprimen los resultados
        System.out.println("Distancia de A a B: " + distanciaAB);
        System.out.println("Distancia de B a C: " + distanciaBC);
        System.out.println("Distancia de C a A: " + distanciaAC);
        System.out.println("Distancia de C a D: " + distanciaCD);
        System.out.println("Perimetro del cuadrado/rectangulo: " + perimetro);
        System.out.println("Area del triangulo: " + area);
    }
    
}
