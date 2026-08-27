package com.kitty8.kitty8backend.WS.Controller;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/rooms/{id}/join")
    @SendTo("/topic/rooms/{id}")
    public String join(@DestinationVariable String id){
        System.out.println("message sent " + id);
        return "hi";
    }
}
