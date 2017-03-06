package operacionconfigura;
import java.util.Scanner;
/**
 * @author Andres Chila,Anderson Suarez
 * @version 1.0
 * @since 05/03/2017
 */
public class OperacionConFigura{
    Scanner teclado = new Scanner(System.in);
        public OperacionConFigura(){
            //Se imprime el menu para que el usuario escoja la opcion
            System.out.println("Con que desea operar?: ");
            System.out.println("1: Triangulo ");
            System.out.println("2: Cuadrado/Rectangulo ");
            System.out.println("3: circulo ");
            System.out.println("4: salir ");
            System.out.print("Opcion: " );
            //Se guarda la opcion que el usuario escogio
            int operacion = teclado.nextInt();
            //switch para la opcion que se escogio
            switch(operacion){
                case 1: Triangulo triangulo = new Triangulo();//Se construye la clase
                        triangulo.getClass();//Se hace llamado a la clase 
                break;
                case 2: Cuadrado cuadrado = new Cuadrado();//Se construye la clase
                        cuadrado.getClass();//Se hace llamado a la clase
                break;
                case 3: Circulo circulo = new Circulo();//Se construye la clase
                        circulo.getClass();//Se hace llamado a la clase
                break;
                case 4:// en caso que el usuario decida salir, el programa no hace nada
                break;
            }
}
    public static void main(String[] args) {
        OperacionConFigura operacionConFigura = new OperacionConFigura();
    }
}
