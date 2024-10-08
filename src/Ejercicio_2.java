import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.println(
                "Indique su categoria\n" +
                        "1- Estudiante\n2- Adulto\n3- Jubilado"
        );
        int categoria = sc.nextInt();

        double desc = 0.0;
        double precio_final;

        if (categoria == 1) {
            desc = 0.10;
        } else if (categoria == 2) {
            desc = 0.05;
        } else if (categoria == 3) {
            desc = 0.15;
        } else {
            System.out.println("Indique una categoria de la lista");
        }

        precio_final = precio - (precio * desc);
        System.out.println("El precio final es de "+precio_final);
    }
}