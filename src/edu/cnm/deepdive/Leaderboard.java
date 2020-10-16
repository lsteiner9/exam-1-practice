package edu.cnm.deepdive;

import java.util.Arrays;

public class Leaderboard {

  static int[] addToLeaderboard(int[] scores, int[] newParticipant) {
    int[] participantScores = new int[newParticipant.length];
    for (int i = 0; i < newParticipant.length; i++) {
      participantScores[i] = getPosition(scores, newParticipant[i]);
    }
    return participantScores;
  }

  static int getPosition(int[] scores, int roundScore) {
    for (int i = 0; i < scores.length; i++) {
      if (roundScore >= scores[i]) {
        return i + 1;
      }
    }
    return scores.length + 1;

  }

  public static void main(String[] args) {
    int[] scores = new int[] {95, 90, 86, 74, 46, 30};
    int[] newParticipant = new int[] {27, 50, 89, 94, 100};
    System.out.println(Arrays.toString(addToLeaderboard(scores, newParticipant)));
  }
}
