/*
Name: Nathan Curtis
Date: 11/17/2024
Class: Computer Programming II 24FD-CSC372-1
Teacher: Luis Gonzalez
Assignment Name: Storing an array list of students
GitHub: https://github.com/NCurtisSchool/ProgramTwoMod6Opt1.git
*/

//Inport Scanner object
import java.util.Random;
import java.util.Scanner;

public class AssignmentSix {
    public static void main(String[] args) throws Exception {
        // Create array Size 10 hodling objects from Students
        Student[] arrStudents = new Student[10];

        // Scanner open
        Scanner userInput = new Scanner(System.in);

        // For loop, iterate 10 times. - Fill array with objects
        for(int i = 0; i < 10; i++) {
            // Random number 1 to 999 = rollno
            Random r = new Random();
            int rollno = (r.nextInt(998)+1);
            // Input Name
            System.out.println("Input your name: ");
            String name = userInput.nextLine();
            // Input Address
            System.out.println("Input your address: ");
            String address = userInput.nextLine();

            // Create Object
            Student newStudent = new Student(rollno, name, address);

            // Add object to Array
            arrStudents[i] = newStudent;
        }
        // Scanner Close
        userInput.close();

        // Sort by rollno
        System.out.println();
        sortRollno(arrStudents);

        // Sort by name
        System.out.println();
        sortName(arrStudents);
    }

    public static void sortRollno(Student[] arrStudents) { 
        //Insertion Sort Method
        int n = arrStudents.length;
        for (int i = 1; i < n; i++) {
            Student key = arrStudents[i];
            int j = i - 1;
            while (j >= 0 && arrStudents[j].getRollno() > key.getRollno()) {
                arrStudents[j + 1] = arrStudents[j];
                j--;
            }
            arrStudents[j + 1] = key;
        }

        // Print Sorted List
        System.out.println(String.format("%1$-15s %2$-15s %3$s", "Roll Number", "Name", "Address"));
        for (int i = 0; i < arrStudents.length; i++) {
            System.out.println(arrStudents[i].toStringRollno());
        }
    }

    // I have attempted to get this to work multiple times with different methods. I cant seem to. I dont get whats going on, expecially since my testing gave mixed results for the same inputs and the for loop seemed to start in the middle then go to the beginning then the end.
    public static void sortName(Student[] arrStudents) {
        //Insertion Sort Method
        int n = arrStudents.length;
        for (int i = 1; i < n; i++) {
            Student key = arrStudents[i];
            int j = i - 1;
            while (j >= 0 && arrStudents[j].getName().compareTo(arrStudents[j + 1].getName()) > 0) {
                arrStudents[j + 1] = arrStudents[j];
                j--;
            }
            arrStudents[j + 1] = key;
        }


        // Print Sorted List
        System.out.println(String.format("%1$-15s %2$-15s %3$s", "Name", "Roll Number", "Address"));
        for (int i = 0; i < arrStudents.length; i++) {
            System.out.println(arrStudents[i].toStringName());
        }
    }
}
