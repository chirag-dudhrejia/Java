package inheritance_concepts_practice.hierarchical_inheritance;

class Base
{
    void baseMethod()
    {
        System.out.println("Base method called...");
    }
}

class Derived1 extends Base
{
    void derived1method()
    {
        System.out.println("Derived1 method called...");
    }
}

class Derived2 extends Base
{
    void derived2Method()
    {
        System.out.println("Derived2 method called...");
    }
}

public class Hierarchical
{
    public static void main(String[] args)
    {
        Derived1 d1 = new Derived1();
        Derived2 d2 = new Derived2();

        d1.baseMethod();
        d1.derived1method();

        System.out.println();

        d2.baseMethod();
        d2.derived2Method();
    }
}