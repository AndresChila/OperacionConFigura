package operacionconfigura;
import java.util.Scanner;
/**
 * @author Andres Chila,Anderson Suarez
 * @version 1.0
 * @since 05/03/2017
 */
public class Triangulo {
    Scanner teclado = new Scanner(System.in);
    public Triangulo(){
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
        System.out.println();
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
        //se halla la distancia de un punto B a un punto C por metodo de componentes
        int coordI2 = puntoX2+puntoX3;
        int coordJ2 = puntoY2+puntoY3;
        //metodo pitagoras para hallar la magnitud de B a C
        double distanciaBC= Math.sqrt((coordJ2*coordJ2)+(coordI2*coordI2));//hay que dejarlo double porque la funcion raiz cuadrada lo pide double
        //se calcula el perimetro sumando todos los lados
        double perimetro=distanciaAB+distanciaAC+distanciaBC;
        //se saca semiperimetro para hacer los calculos para hallar altura
        double semiPerimetro=perimetro/2;
        //formulas necesarias para hallar altura
        double alturaAB = 2/distanciaAB*(Math.sqrt(semiPerimetro*(semiPerimetro-distanciaAB)*(semiPerimetro-distanciaBC)*(semiPerimetro-distanciaAC)));//hay que dejarlo double porque la funcion raiz cuadrada lo pide double
        double alturaBC =2/distanciaBC*(Math.sqrt(semiPerimetro*(semiPerimetro-distanciaAB)*(semiPerimetro-distanciaBC)*(semiPerimetro-distanciaAC)));//hay que dejarlo double porque la funcion raiz cuadrada lo pide double
        double alturaAC =2/distanciaAC*(Math.sqrt(semiPerimetro*(semiPerimetro-distanciaAB)*(semiPerimetro-distanciaBC)*(semiPerimetro-distanciaAC)));//hay que dejarlo double porque la funcion raiz cuadrada lo pide double
        //habiendo hecho todos los calculos necesarios, se puede hallar altura
        double altura= (alturaAB+alturaBC+alturaAC)/3;//hay que declararlo como double porque las variables alturaAB,alturaBC,alturaAC son doubles
        //se halla el area con la formula a= base*altura /2
        double area=distanciaAB*altura/2 ;//se declara double porque distanciaAB es double
        //se imprimen los resultados
        System.out.println("Distancia de A a B: " + distanciaAB);
        System.out.println("Distancia de B a C: " + distanciaBC);
        System.out.println("Distancia de C a A: " + distanciaAC);
        System.out.println("Perimetro del triangulo: " + perimetro);
        System.out.println("Area del triangulo: " + area);
    }
}
