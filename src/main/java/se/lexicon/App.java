package se.lexicon;


import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.*;

public class App {
    public static void main(String[] args) {
        ch4();

    }

    public static void ex1() {
        //1. Create a new list and populate it with the days of the week. Lastly, print the out the list.
        List<String> weekDays = new ArrayList<String>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        System.out.print(weekDays);
    }

    public static void ex2() {
        //2. Create a new list and populate it with the days of the week.
        // Lastly, iterate through the list and print out each element separately.
        List<String> weekDays2 = new ArrayList<String>();
        weekDays2.add("Monday");
        weekDays2.add("Tuesday");
        weekDays2.add("Wednesday");
        weekDays2.add("Thursday");
        weekDays2.add("Friday");
        weekDays2.add("Saturday");
        weekDays2.add("Sunday");
        Iterator itr = weekDays2.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        //OR YOU CAN USE for each LOOP!
        /*for (String s: weekDays2){
            System.out.println(s);
        }*/
    }

    public static void ex3() {
        //3. Create a new list and populate it with the days of the week excluding THURSDAY.
        // Lastly, insert the weekday THURSDAY into the right position in the list.
        List<String> weekDays3 = new ArrayList<String>();
        weekDays3.add("Monday");
        weekDays3.add("Tuesday");
        weekDays3.add("Wednesday");
        weekDays3.add("Friday");
        weekDays3.add("Saturday");
        weekDays3.add("Sunday");
        weekDays3.add(3, "Thursday");
        Iterator itr3 = weekDays3.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());

        }

    }

    public static void ex4() {
        //4. Create a new list and populate it with the days of the week.
        // Then create a new list out of the first three elements of the first list using a subList.
        List<String> weekDays4 = new ArrayList<String>();
        weekDays4.add("Monday");
        weekDays4.add("Tuesday");
        weekDays4.add("Wednesday");
        weekDays4.add("Thursday");
        weekDays4.add("Friday");
        weekDays4.add("Saturday");
        weekDays4.add("Sunday");
        System.out.println("Original weekDays4: " + weekDays4);
        List<String> weekDays41 = weekDays4.subList(0, 3);
        System.out.println("New list with 3 first elements: " + weekDays41);
    }

    public static void ex5() {
        //5. Create a new hashset and populate it with the days of the week.
        // Lastly, print the set out and pay attention to the order of the elements.
        HashSet<String> setWd = new HashSet<String>();
        setWd.add("Monday");
        setWd.add("Tuesday");
        setWd.add("Wednesday");
        setWd.add("Thursday");
        setWd.add("Friday");
        setWd.add("Saturday");
        setWd.add("Sunday");
        System.out.println(setWd); //prints: [Monday, Thursday, Friday, Sunday, Wednesday, Tuesday, Saturday]

    }

    public static void ex6() {
        //6. Create a new hashSet and populate it with the days of the week.
        // Then convert the hashSet to an arrayList.
        HashSet<String> setWd6 = new HashSet<String>();
        setWd6.add("Monday");
        setWd6.add("Tuesday");
        setWd6.add("Wednesday");
        setWd6.add("Thursday");
        setWd6.add("Friday");
        setWd6.add("Saturday");
        setWd6.add("Sunday");
        ArrayList<String> wd6_array = new ArrayList<String>(setWd6);
        System.out.println("New ArrayList: " + wd6_array); //Prints: New ArrayList: [Monday, Thursday, Friday, Sunday, Wednesday, Tuesday, Saturday]

    }

    public static void ex7() {
        //7. Create a new hashSet and populate it with random names.
        // Then convert the hashSet to an arrayList.
        // Lastly, manually sort the list in alphabetical order and print it out.
        HashSet<String> setNames = new HashSet<String>();
        setNames.add("Farhad");
        setNames.add("Samuel");
        setNames.add("Lilly");
        setNames.add("Nivie");
        setNames.add("Veronica");
        ArrayList<String> array_Names = new ArrayList<String>(setNames);
        Collections.sort(array_Names);
        System.out.println(array_Names); //prints: [Farhad, Lilly, Nivie, Samuel, Veronica]
    }

    public static void ex8() {
        //8. Create a new hashSet and populate it with random names.
        // Lastly, sort the names in alphabetical order using only a Set or a child of Set.
        HashSet<String> names = new HashSet<String>();
        names.add("Farhad");
        names.add("Samuel");
        names.add("Lilly");
        names.add("Nivie");
        names.add("Veronica");
        System.out.println(names);// prints: [Samuel, Veronica, Farhad, Nivie, Lilly]
        TreeSet myTreeSet = new TreeSet();
        myTreeSet.addAll(names);
        System.out.println(myTreeSet);//prints: [Farhad, Lilly, Nivie, Samuel, Veronica]
    }

    public static void ex9() {
        //9. Create a new hashMap of type <Integer,String> and populate it with elements containing an id(Integer)
        // and a car brand(String). Lastly, print out the entire hashMap.
        Map<Integer, String> cars = new HashMap<Integer, String>();
        cars.put(1, "Volvo");
        cars.put(2, "Mercedes");
        cars.put(3, "Mazda");
        System.out.println(cars); //prints: {1=Volvo, 2=Mercedes, 3=Mazda}
    }

    public static void ex10() {
        //10. Create a new hashMap of type <Integer,String>
        // and populate it with elements containing an id(Integer)
        // and a car brand(String). Lastly, print out only the keys.
        Map<Integer, String> cars2 = new HashMap<Integer, String>();
        cars2.put(1, "Volvo");
        cars2.put(2, "Mercedes");
        cars2.put(3, "Mazda");
        cars2.put(4, "BMW");
        for (Map.Entry entry : cars2.entrySet()) {
            System.out.println(entry.getKey());
        }

    }

    public static void ex11() {
        //11. Create a new hashMap of type <Integer,String>
        // and populate it with elements containing an id(Integer) and a car brand(String).
        // Lastly, print out only the values.
        Map<Integer, String> cars3 = new HashMap<Integer, String>();
        cars3.put(1, "Volvo");
        cars3.put(2, "Mercedes");
        cars3.put(3, "Mazda");
        cars3.put(4, "BMW");
        for (Map.Entry entry : cars3.entrySet()) {
            System.out.println(entry.getValue());
        }

    }

    public static void ex12() {
        //12. Create a new class and call it Car.
        // Add fields for Id,Brand and Model + getters and setters
        // Create a new hashMap of type <Integer,Car> and populate it
        // with elements containing an id(Integer) and a car object(Car).
        // Lastly, print out only the car's brand.
        Map<Integer, Car> carMap = new HashMap<Integer, Car>();
        carMap.put(1, new Car(23, "Volvo", "V90"));
        carMap.put(2, new Car(34, "Mercedes", "E220"));
        carMap.put(3, new Car(55, "Mazda", "X3"));


        for (Map.Entry<Integer, Car> carEntry : carMap.entrySet()) {
            System.out.println(carEntry.getValue().getBrand());

        }

    }

    private static void ch1() {
        //1. Create an empty set and populate it with the all the days of the week.
        // Next create a second set and populate it with ONLY the weekend days (SATURDAY and SUNDAY).
        // Lastly, compare the two sets and retain in the first set only those days that are the same in both sets.
        HashSet<String> setWd1 = new HashSet<String>();
        setWd1.add("Monday");
        setWd1.add("Tuesday");
        setWd1.add("Wednesday");
        setWd1.add("Thursday");
        setWd1.add("Friday");
        setWd1.add("Saturday");
        setWd1.add("Sunday");
        System.out.println("First set contains: " + setWd1);
        System.out.println("_________________________________");

        HashSet<String> setWend = new HashSet<String>();
        setWend.add("Saturday");
        setWend.add("Sunday");
        System.out.println("Second set contains: " + setWend);
        System.out.println("_________________________________");

        boolean bResult = setWend.addAll(setWd1);

        if (bResult) {
            System.out.println("Merging of Set 1 & Set 2 Successfull");
        }

        System.out.println("The new set contains= " + setWend);

    }

    public static void ch2() {
        //2. Create a new hashMap of types <String,String> and populate it with elements containing
        // an email (String) and a name (String).
        // Next, create a new Set and populate it with the keys from the hashMap you created.
        HashMap<String, String> contact = new HashMap<String, String>();
        contact.put("farhad@lexicon.se", "Farhad");
        contact.put("erik@lexicon.se", "Erik");
        contact.put("karin@lexicon.se", "Karin");
        // Finding the Set of keys from the HashMap
        Set<String> keySet = contact.keySet();
        // Making an array from the keys
        ArrayList<String> listOfKeys = new ArrayList<String>(keySet);
        //System.out.println(listOfKeys.toString());
        // Making a new set from the array
        HashSet<String> newContact = new HashSet<String>(listOfKeys);
        System.out.println(newContact.toString());//Prints: [karin@lexicon.se, farhad@lexicon.se, erik@lexicon.se]

    }

    public static void ch3() {
        //3. Create a new class and call it SuperHero.
        // Add fields for Id,Name and Age + getters and setters. Have the class implement the Comparable interface.
        // Implement the override method and have it compare the AGE of the superhero.
        // Next, create a new arrayList of type SuperHero. Sort the list by age and print out each element.
        List<SuperHero> superHeroList = new ArrayList<SuperHero>();
        superHeroList.add(new SuperHero(1, "Henrik", 24));
        superHeroList.add(new SuperHero(2, "Johanna", 23));
        superHeroList.add(new SuperHero(3, "Karin", 7));
        System.out.println(superHeroList.toString());
        Collections.sort(superHeroList);
        System.out.println(superHeroList.toString());

    }

    public static void ch4() {
        //4. Create an array of type int with numbers: {1,4,4,2,6,7}.
        // Next, create an appropriate Collection and populate it with the content of the int array.
        // Lastly, print out each element in the Collection without duplicates.
        int [] numbers = {1,4,4,2,6,7};
        Set<Integer> set = new HashSet<>();
        for (int v : numbers) {
            set.add(v);
        }
        System.out.println(set);//Prints [1, 2, 4, 6, 7]


    }

}



