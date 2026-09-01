package com.kitty8.kitty8backend.infrastructure.persistence.entity.command;

import com.kitty8.kitty8backend.domain.common.Card;

import java.util.List;

public class CardDrawCommand extends BaseCommand {
    private List<Card> cardList;

    public CardDrawCommand(List<Card> cardList) {
        this.cardList = cardList;
    }
}
