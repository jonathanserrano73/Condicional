import java.util.Scanner;
public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Cuantas horas duermmes al dia?");
        double dormir= sc.nextDouble();
        System.out.println("Cuantas horas haces ejercicio por dia?");
        double ejercicio= sc.nextDouble();
        System.out.println("Cuantas comidas saludables consumes al dia?");
        int comidas= sc.nextInt();
        String eva_dormir="";
        String eva_ejercicio="";
        String eva_comidas="";
        if (dormir< 7) {
            eva_dormir="Deberias dormir más horas";
        }else {
            eva_dormir="Estas durmiendo la cantidad de horas suficientes";
        }
        if (ejercicio<0.5) {
            eva_ejercicio="Deberias hacer mas ejercicio";
        }else {
            eva_ejercicio="Estas haciendo suficiente ejercicio diario";
        }
        if (comidas<3) {
            eva_comidas="Deberias consumir más alimentos saludables";
        }else {
            eva_comidas="Estas consumiendo suficientes alimentos saludables";
        }

        System.out.println("Evaluacion de tus habitos\n"+ eva_dormir+"\n" + eva_ejercicio + "\n" + eva_comidas
                );

    }
}
