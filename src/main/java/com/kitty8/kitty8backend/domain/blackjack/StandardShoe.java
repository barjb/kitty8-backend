package com.kitty8.kitty8backend.domain.blackjack;

import com.kitty8.kitty8backend.domain.common.Card;
import com.kitty8.kitty8backend.domain.common.Rank;
import com.kitty8.kitty8backend.domain.common.Suit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class StandardShoe implements Shoe{

    private final Deque<Card> cards = new ArrayDeque<>(List.of(new Card(Suit.CLUB, Rank.ACE), new Card(Suit.DIAMOND, Rank.ACE), new Card(Suit.SPADE, Rank.ACE), new Card(Suit.HEART, Rank.ACE)));

    @Override
    public Card draw() {
        return cards.removeFirst();
    }

    @Override
    public int remainingCards() {
        return cards.size();
    }
}
