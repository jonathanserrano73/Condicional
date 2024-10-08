import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indica tu genero de libro favorito: ");
        System.out.println(
                "1- Fantasia\n" +
                        "2- Misterio\n" +
                        "3- Romance\n" +
                        "4- Ciencia Ficcion"
        );
        try {
            int genero = sc.nextInt();

            switch (genero) {
                case 1:
                    System.out.println("Te recomiendo el libro: El Señor de los Anillos-J.R.R. Tolkien ");
                    break;
                case 2:
                    System.out.println("Te recomiendo el libro: La Chica del Tren-Paula Hawkins ");
                    break;
                case 3:
                    System.out.println("Te recomiendo el libro: Cumbres Borrascosas-Emily Brontë");
                    break;
                case 4:
                    System.out.println("Te recomiendo el libro: La Máquina del Tiempo-Herbert George Wells ");
                    break;
                default:
                    System.out.println("Indique un genero de la lista");
                    break;
            }
        }
        catch (Exception e) {
            System.out.println("Introduce un numero valido");
        }finally {
            sc.close();
        }
    }
}
