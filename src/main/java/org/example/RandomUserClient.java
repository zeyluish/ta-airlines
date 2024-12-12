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

        // 2. Préparer la requête
        Request request = new Request.Builder()
                .url(RANDOM_USER_URL)
                .build();

        // 3. Envoyer la requête et obtenir la réponse
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Erreur lors de l'appel à l'API : " + response);
            }

            // 4. Lire la réponse sous forme de chaîne JSON
            String jsonResponse = response.body().string();

            // 5. Extraire les informations nécessaires (nom, prénom, adresse, contact)
            JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
            JsonObject user = jsonObject.getAsJsonArray("results").get(0).getAsJsonObject();

            // Nom complet
            String prenom = user.getAsJsonObject("name").get("first").getAsString();
            String nom = user.getAsJsonObject("name").get("last").getAsString();

            // Adresse : Numéro + Rue uniquement
            JsonObject location = user.getAsJsonObject("location");
            String adresse = location.get("street").getAsJsonObject().get("number").getAsString() + " " +
                    location.get("street").getAsJsonObject().get("name").getAsString();

            // Contact (Email)
            String contact = user.get("email").getAsString();

            // 6. Créer un objet Passager et le retourner
            return new Passager(UUID.randomUUID(), prenom, adresse, contact, UUID.randomUUID().toString());
        }
    }

    public static void main(String[] args) {
        try {
            // Appel de l'API et récupération d'une personne
            Passager passager = RandomUserClient.getRandomUser();
            System.out.println(passager);
        } catch (IOException e) {
            System.err.println("Erreur lors de la récupération de l'utilisateur : " + e.getMessage());
        }
    }
}
