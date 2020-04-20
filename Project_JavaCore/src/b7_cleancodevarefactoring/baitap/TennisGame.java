package b7_cleancodevarefactoring.baitap;

public class TennisGame {

    public static String score;
    public static int tempScore;
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;
    public static final int MAX_SCORE = 4;
    public static final String DASH = "-";

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        boolean isSameScore = player1Score == player2Score;
        if (isSameScore) {
            score = getTieGame(player1Score);
        } else {
            boolean isAdvantageScore = player1Score >= MAX_SCORE || player2Score >= MAX_SCORE;
            if (isAdvantageScore) {
                score = getWinner(player1Score, player2Score);
            } else {
                getRatio(player1Score, player2Score);
            }
        }
        return score;
    }

    private static void getRatio(int player1Score, int player2Score) {
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Score;
            else {
                score += DASH;
                tempScore = player2Score;
            }
            switch (tempScore) {
                case LOVE:
                    score += "Love";
                    break;
                case FIFTEEN:
                    score += "Fifteen";
                    break;
                case THIRTY:
                    score += "Thirty";
                    break;
                case FORTY:
                    score += "Forty";
                    break;
            }
        }
    }

    private static String getWinner(int player1Score, int player2Score) {
        int minusResult = player1Score - player2Score;
        boolean isPlayer1Advantage = minusResult == 1;
        boolean isPlayer2Advantage = minusResult == -1;
        boolean isPlayer1Win = minusResult >= 2;
        if (isPlayer1Advantage){
            score = "Advantage player1";
        }else if (isPlayer2Advantage) {
            score = "Advantage player2";
        }else if (isPlayer1Win) {
            score = "Win for player1";
        }else{
            score = "Win for player2";
            }
        return score;
    }

    private static String getTieGame(int player1Score) {
        switch (player1Score) {
            case LOVE:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRTY:
                score = "Thirty-All";
                break;
            case FORTY:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }
}
