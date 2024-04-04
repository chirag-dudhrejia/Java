package inheritance_concepts_practice.multi_level_inheritance;

class Base
{
    void baseMethod()
    {
        System.out.println("Base method called...");
    }
}

class Derived1 extends Base
{
    void derived1Method()
    {
        System.out.println("Derived1 method called...");
    }
}

class Derived2 extends Derived1
{
    void derived2Method()
    {
        System.out.println("Derived2 method called...");
    }
}

public class Multilevel
{
    public static void main(String[] args)
    {
        Derived2 obj = new Derived2();

        obj.baseMethod();
        obj.derived1Method();
        obj.derived2Method();
    }
}