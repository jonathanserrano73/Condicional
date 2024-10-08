import java.util.Scanner;
import java.util.Random;
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Elige una opcion:");
        System.out.println("1- Piedra\n2- Papel\n3- Tijera");
        int opc= sc.nextInt();
        int numeroAlt=random.nextInt(1,4);
        String[] opciones= {"Pieda","Papel","Tijera"};

        System.out.println("Tu elegiste: "+opciones[opc-1]);
        System.out.println("La computadora eligio: "+opciones[numeroAlt-1]);
        if (opc==numeroAlt){
            System.out.println("Empate");
        } else if ((opc==1 && numeroAlt==2) || (opc==2 && numeroAlt==3) ||(opc==3 && numeroAlt==1)){
            System.out.println("Perdiste");
        }else{
            System.out.println("Ganaste");
        }

    }
}
