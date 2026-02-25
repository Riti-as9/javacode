public class Outer {
    private String message = "Hello from Outer class";

    class Inner {
        void display() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.display();  
    }
}
