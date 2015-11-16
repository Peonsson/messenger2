package org.peonsson.fixit;


import model.Message;
import service.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/messages")
public class MessageResource {

    MessageService messageService = new MessageService();

    @GET
    @Produces("application/xml")
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }
}