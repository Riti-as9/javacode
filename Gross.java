interface Gross {
    double calculateGross();
}

class Salary implements Gross {
    double basic = 10000, hra = 2000, da = 1000;

    public double calculateGross() {
        return basic + hra + da;
    }
}

class Employee extends Salary {
    String name = "Vivek";
    int id = 101;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Gross Salary: " + calculateGross());
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}