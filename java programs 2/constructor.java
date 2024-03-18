public class constructor {
    constructor()
    {
        System.out.println("Hello");
    }
    constructor(int a )
    {
        int temp = a;
        System.out.println("Value is :"+temp);

    }
    public static void main(String [] args)
    {
        constructor obj1 = new constructor();
        constructor obj2 = new constructor(10);
    }

}
