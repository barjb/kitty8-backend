package com.kitty8.kitty8backend.domain.blackjack;

import com.kitty8.kitty8backend.domain.common.Card;

public interface Shoe {
    Card draw();

    int remainingCards();
}
