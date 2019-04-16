package rocks.zipcode.io.objectorientation;


public class Television {

    private boolean power = false;
    private Integer channel;

    public void turnOn() {
        while(!power){
            turnOn();
        }
    }

    public void setChannel(Integer channel) {

        this.channel = channel;
    }

    public TVChannel getChannel() {
        return getChannel();
    }
}
