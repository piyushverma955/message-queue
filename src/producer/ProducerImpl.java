package producer;

import messgae.Message;
import topic.Topic;

public class ProducerImpl implements Producer{
    String id;

    public  ProducerImpl(String id){
        this.id = id;
    }

    @Override
    public void sendMessage(Topic topic, Message message){
        System.out.println( "message publish by"+id+" "+ message.getMessage() );
        topic.notifyConsumers(message, id);
    }
}
