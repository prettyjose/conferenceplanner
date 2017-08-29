package org.prettyinc.confereceplanner;

import org.prettyinc.confereceplanner.participants.RegistrationAgent;

public class ConferenceMain {

    public static void main(String[] args) {

        RegistrationAgent registrationAgent = new RegistrationAgent();
        registrationAgent.doRegistrations();

    }
}
