package producer;

import messgae.Message;
import topic.Topic;

public interface Producer {
    public void sendMessage(Topic topic, Message message);
}
