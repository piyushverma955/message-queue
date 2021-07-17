package consumer;

import messgae.Message;

public class ConsumerImpl implements  Consumer{
    String id;
    String group;
    int offset;

    public  ConsumerImpl(String id){
        this.id = id;
        this.group = null;
    }

    public  ConsumerImpl(String id,  String group){
        this.id = id;
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }


    @Override
    public void consume(Message message, String producerId){
        System.out.println( "message consumed by"+ id+" "+ message.getMessage()+ " from producer "+ producerId );
    }
}
