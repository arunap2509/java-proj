package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Yacht {
    public static int GetScore(int[] dice, YachtCategory category) {

        switch (category) {
            case Ones: return checkForOnes(dice);
            case Twos: return checkForTwos(dice);
            case Threes: return checkForThrees(dice);
            case Fours: return checkForFours(dice);
            case Fives: return checkForFives(dice);
            case Sixes: return checkForSixes(dice);
            case FullHouse: return checkForFullHouse(dice);
            case FourOfAKind: return CheckForFourOfAKind(dice);
            case LittleStraight: return checkForLittleStraight(dice);
            case BigStraight: return checkForBigStraight(dice);
            case Choice: return checkForChoice(dice);
            case Yacht: return checkForYacht(dice);
            default: return 0;
        }
    }

    private static int checkForOnes(int[] dice) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i : dice) {
            if (freq.containsKey(i)) freq.put(i, freq.get(i) + 1);
            else freq.put(i, 1);
        }

        if (freq.containsKey(1)) return freq.get(1) * 1;
        return 0;
    }

    private static int checkForTwos(int[] dice) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i : dice) {
            if (freq.containsKey(i)) freq.put(i, freq.get(i) + 1);
            else freq.put(i, 1);
        }

        if (freq.containsKey(2)) return freq.get(2) * 2;
        return 0;
    }

    private static int checkForThrees(int[] dice) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i : dice) {
            if (freq.containsKey(i)) freq.put(i, freq.get(i) + 1);
            else freq.put(i, 1);
        }

        if (freq.containsKey(3)) return freq.get(3) * 3;
        return 0;
    }

    private static int checkForFours(int[] dice) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i : dice) {
            if (freq.containsKey(i)) freq.put(i, freq.get(i) + 1);
            else freq.put(i, 1);
        }

        if (freq.containsKey(4)) return freq.get(4) * 4;
        return 0;
    }

    private static int checkForFives(int[] dice) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i : dice) {
            if (freq.containsKey(i)) freq.put(i, freq.get(i) + 1);
            else freq.put(i, 1);
        }

        if (freq.containsKey(5)) return freq.get(5) * 5;
        return 0;
    }

    private static int checkForSixes(int[] dice) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i : dice) {
            if (freq.containsKey(i)) freq.put(i, freq.get(i) + 1);
            else freq.put(i, 1);
        }

        if (freq.containsKey(6)) return freq.get(6) * 6;
        return 0;
    }

    private static int checkForFullHouse(int[] dice) {

        if (Arrays.stream(dice).distinct().count() != 2) return 0;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i : dice) {
            if (freq.containsKey(i)) freq.put(i, freq.get(i) + 1);
            else freq.put(i, 1);
        }

        if (!freq.containsValue(3)) return 0;

        int sum = 0;

        for (Map.Entry<Integer, Integer> item : freq.entrySet()) {
            sum += item.getKey() * item.getValue();
        }

        return sum;
    }

    private static int CheckForFourOfAKind(int[] dice) {

        if (Arrays.stream(dice).distinct().count() > 2) return 0;

        HashMap<Integer, Integer> frequency = new HashMap();

        for (int i : dice) {
            if (frequency.containsKey(i)) {
                frequency.put(i, frequency.get(i) + 1);
            } else {
                frequency.put(i, 1);
            }


            if (frequency.get(i) == 4) {
                return i * 4;
            }
        }

        return 0;
    }

    private static int checkForLittleStraight(int[] dice) {

        Arrays.sort(dice);

        for (int i = 1; i <= dice.length; i++) {
            if (dice[i-1] != i) {
                return 0;
            }
        }
        return 30;
    }

    private static int checkForBigStraight(int[] dice) {
        Arrays.sort(dice);

        for (int i = 2; i <= dice.length + 1; i++) {
            if (dice[i-2] != i) {
                return 0;
            }
        }
        return 30;
    }

    private static int checkForChoice(int[] dice) {

        return Arrays.stream(dice).sum();
    }

    private static int checkForYacht(int[] dice) {

        if (Arrays.stream(dice).distinct().count() == 1) {
            return 50;
        }
        return 0;
    }
}

enum YachtCategory {
    Ones,
    Twos,
    Threes,
    Fours,
    Fives,
    Sixes,
    FullHouse,
    FourOfAKind,
    LittleStraight,
    BigStraight,
    Choice,
    Yacht
}
