import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Menu de opciones");
        System.out.println("1. Compra libros fisicos");
        System.out.println("2. compra libros digitales");
        System.out.println("3. suscripcion anual");
        String opcion = sc.nextLine();
        double cantidad = 0;
        double precioLibro = 10000;
        double total = 0;
        double descuentoa = 0;
        double descuentob = 0;

        switch (opcion){
            case "1":
                System.out.println("Ingrese cantidad de libros ");
                cantidad = sc.nextDouble();
                total = cantidad*precioLibro;

                if (cantidad>5){
                    descuentoa=0.20;
                }else if (cantidad>=3){
                    descuentob=0.10;
                }
                double totalFinal = total*(1-(descuentoa+descuentob));
                System.out.println(totalFinal);
        }
    }
}