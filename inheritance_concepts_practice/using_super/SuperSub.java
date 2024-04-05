package inheritance_concepts_practice.using_super;

class Super
{
    Super()
    {
        System.out.println("Constructor of Super class called...");
    }
}

class Sub extends Super
{
    Sub()
    {
        super();
        System.out.println("Constructor of Sub class called...");
    }
}

public class SuperSub 
{
    public static void main(String[] args)
    {
        Sub obj = new Sub();
    } 
}
