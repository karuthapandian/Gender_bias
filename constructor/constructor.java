public class constructor {
    constructor(String name,int code)
    {
        System.out.println("Welcome");
        String collegeName = name;
        int collegeCode = code;
        System.out.println("College name is :" +collegeName);
        System.out.println("College code is :" +collegeCode);
    }

    public static void main (String[] args){
        constructor obj = new constructor("xyz", 101);
    }
}
