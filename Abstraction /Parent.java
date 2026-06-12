public abstract class Parent{

    public abstract void study();

    public void spending(){
        System.out.println("parent spending ");
    }

    public static void main(String[] args){



        System.out.println();
    }

}

// class Parent {
//     static final int CAPACITY = 4;

//     public static void main(String[] args) {
//         CAPACITY = 5; 
//     }
// }

// final class A {
//     // fields and methods
// }

// // Illegal
// class B extends A { }

// class A {
//     final void m1() {
//         System.out.println("Final method");
//     }
// }

// class B extends A {
//     void m1() { } // compile-time error
// }

