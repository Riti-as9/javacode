import java.util.Scanner;

class Student {
    int roll;
    String name;
    int[] marks = new int[3];

    int calculateTotal() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }
}

public class studentresult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Roll Number: ");
        s.roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            s.marks[i] = sc.nextInt();
        }

        System.out.println("Total Marks: " + s.calculateTotal());
        System.out.println("Average Marks: " + s.calculateAverage());
    }
}
