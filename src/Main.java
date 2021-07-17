import consumer.Consumer;
import consumer.ConsumerImpl;
import messgae.Message;
import producer.Producer;
import producer.ProducerImpl;
import topic.Topic;
import topic.TopicImpl;

public class Main {
    public static void main(String[] args){
        Topic t1 = new TopicImpl("topic 1");
        Topic t2 = new TopicImpl("topic 2");

        Producer p1 = new ProducerImpl("producer1");
        Producer p2 = new ProducerImpl("producer2");

        Consumer c1 = new ConsumerImpl("consumer1", "abc");
        Consumer c2 = new ConsumerImpl("consumer2");

        t1.subscribeTopic(c1);
        t1.subscribeTopic(c2);
        t2.subscribeTopic(c2);

        p1.sendMessage(t1,new Message("create user"));
        p2.sendMessage(t1,new Message("update user"));
    }
}
