package Task3;

import  java.util.Scanner;
import  java.util.Arrays;

public class Main {

    static String[] names;

    public static void main(String[] args) {

        names = new String[]{"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter wanted name: ");
        String name = scan.nextLine();
        int count = 0;

        boolean check = Arrays.asList(names).contains(name);

            if (check == true) {
                count++;
                if (name.equals(names[0])){
                    int Bobcounter = count + 1;
                    System.out.println("There is " + Bobcounter + " " + name + " in list");
                } else {
                System.out.println("There is " + count + " " + name + " in list");
                }
            } else {
                System.out.println("There is no " + name + " in list");
            }


        scan.close();

    }
}
