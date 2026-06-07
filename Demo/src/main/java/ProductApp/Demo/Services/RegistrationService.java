package ProductApp.Demo.Services;

import ProductApp.Demo.Entities.EventRegistration;

import java.util.HashMap;
import java.util.Map;

public class RegistrationService {
    Map<Integer, EventRegistration> registrations=new HashMap<>();

    public RegistrationService(){
        registrations.put(101, new EventRegistration("E1-01", "Ahmed"));
        registrations.put(102, new EventRegistration("E2-02", "Sara"));
        registrations.put(103, new EventRegistration("E3-03", "John"));
    }
}
