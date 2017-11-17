import java.util.List;


public class Message {

    private String message;
    private List<S> sBuffer;
    private int[] timeStamp;
    
    public Message(String message, List<S> sBuffer, int[] timeStamp) {
        this.message = message;
        this.sBuffer = sBuffer;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<S> getsBuffer() {
        return sBuffer;
    }

    public void setsBuffer(List<S> sBuffer) {
        this.sBuffer = sBuffer;
    }

    public int[] getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int[] timeStamp) {
        this.timeStamp = timeStamp;
    }
    
}
