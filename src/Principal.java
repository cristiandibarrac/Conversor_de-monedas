import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        System.out.println("Escriba las letras que identifican la moneda (ISO 4217)");

        try{
            String codigo = teclado.nextLine();
            Moneda miMoneda = consulta.consultarMoneda(codigo);
            System.out.println(miMoneda);
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Error");
        }

    }
}
