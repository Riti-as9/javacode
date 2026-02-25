public class SwapTwo {
    int num;
    SwapTwo(int n){
        num= n;
    }
    void swap(SwapTwo obj){
        int temp= this.num;
        this.num=obj.num;
        obj.num=temp;
    }
    void display(){
        System.out.println(num);

    }
    public static void main (String[]args){
        SwapTwo obj1 = new SwapTwo(10);
        SwapTwo obj2= new SwapTwo(20);

        System.out.println("Before Swapping:");
        obj1.display();
        obj2.display();

        obj1.swap(obj2);

        System.out.println("After Swapping:");
        obj1.display();
        obj2.display();

    }
}
