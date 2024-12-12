package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PersonneTest {

    Personne personne1 = new Personne("Joker", "Chez Joker", "0631874263");
    Personne personne2 = new Personne("Batman", "Chez Joker", "0783282393");

    @Test
    @DisplayName("Obtenir le nom")
    public void testGetNom() {
        assertEquals("Joker", personne1.getNom(), "Le nom doit être \"Joker\"");
    }


    @Test
    @DisplayName("Définir l'adresse")
    public void testSetAdresse() {
        personne2.setAdresse("Chez Batman");
        assertEquals("Chez Batman", personne2.getAdresse(), "L'adresse doit être \"Chez Batman\"");
    }
}