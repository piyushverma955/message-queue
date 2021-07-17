package topic;

import consumer.Consumer;
import messgae.Message;

import java.util.List;

public class TopicProcessor implements Runnable{
    Consumer consumer;
    Message message;
    String producerId;

    TopicProcessor(Consumer consumer, Message message, String producerId){
        this.consumer = consumer;
        this.message = message;
        this.producerId = producerId;
    }

    public void run(){
        try{
            consumer.consume(message, producerId);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
