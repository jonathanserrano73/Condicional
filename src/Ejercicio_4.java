import java.util.Scanner;
public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Indica tu peso (Kg)");
        double peso= sc.nextDouble();
        System.out.println("Indique su altura (mts)");
        double altura= sc.nextDouble();
        double indice= peso/Math.pow(altura,2);
        System.out.println("Su IMC es:"+indice);
        if (indice<18.5) {
            System.out.println("Bajo Peso");
            System.out.println("Recomendacion:\nAumentar la ingesta calorica, alimentos nutritivos y densos en calorias\n"+
                    "Entrenamiento de fuerza para aumentar masa muscular"
                    );
        }else if (indice<24.9) {
            System.out.println("Peso normal");
            System.out.println("Recomendacion:\nContinua con una dieta equilibrada\nActividad fisica regular");
        } else if (indice<29.9) {
            System.out.println("Sobrepeso");
            System.out.println("Recomendacion:\nReducir las calorias,enfocarte en alimentos bajos en grasas y azucare\n"+
                    "Aumentar la actividad fisica\nConsulta a un nutricionista"
            );
        } else {
            System.out.println("Obesidad");
            System.out.println("Recomendacion:\nEvaluacion Medica\nPlan de perdida de peso con nutricionista\n"+
                    "Actividad fisica, Inicia un programa de ejercicio regular"

            );
        }
    }
}
