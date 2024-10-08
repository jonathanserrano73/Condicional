import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Indique su genero de pelicula favorito:");
        System.out.println(
                "1- Accion \n"+
                "2- Comedia \n"+
                "3- Drama \n"+
                "4- Ciencia Ficcion \n"
        );
        int genero= sc.nextInt();

        if (genero==1){
            System.out.println("Recomiendo la pelicula de Accion: GLADIATOR ");
        }else if (genero==2){
            System.out.println("Recomiendo la pelicula de Comedia: DEADPOOL ");
        } else if (genero==3) {
            System.out.println("Recomiendo la pelicula de Drama: CIUDAD DE DIOS ");
        } else if (genero==4) {
            System.out.println("Recomiendo la pelicula de Ciencia Ficcion: EL EFECTO MARIPOSA");
        }else {
            System.out.println("Error. Indique una opcion de la lista");
        }
    }
}
