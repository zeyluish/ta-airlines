package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationTest {

    Reservation reservation1 = new Reservation(3829, "21/03/24");

    @Test
    @DisplayName("Obtenir le n° Réservation")
    public void testGetNumeroReservation() {
        assertEquals(3829, reservation1.getNumeroReservation(), "Le numéro de réservation doit être 3829");
    }

    @Test
    @DisplayName("Obtenir date de réservation")
    public void testGetDateReservation() {
        assertEquals("21/03/24", reservation1.getDateReservation(), "La date de réservation doit être le 21/03/24");
    }
}