package messgae;

import java.util.UUID;

public class Message {
    UUID id;
    String message;

    public Message(String message){
        this.id = UUID.randomUUID();
        this.message = message;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
