package inheritance_concepts_practice.single_inheritance;

class Base
{
    void baseMethod()
    {
        System.out.println("Base method called...");
    }
}

class Derived extends Base
{
    void derivedMethod()
    {
        System.out.println("Derived method called....");
    }
}

public class Single {
    public static void main(String[] args)
    {
        Derived obj = new Derived();

        obj.baseMethod();
        obj.derivedMethod();
    }
}
