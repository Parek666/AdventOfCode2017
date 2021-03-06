
public class Main {

    public static void main(String[] args){

        int[] day1 = Challenges.day1();
        System.out.println("The sum for the first part is: "+day1[0]+"\nThe sum for the second part is: "+day1[1]);

        int[] day2 = Challenges.day2();
        System.out.println("Checksum is: "+day2[0]+"\nand sum of evenly divisible numbers is: "+day2[1]);

        int[] day3 = Challenges.day3();
        System.out.println("Steps: "+day3[0]+"\nand the next bigger value is: "+day3[1]);

        int[] day4 = Challenges.day4();
        System.out.println("Total valid passphrases for part 1 are: "+day4[0]+" \nand for part 2 are: "+day4[1]);

        int[] day5 = Challenges.day5();
        System.out.println("Steps: "+day5[0]+"\nsteps after the rules changed: "+day5[1]);

        int[] day6 = Challenges.day6();
        System.out.println("Infinite loop is found after: "+day6[0]+"\nand loops: "+day6[1]);

        String[] day7 = Challenges2.day7();
        System.out.println("The bottom tower name is: "+day7[0]);

        int[] day8 = Challenges2.day8();
        System.out.println("The highest value after all register changes is: "+day8[0]+"\tand highest value ever held in register is: "+day8[1]);

        int[] day9 = Challenges3.day9();
        System.out.println("The score is: "+day9[0]+"\tand garbage count is: "+day9[1]);

        int[] day10 = Challenges3.day10();
        System.out.println("The multiple of the numbers is: "+day10[0]);

        int[] day12 = Challenges4.day12();
        System.out.println("Number of direct pipes: "+day12[0]+"\tand total of groups is: "+day12[1]);

        int[] day13 = Challenges4.day13();
        System.out.println("Danger is: "+day13[0]+"\tand path is not blocked at: "+day13[1]);

        int[] day15 = Challenges4.day15();
        System.out.println("Number of matches are: "+day15[0]+"\tand after conditions are applied number of matches are: "+day15[1]);

        String[] day16 = Challenges5.day16();
        System.out.println("Sequence of programs will be "+day16[0]+"\tand after programs complete this dance for 1 billion times: "+day16[1]);

        int[] day17 = Challenges5.day17();
        System.out.println("The next value is: "+day17[0]+"\tand after 0 it is: "+day17[1]);

        int[] day18 = Challenges5.day18();
        System.out.println("The first value after recovery is: "+day18[0]);

        int[] day25 = Challenges6.day25();
        System.out.println("Checksum after 6 steps is: "+day25[0]);

        int[] day22 = Challenges6.day22();
        System.out.println("Virus spreads: "+day22[0]+" times\tand after virus evolves virus spreads: "+day22[1]+" times");

        int[] day23 = Challenges6.day23();
        System.out.println("Mul instruction is performed : "+day23[0]+" times \tand value of register \"h\" is: "+day23[1]);

        int[] day24 = Challenges5.day24();
        System.out.println("The strongest bridge is: "+day24[0]+"\tand the longest strongest is: "+day24[1]);

    }

}
