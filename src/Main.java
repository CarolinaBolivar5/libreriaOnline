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
        double precioLibroFisico = 10000;
        double total = 0;
        double descuentoa = 0;
        double descuentob = 0;
        double precioLibroDigital=9000;

        switch (opcion){
            case "1":
                System.out.println("Ingrese cantidad de libros ");
                cantidad = sc.nextDouble();
                total = cantidad*precioLibroFisico;

                if (cantidad>5){
                    descuentoa=0.20;
                }else if (cantidad>=3){
                    descuentob=0.10;
                }
                double totalFinalFisico = total*(1-(descuentoa+descuentob));
                System.out.println(totalFinalFisico);
                System.out.println("Estas comprando "+cantidad+ " libros fisicos ");
                System.out.println("El valor a pagar es: "+totalFinalFisico);
                break;

            case "2":
                System.out.println("Ingrese la categoria del libro ");
                String categoria = sc.nextLine();
                total = precioLibroDigital;
                if (categoria.equals("Educativos")){
                    descuentoa=0.15;
                }else if (categoria.equals("recreativo")){
                    descuentob=0;
                }
                double totalFinalDigital = total *(1-descuentoa);
                System.out.println(totalFinalDigital);
                System.out.println("Estas comprando libros de categoria "+categoria);
                System.out.println("El valor a pagar es: "+totalFinalDigital);
                }

        }

    }
