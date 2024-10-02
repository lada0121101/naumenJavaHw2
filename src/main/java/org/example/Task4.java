package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

public class Task4 {
    public String makeRequest(String url){
         try(HttpClient client = HttpClient.newHttpClient()){
             HttpRequest request = HttpRequest.newBuilder()
                     .uri(URI.create(url))
                     .header("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
                     .build();

             HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString());
             return res.body();
         }
          catch (IOException | InterruptedException e){
              return null;
          }
    }
    public void getAccept(String body){
        ObjectMapper mapper = new ObjectMapper();
        try{
            JsonNode json = mapper.readTree(body);
            JsonNode a = json.findValue("Accept");
            System.out.println(a.asText());
        }
        catch (JsonMappingException e){

        }
        catch (JsonProcessingException e) {

        }
    }
}
