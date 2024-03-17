package model.result;

import java.util.List;
import model.participant.Participant;

public class ParticipantScore {

    private final ParticipantCard card;
    private final int score;

    private ParticipantScore(ParticipantCard card, int score) {
        this.card = card;
        this.score = score;
    }

    public static ParticipantScore from(Participant participant) {
        ParticipantCard card = ParticipantCard.createWithAllCard(participant);
        int score = participant.score();
        return new ParticipantScore(card, score);
    }

    public List<String> cards() {
        return card.getCards();
    }

    public ParticipantCard getCard() {
        return card;
    }

    public int getScore() {
        return score;
    }
}