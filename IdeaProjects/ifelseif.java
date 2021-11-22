import java.util.ArrayList;
import java.util.Scanner;

public class ifelseif {
    private static int Billy_Corgan;

    public static void main(String[] args )
    {
        System.out.println( "Assignment 1" );
        int people = 30;
        int cars = 20;
        int buses = 15;


        if ( cars > people )
        {
            System.out.println( "We should take the cars." );
        }
        else if ( cars < people )
        {
            System.out.println( "We should not take the cars." );
        }
        else
        {
            System.out.println( "We can't decide." );
        }


        if ( buses > cars )
        {
            System.out.println( "That's too many buses." );
        }
        else if ( buses < cars )
        {
            System.out.println( "Maybe we could take the buses." );
        }
        else
        {
            System.out.println( "We still can't decide." );
        }


        if ( people > buses )
        {
            System.out.println( "All right, let's just take the buses." );
        }
        else
        {
            System.out.println( "Fine, let's stay home then." );
        }

        /*
         * 1. What do you think else if and else are doing?
         * Statements inside the body of else block are executed if the test expression is evaluated to false.The program will do one task (codes inside if block), if the condition is true and another task (codes inside else block) if the condition is false .
         * 2. Remove the else part at the beginning of one of the else if statements. What difference does that make? why?
         * There is little to no difference. The difference is that if the first, if is true, the other else if statements won't be executed, even if they do evaluate to true*/
        System.out.println( "Assignment 2" );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, what's your name? (Sorry I keep forgetting.)");
        String name = scanner.next();
        System.out.println("OK," +name+",how old are you?");
        Scanner input = new Scanner(System.in);
        int age= input.nextInt();

        if (age<16){
            System.out.println("You can't drive,"+name+".");
        } else if (age<17) {
            System.out.println("You can drive but not vote,"+name+".");
        }else if (age<24){
            System.out.println("You can vote but not rent a car,"+name+".");
        }else{
            System.out.println("You can do pretty much anything,"+name+".");
        }

        System.out.println("Assignment 3");
        System.out.println("Please enter your current Earth weight:");
        Scanner input1 = new Scanner(System.in);
        int weight = input1.nextInt();
        System.out.println("I have information for the following planets:");

        String[][] table = new String[2][];
        table[0] = new String[] { "1. Venus", "2. Mars", "3. Jupiter" };
        table[1] = new String[] { "4. Saturn", "5. Uranus", "6. Neptune" };

        for (String[] row : table) {
            System.out.format("%15s %15s %15s %n", row);
        }
        System.out.println("Which planet are you visiting?");
        Scanner input2 = new Scanner(System.in);
        int planet = input2.nextInt();
        if (planet==1){
            System.out.println("Your weight would be "+0.78*weight+" pounds on that planet.");
        }
        if (planet==2){
            System.out.println("Your weight would be "+0.39*weight+" pounds on that planet.");
        }
        if (planet==3){
            System.out.println("Your weight would be "+2.65*weight+" pounds on that planet.");
        }
        if (planet==4){
            System.out.println("Your weight would be "+1.17*weight+" pounds on that planet.");
        }
        if (planet==5){
            System.out.println("Your weight would be "+1.05*weight+" pounds on that planet.");
        }
        if (planet==6){
            System.out.println("Your weight would be "+1.23*weight+" pounds on that planet.");
        }
        if (planet>6){
            System.out.println("Invalid planet.");
        }

        System.out.println("A Little Quiz");
        System.out.println("Are you ready for a quiz?Here it comes!");
        System.out.println("Q1) What is the capital of Alaska?");
        ArrayList<String> names = new ArrayList<String>();
        names.add("1. Melbourne");
        names.add("2. Anchorage");
        names.add("3. Juneau");

        for(String name1:names) {
            System.out.println(name1);
        }
        int correctanswer=0;
        Scanner input3 = new Scanner(System.in);
        int q1 = input3.nextInt();
        if (q1==3){
            System.out.println("That's right!");
            correctanswer++;
        }else{
            System.out.println("Sorry, the correct answer is Juneau.");

        }
        System.out.println("Q2) what is 1+1? ");
        ArrayList<String> answer = new ArrayList<String>();
        answer.add("1");
        answer.add("2");
        for(String answer1:answer) {
            System.out.println(answer1);

        }
        Scanner input4 = new Scanner(System.in);
        int q2 = input4.nextInt();
        if (q2==2){
            System.out.println("That's right!");
            correctanswer++;
        }else{
            System.out.println("Sorry, the correct answer is 2.");

        }
        System.out.println("Q3) Where is Canada located? ");
        ArrayList<String> location = new ArrayList<String>();
        location.add("1. North America");
        location.add("2. South America");
        for(String location1:location) {
            System.out.println(location1);
        }
        Scanner input5 = new Scanner(System.in);
        int q3 = input5.nextInt();
        if (q3==1){
            System.out.println("That's right!");
            correctanswer++;
        }else{
            System.out.println("Sorry, the correct answer is North America.");

        }


        System.out.println("Overall, you get "+correctanswer+" out of 3 correct.");
        System.out.println("Thanks for playing!");
    }
}

