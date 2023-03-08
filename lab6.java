
/**
 *
 * @author samue
 */
import java.util.Scanner;
import java.util.Arrays;

//import java.lang.String.indexOf();
public class lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean[] seats = { false, false, false, false, false, false, false, false, false, false };
        Scanner input = new Scanner(System.in);
        String decision;
        int choice;
        int ec = 5;
        int fc = 0;
        int index;
        Boolean flag = true;

        while (flag == true) {
            if (ec == 10 && fc == 5) {
                System.out.print("The Plane is now full");
                flag = false;
            } else {
                System.out.println("Please type 1 for first Class");
                System.out.println("Please type 2 for Economy Class");
                System.out.print("Choice: ");
                choice = input.nextInt();
                // System.out.print(seats[1]);
                if (choice == 1) {
                    if (fc < 5) {
                        for (; fc < 5; fc++) {
                            seats[fc] = true;
                            System.out.println("First Class. Seat #" + (fc + 1));
                            fc++;
                            break;

                        }
                    } else {
                        System.out.println("First class is full, Economy Class?");
                        System.out.print("1. Yes, 2.No. Your Choice: ");
                        choice = input.nextInt();
                        if (choice == 1) {
                            if (ec < 10) {
                                // index = Booleans.indexOf(seats, false);
                                for (int i = 0; i < seats.length; i++) {
                                    if (seats[i] == false) {
                                        seats[i] = true;
                                        System.out.println("Economy Class. Seat #" + (i + 1));
                                        ec++;
                                        break;
                                    }
                                }

                            } else {
                                System.out.println("Economy Class is also full, flight leaves in 3 hrs.");

                            }
                        } else {
                            System.out.println("Next Flight leaves in 3hrs.");
                            flag = false;
                        }

                    }

                } else {
                    if (ec < 10) {
                        for (; ec < 10; ec++) {
                            seats[ec] = true;
                            System.out.println("Economy Class. Seat #" + (ec + 1));
                            ec++;
                            break;
                        }
                    } else {
                        System.out.println("Economy class is full, First Class?");
                        System.out.print("1. Yes, 2.No. Your Choice: ");
                        choice = input.nextInt();
                        System.out.println();
                        if (choice == 1) {
                            if (fc < 5) {
                                // seats.indexOf(false);
                                for (int i = 0; i < 5; i++) {
                                    if (seats[i] == false) {
                                        seats[i] = true;
                                        System.out.println("First Class. Seat #" + (i + 1));
                                        fc++;
                                        break;
                                    }
                                }

                            } else {
                                System.out.println("Economy Class is also full, flight leaves in 3 hrs.");

                            }
                        } else {
                            System.out.println("Next Flight leaves in 3hrs.");
                            flag = false;
                        }
                    }
                }
            }

        }

        // System.out.println("Please type 1 for first Class");
        // System.out.println("Please type 2 for Economy Class");
        // System.out.print("Choice: ");
        // choice = input.nextInt();
        // //System.out.print(seats[1]);
        // if (choice == 1 ){
        // if(fc < 5){
        // for(;fc < 5; fc++){
        // seats[fc] = true;
        // System.out.println("First Class. Seat #" + (fc + 1));
        // break;
        // }
        // }
        // else{
        // System.out.println("Do you want to be placed in Economy Class");
        // decision = input.next();
        // if(decision == "Yes"){
        // if (ec < 10){
        // //index = Booleans.indexOf(seats, false);
        // for(int i=0; i < seats.length; i++){
        // if (seats[i] == false){
        // seats[i] = true;
        // System.out.println("Economy Class. Seat #" + (ec + 1));
        // break;
        // }
        // }
        //
        // }
        // else {
        // System.out.println("Economy Class is also full, flight leaves in 3 hrs.");
        //
        // }
        // }
        // else{
        // System.out.println("Next Flight leaves in 3hrs.");
        // }
        //
        // }
        //
        // }
        // else{
        // if(ec < 10){
        // for(;ec < 10; ec++){
        // seats[ec] = true;
        // System.out.println("Economy Class. Seat #" + (ec + 1));
        // break;
        // }
        // }
        // else{
        // System.out.println("Do you want to be placed in First Class");
        // decision = input.next();
        // if(decision == "Yes"){
        // if (fc < 5){
        // //seats.indexOf(false);
        // for(int i=0; i < 5; i++){
        // if (seats[i] == false){
        // seats[i] = true;
        // System.out.println("First Class. Seat #" + (ec + 1));
        // break;
        // }
        // }
        //
        // }
        // else {
        // System.out.println("Economy Class is also full, flight leaves in 3 hrs.");
        //
        // }
        // }
        // else{
        // System.out.println("Next Flight leaves in 3hrs.");
        // }
        // }
        // }
    }
}