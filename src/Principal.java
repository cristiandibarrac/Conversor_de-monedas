import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int estado = 1;
        double cantidad = 0.0;
        double resultado = 0.0;
        Scanner teclado = new Scanner(System.in);
        Menu menu = new Menu();
        Operaciones miOperacion = new Operaciones();

        menu.imprimirCabecera();

        while (estado != 0){


            try{
                menu.imprimirMenu();
                estado = teclado.nextInt();

                if(estado==0){
                    System.out.println("Hasta luego.");
                    break;
                }

                System.out.println("Ingrese la cantidad a convertir: ");
                cantidad = teclado.nextDouble();
                miOperacion.seleccionarOperacion(estado, cantidad);
            }
            catch (RuntimeException e){
                System.out.println(e.getMessage());
                System.out.println("Error");
            }
        }


    }
}
