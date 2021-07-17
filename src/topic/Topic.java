package topic;

import consumer.Consumer;
import messgae.Message;

public interface Topic {
    public void notifyConsumers(Message message, String id);
    public void subscribeTopic(Consumer consumer);
}
