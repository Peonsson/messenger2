package service;

import model.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Peonsson on 2015-11-16.
 */
public class MessageService {

    public List<Message> getAllMessages() {
        Message m1 = new Message(1L, "Hello World!", "Peonsson");
        Message m2 = new Message(2L, "Hello Jersey!", "Peonsson");
        List<Message> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        return list;
    }
}
