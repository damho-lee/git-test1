package Test;

import Test.Dice;

public class DiceCalculator {
    private DiceCalculator(){}


    public static int addDice(Dice dice1, Dice dice2) {
        return dice1.getNum() + dice2.getNum();
    }

    public static String getIndexOf(String str, int index) {
        return str.substring(0, index);
    }

    public static boolean odd(Dice dice) {
        return dice.getNum()%2==1;
    }
}
