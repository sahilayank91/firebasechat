package in.ac.iiitk.firebase_chat;


public class Message {

    public String message;
    public String email;

    public Message() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Message( String email, String message) {
        this.message = message;
        this.email = email;
    }

}