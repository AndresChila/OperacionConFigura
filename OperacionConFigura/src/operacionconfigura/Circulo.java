package operacionconfigura;
import java.util.Scanner;

/**
 * @author Andres Chila,Anderson Suarez
 * @version 1.0
 * @since 05/03/2017
 */
public class Circulo {
    Scanner teclado = new Scanner(System.in);
    //se define la constante PI
    static final double PI = 3.1416;
    public Circulo(){
        //EL PROFESOR PIDIO UNA COORDENADA XY PERO NO ES NECESARIA...
        System.out.print("digite un punto X: ");
        byte puntoX = teclado.nextByte();
        System.out.print("digite un punto Y: ");
        byte puntoY = teclado.nextByte();
        //Se solicita el radio del circulo
        System.out.print("Escriba el radio del circulo: ");
        int radio = teclado.nextInt();
        //se calcula perimetro
        double perimetro= (2*PI)*radio; //hay que dejarlo como double porque PI esta double
        //se calcula diametro (2 veces el radio)
        int diametro=radio*2;
        //se imprimen los resultados
        System.out.println("Perimetro del circulo: " + perimetro);
        System.out.println("Diametro del circulo " + diametro);
        
    }
    
}
