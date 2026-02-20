import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsumoAPI {
    public String consumoApi(String from, String to,double cantidad) {

        String apiKey = "TU-API-KEY";
try{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/"
                            + apiKey + "/pair/" + from + "/" + to + "/" +  cantidad ))
                    .GET()
                    .build();


            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString());
        Gson gson =new Gson();
          //System.out.println(response.body());
        ConversionResponse conversion =
                gson.fromJson(response.body(),ConversionResponse.class);

            return conversion.getConversionResult();


        } catch (InterruptedException | IOException e) {
            throw new RuntimeException("Error al realizar la conversion desdeada");
        }
    }
}