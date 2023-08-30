package Test;

import java.util.Random;

/**
 * Main 클래스입니다.
 */
public class Main {
    /**
     * main 메서드입니다.
     *
     * @param args input 인자
     */
    public static void main(String[] args) {
        Random r = new Random();
        int random1 = r.nextInt(6) + 1;
        int random2 = r.nextInt(6) + 1;

        Dice dice1 = new Dice(random1);
        Dice dice2 = new Dice(random2);

        System.out.println("주사위 합 = " + DiceCalculator.addDice(dice1, dice2));

        String str = "abcdefg";

        int val = r.nextInt(str.length()-1);
        System.out.println(DiceCalculator.getIndexOf(str, val));

        int random4 = r.nextInt(6) + 1;
        Dice dice = new Dice(random4);
        System.out.println("주사위 눈이 홀수 : " + DiceCalculator.odd(dice));

        Library library = new Library(5);
        String name = "샬롯의 거미줄";
        library.add("해리포터");
        library.add(name);
        try {
            library.add(name);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        library.find(name);
        try {
            library.delete("스파이더맨");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        library.delete(name);
        library.find(name);
        library.add("Java 7");
        library.add("Java 8");
        library.add("Java 9");
        library.add("Java 11");
        library.findall();
        try {
            library.add(("Java 12"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

