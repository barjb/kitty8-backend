package com.kitty8.kitty8backend.realtime.Controller;

import com.kitty8.kitty8backend.engine.Service.api.GameCommandService;
import com.kitty8.kitty8backend.infrastructure.persistence.entity.command.BaseCommand;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    private final GameCommandService gameCommandService;

    public WebSocketController(GameCommandService gameCommandService) {
        this.gameCommandService = gameCommandService;
    }

    @MessageMapping("/rooms/{id}/join")
    @SendTo("/topic/rooms/{id}")
    public String join(@DestinationVariable String id){
        System.out.println("message sent " + id);
        return "hi";
    }

    @MessageMapping("/rooms/{id}/command")
    public void command(@DestinationVariable String id, BaseCommand command) {
        gameCommandService.handle(command);
    }
}
