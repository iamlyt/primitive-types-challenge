public class Main {

    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        // my Challenge:

        byte myByteChallenge = 100;
        short myShortChallenge = 3000;
        int myIntChallenge = 200_000_000;

        int myTotalChallenge = ((byte) myByteChallenge + (short) myShortChallenge + myIntChallenge);
        long myLongChallenge = 50_000L + 10L * (myTotalChallenge);
        System.out.println(myLongChallenge);

        // I would correct my challenge by doing:

        byte byteChallengeValue = 100;
        short shortChallengeValue = 3000;
        int intChallengeValue = 200_000_000;

        long longChallengeTotal = 50000L + 10 * (byteChallengeValue + shortChallengeValue + intChallengeValue);
        System.out.println(longChallengeTotal);
    }
}