package com.kitty8.kitty8backend.domain.blackjack;

import com.kitty8.kitty8backend.domain.common.Card;
import com.kitty8.kitty8backend.domain.common.Rank;

import java.util.List;

public class BlackJackRules {

    public static int getRankValue(Rank rank) {
        return switch (rank) {
            case TWO -> 2;
            case THREE -> 3;
            case FOUR -> 4;
            case FIVE -> 5;
            case SIX -> 6;
            case SEVEN -> 7;
            case EIGHT -> 8;
            case NINE -> 9;
            case TEN, JACK, QUEEN, KING -> 10;
            case ACE -> 11;
        };
    }

    public static boolean canSplit(Hand hand) {
        List<Card> cards = hand.getCards();
        if(cards.size() != 2) return false;
        return cards.stream().map(Card::getRank).distinct().count() == 1;
    }
}
