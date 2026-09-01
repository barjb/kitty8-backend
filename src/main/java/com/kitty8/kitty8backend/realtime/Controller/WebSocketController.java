package com.kitty8.kitty8backend.realtime.Controller;

import com.kitty8.kitty8backend.engine.service.api.WebSocketCommandService;
import com.kitty8.kitty8backend.infrastructure.persistence.entity.WebSocketCommand;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    private final WebSocketCommandService webSocketCommandService;

    public WebSocketController(WebSocketCommandService webSocketCommandService) {
        this.webSocketCommandService = webSocketCommandService;
    }

    @MessageMapping("/rooms/{id}/join")
    @SendTo("/topic/rooms/{id}")
    public String join(@DestinationVariable String id){
        System.out.println("message sent " + id);
        return "hi";
    }

    @MessageMapping("/rooms/{id}/command")
    public void command(@DestinationVariable String id, WebSocketCommand command) {
        webSocketCommandService.handle(command);
    }
}
