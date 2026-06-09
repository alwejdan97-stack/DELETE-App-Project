package DeleteApp.Demo.Entities;

public class EventRegistration {
    private String registrationId;
    private String attendeeName;

    public EventRegistration(String registrationId, String attendeeName) {
        this.registrationId = registrationId;
        this.attendeeName = attendeeName;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getAttendeeName() {
        return attendeeName;
    }

    public void setAttendeeName(String attendeeName) {
        this.attendeeName = attendeeName;
    }
}
