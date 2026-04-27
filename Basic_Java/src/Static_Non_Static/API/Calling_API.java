package src.Static_Non_Static.API;
//learning how to make calls using apis in java
import java.net.URI;
import java.net.http.HttpClient;
//provides efficient  way to handle api since java 11
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Calling_API {
    public static void main(String[] args){
        //GET Request
        try{
            HttpClient client= HttpClient.newHttpClient();
            HttpRequest request= HttpRequest.newBuilder()
                    .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
