class Leapyear{
    int yr;
    void check(){
    if(yr%4==0)
        System.out.println(yr+ " is a leap year");
    else
        System.out.println(yr+ " is not a leap year");
    }
    public static void main(String[] args){
        Leapyear obj=new Leapyear();
        obj.yr=2013;
        obj.check();
    }
}