public class Operaciones {

    private double tasa=0.0;
    private double resultado = 0.0;
    String dolar = "USD";
    String pesoColombiano = "COP";
    String euro = "EUR";
    String pesoArgentino = "ARS";
    private Moneda monedaOrigen = new Moneda();
    private Moneda monedaDestino = new Moneda();
    private ConsultaMoneda consulta = new ConsultaMoneda();

    private void obtenerCambio(String moneda1, String moneda2, double valor){
        monedaOrigen.setCodigo(moneda1);
        monedaDestino.setCodigo(moneda2);
        tasa = consulta.consultarMoneda(monedaOrigen, monedaDestino);
        System.out.println(valor + " " + moneda1 + " equivalen a: " + tasa*valor + " " + moneda2);
        System.out.println("═════════════════════════════════════════════\n");
    }

    public void dolarPesoColombiano(double valor){
        obtenerCambio(dolar, pesoColombiano, valor);
    }

    public void pesoColombianoDolar(double valor){
        obtenerCambio(pesoColombiano, dolar, valor);
    }

    public void euroPesoColombiano(double valor){
        obtenerCambio(euro, pesoColombiano, valor);
    }
    public void pesoColombianoEuro(double valor){
        obtenerCambio(pesoColombiano, euro, valor);
    }

    public void dolarPesoArgentino(double valor){
        obtenerCambio(dolar, pesoArgentino, valor);
    }

    public void pesoArgentinoDolar(double valor){
        obtenerCambio(pesoArgentino, dolar, valor);
    }

    public void seleccionarOperacion (int entrada, double valor){
        if(entrada==1)  dolarPesoColombiano(valor);
        else if(entrada==2) pesoColombianoDolar(valor);
        else if(entrada==3) euroPesoColombiano(valor);
        else if(entrada==4) pesoColombianoEuro(valor);
        else if(entrada==5) dolarPesoArgentino(valor);
        else if(entrada==6) pesoArgentinoDolar(valor);
        //else if(entrada==0) return 0;
        //else return 0;
        //return resultado;
    }
}
