package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.util.UUID;

public class RandomUserClient {

    private static final String RANDOM_USER_URL = "https://randomuser.me/api/";

    public static Passager getRandomUser() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(RANDOM_USER_URL)
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Erreur lors de l'appel à l'API : " + response);
            }
            String jsonResponse = response.body().string();

            //Extraction donnée importante : prénom, adresse, contact
            JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
            JsonObject user = jsonObject.getAsJsonArray("results").get(0).getAsJsonObject();
            String prenom = user.getAsJsonObject("name").get("first").getAsString();
            JsonObject location = user.getAsJsonObject("location");
            String adresse = location.get("street").getAsJsonObject().get("number").getAsString() + " " +
                    location.get("street").getAsJsonObject().get("name").getAsString();
            String contact = user.get("email").getAsString();

            return new Passager(UUID.randomUUID(), prenom, adresse, contact, UUID.randomUUID().toString());
        }
    }

    public static void main(String[] args) {
        try {
            Passager passager = RandomUserClient.getRandomUser();
            System.out.println(passager);
        } catch (IOException e) {
            System.err.println("Erreur lors de la récupération de l'utilisateur : " + e.getMessage());
        }
    }
}
