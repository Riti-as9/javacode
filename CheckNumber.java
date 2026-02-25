class CheckNumber{
    int n;
    void checkNumber(){
        if(n>0)
            System.out.println("The number is positive");
        else if (n<0)
            System.out.println("The number is negative");
        else if(n==0)
            System.out.println("The number is zero");
        else 
            System.out.println("The number is non-real");
    }
    public static void main(String[]args)
    {
        CheckNumber obj = new CheckNumber();
        obj.n = 7;
        obj.checkNumber();
    }
}

