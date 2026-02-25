import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma=0;
        double notaMinima;
        double notaMaxima=0;
        double notaMedia;
        int aprobados=0;

        System.out.println("¿Cuantas notas quieres guardar?: ");
        int cantidadNotas = sc.nextInt();
        Double[] arrayNotas = new Double[cantidadNotas];
        //Recorremos el bucle añadiendo las notas
        for (int i = 0; i < arrayNotas.length; i++) {
            System.out.println("Dime la Nota " + (i + 1));
            double nota = sc.nextDouble();
            arrayNotas[i] = nota;

        }
        //Con esto hacemos que notaMinima tenga el primer valor del array, a si para luego si encuentra un número mas pequeño
        //La nota minima se convertira en ese número
        notaMinima = arrayNotas[0];
        for (Double arrayNota : arrayNotas) {
            suma += arrayNota;
            if (arrayNota>=5){
                aprobados++;
            }
            //Si la notaMaxima es menor que arrayNota la notaMaxima es arrayNota
            if (notaMaxima<=arrayNota){
                notaMaxima = arrayNota;
            }
            //Lo mismo si notaMinima es mayor que arrayNota la notaMinima se convierte en arraynota
            if (notaMinima>=arrayNota){
                notaMinima = arrayNota;
            }



        }
        //Calculamos la media
        notaMedia=suma/arrayNotas.length;
        //Calculamos el porcentaje de aprobados
        double porcentaje=(double)(aprobados*100)/cantidadNotas;
        System.out.println("Porcentaje de aprobados: "+porcentaje+ "%");
        System.out.println("La media es: "+notaMedia);
        System.out.println("La nota maxima es: "+notaMaxima);
        System.out.println("La nota minima es: "+notaMinima);
        }
    }
