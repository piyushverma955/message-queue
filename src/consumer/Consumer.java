package consumer;

import messgae.Message;

public interface Consumer {
    public void consume(Message message, String producerId);

    public String getId();

    public String getGroup();
}
