package OSF.naukaJava.etap2.AccessModifiers;

public class AccessModofiersA {

    public static void main(String[] args) {

        //Public private, protected, default -

    }

    // Default: access method anywhere only in package
    void defaultAccess()
    {

    }

    // Public: variable/method as public: then you will have access across across all
    public void publicAccess()
    {

    }

    // Private: you can not access method or variable out side the class of same package
    private void privateAccess()
    {

    }

    // Protected: variable/method as protected: you can access those in +sub classes only (other packages and "extends")
    protected void protrctedAccess()
    {

    }

}
