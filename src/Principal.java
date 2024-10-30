public class Principal {
    public static void main(String[] args) {
        ConsultaMoneda consulta = new ConsultaMoneda();
        Moneda miMoneda = consulta.consultarMoneda("COP");
        System.out.println(miMoneda);
    }
}
