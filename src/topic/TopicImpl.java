package topic;

import consumer.Consumer;
import messgae.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TopicImpl implements  Topic{
    private String id;
    private List<Consumer> consumers;
    final ExecutorService executor = Executors.newFixedThreadPool(3);

    public TopicImpl(String id) {
        this.id = id;
        this.consumers = new ArrayList<Consumer>();
    }

    public void subscribeTopic(Consumer consumer)  {
            consumers.add(consumer);
    }

    @Override
    public void notifyConsumers(Message message, String id){
        List<String> groups = new ArrayList<String>();
        for (Consumer consumer: consumers){
            if(groups.indexOf(consumer.getGroup()) < 0 ) {
                if(consumer.getGroup() != null) groups.add(consumer.getGroup());
                final TopicProcessor topicProcessor = new TopicProcessor(consumer, message, id);
                executor.execute(new Thread(topicProcessor));
            }
        }
    }
}
