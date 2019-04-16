package rocks.zipcode.io.objectorientation;


public class Television {

    private boolean power = false;
    private TVChannel channel;

    public void turnOn() {
       power = true;
    }

    public void setChannel(Integer channel) {
        if(!power){
            throw new IllegalStateException();
        }
        this.channel = TVChannel.getByOrdinal(channel);
    }

    public TVChannel getChannel() {
        return this.channel;
    }
}
