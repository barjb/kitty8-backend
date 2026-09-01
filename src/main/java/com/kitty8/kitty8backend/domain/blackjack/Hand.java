package com.kitty8.kitty8backend.domain.blackjack;

import com.kitty8.kitty8backend.infrastructure.persistence.entity.Bet;
import com.kitty8.kitty8backend.domain.common.Card;
import com.kitty8.kitty8backend.domain.common.Rank;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> cards;
    private final Bet bet;

    public Hand(List<Card> cards, Bet bet) {
        this.cards = cards;
        this.bet = bet;
    }

    public int score() {
        int sum = cards.stream()
                .mapToInt(card -> BlackJackRules.getRankValue(card.getRank()))
                .sum();
        long aces = cards.stream()
                .filter(card -> card.getRank() == Rank.ACE)
                .count();
        while (sum > 21 && aces > 0) {
            sum -= 10;
            aces--;
        }
        return sum;
    }

    public boolean isBlackjack() {
        return cards.size() == 2 && score() == 21;
    }

    public boolean isBust() {
        return score() > 21;
    }

    public Hand add(Card card) {
        var updated = new ArrayList<>(cards);
        updated.add(card);
        return new Hand(updated, bet);
    }

    public List<Card> getCards() {
        return cards;
    }
}
