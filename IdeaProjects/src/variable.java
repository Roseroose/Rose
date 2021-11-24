public class variable
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;


        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
        System.out.print(System.lineSeparator());

        int room = 113;
        double value = 2.71828;
        String subject = "Computer Science";
        System.out.println("This is room # " + room);
        System.out.println("e is close to " + value);
        System.out.println("I am learning a bit about " + subject);
        System.out.print(System.lineSeparator());

        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Information Systems";
        String teacher1 = "Ms. Lapan";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Mrs. Barnett";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";
        System.out.println("+------------------------------------------------------------+");
        System.out.println("| 1 |                          " + course1 + " |       " + teacher1 + " |");
        System.out.println("| 2 |                          " + course2 + " |     " + teacher2 + " |");
        System.out.println("| 3 |                         " + course3 + " |       " + teacher3 + " |");
        System.out.println("| 4 |                        " + course4 + " |      " + teacher4 + " |");
        System.out.println("| 5 |           " + course5 + " |      " + teacher5 + " |");
        System.out.println("| 6 |                             " + course6 + " |    " + teacher6 + " |");
        System.out.println("| 7 |                        " + course7 + " | " + teacher7 + " |");
        System.out.println("| 8 |" + course8 + " |       " + teacher8 + " |");
        System.out.println("+------------------------------------------------------------+");
    }


}
