public class Menu {
    String cabecera = "═════════════════════════════════════════════\n" +
            "     🌎 Bienvenid@ al Conversor de Moneda 🌎\n" +
            "═════════════════════════════════════════════\n";
    String menuPrincipal =
                    "📌 Opciones:\n" +
                    "  1️⃣  Dólar           ➡️   Peso colombiano\n" +
                    "  2️⃣  Peso colombiano ➡️   Dólar\n" +
                    "  3️⃣  Euro            ➡️   Peso colombiano\n" +
                    "  4️⃣  Peso colombiano ➡️   Euro\n" +
                    "  5️⃣  Dólar           ➡️   Peso argentino\n" +
                    "  6️⃣  Peso argentino  ➡️   Dólar\n" +
                    "  7️⃣  🚪 Salir\n" +
                    "═════════════════════════════════════════════\n" +
                    "👉 Elija una opción válida:";

    public void imprimirCabecera(){
        System.out.println(cabecera);
    }

    public void imprimirMenu(){
        System.out.println(menuPrincipal);
    }
}
