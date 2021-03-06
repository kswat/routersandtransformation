package com.pluralsight.globomantics.springintegration.service;

import com.pluralsight.globomantics.springintegration.model.PartyReservation;
import org.springframework.messaging.Message;

public interface PartyReservationService {
    void handlePartyReservation(Message<PartyReservation> partyReservationMessage);
}
