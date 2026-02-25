public class Factorial {
    int number= 5;
    int calculateFactorial(){
        int fact = 1;
        for(int i = 1; i<=number; i++){
            fact= fact*i;

        }
        return fact;
    }
    public static void main (String[]args){
         Factorial obj = new Factorial();
         int result = obj.calculateFactorial();
         System.out.println("Factorial of "+obj.number +" is: "+ result);
    }
}
