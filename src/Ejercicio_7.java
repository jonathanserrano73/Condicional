import java.util.Scanner;
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique su estado de animo");
        System.out.println(
                "1- Feliz\n"+
                "2- Triste\n"+
                "3- Energico\n"+
                "4- Relajado"
        );
        int estado= sc.nextInt();

        if (estado==1){
            System.out.println("Te recomiendo salir con amigos, organizar una fiesta, jugar juegos de mesa, ir a un concierto o evento divertido. ");
        } else if (estado==2) {
            System.out.println("Te recomiendo ver una película, jugar un videojuego, hacer un rompecabezas, organizar tus cosas.");
        } else if (estado==3) {
            System.out.println("Te recomiendo correr, hacer ejercicio en el gimnasio, practicar un deporte de alta intensidad, bailar. ");
        } else if (estado==4) {
            System.out.println("Te recomiendo leer un libro, escuchar música suave, tomar una siesta, meditar, practicar yoga.");
        }else {
            System.out.println("Error. Indique un estado de animo de la lista");
        }

    }
}
