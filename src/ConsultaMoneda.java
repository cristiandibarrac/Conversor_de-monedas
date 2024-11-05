import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    //Metodo para extraer la tasa de cambio, recibe 2 objetos tipo "Moneda"
    public double consultarMoneda(Moneda moneda1, Moneda moneda2){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/5bb2f8eca652e2afc68d367c/pair/" + moneda1.getCodigo() + "/" + moneda2.getCodigo());
        double tasaDeCambio = 0.0;

        //Hacemos la solicitud a nuestra API
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            JsonObject objetoJson = gson.fromJson(response.body(), JsonObject.class);
            tasaDeCambio = objetoJson.get("conversion_rate").getAsDouble();
            return tasaDeCambio;

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("No fue posible realizar la operación");
        }


    }
}
