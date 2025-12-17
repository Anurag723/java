class Parent {

    // Static block
    static {
        System.out.println("Parent - Static Block");
    }

    // Instance Initialization Block
    {
        System.out.println("Parent - IIB");
    }

    // Constructor
    Parent() {
        System.out.println("Parent - Constructor");
    }
}

class ChildIIB extends Parent {

    // Static block
    static {
        System.out.println("Child - Static Block");
    }

    // Instance Initialization Block
    {
        System.out.println("Child - IIB");
    }

    // Constructor
    Child() {
        System.out.println("Child - Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        new Child();
    }
}
