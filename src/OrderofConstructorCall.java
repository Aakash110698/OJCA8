//class X {
//    X( ){
//        System.out.println("Inside X’s Constructor"); } }
//class Y extends X {
//    Y( ) {
//        System.out.println("Inside Y’s Constructor"); } }
//class Z extends Y {
//    Z(){
//        System.out.println("Inside Z’s Constructor"); } }
//class OrderofConstructorCallDemo{
//    public static void main(String args[]){
//        Z z = new Z();
//    }
//}


//class A1 {
//    A1() {
//        System.out.println("A1's no arg constructor");
//    }
//
//    A1(int a) {
//        System.out.println("A1's constructor " + a);
//    }
//}
//
//class B1 extends A1 {
//    B1() {
//        System.out.println("B1's no arg constructor");
//    }
//
//    B1(int b) {
//        super(1000);
//        System.out.println("B1's constructor " + b);
//    }
//}
//
//class C1 extends B1 {
//    C1() {
//        System.out.println("C1's no arg constructor");
//    }
//
//    C1(int c) {
//        //super(100);
//        System.out.println("C1's constructor " + c);
//    }
//}
//
//class TestingInheritance {
//    public static void main(String args[]) {
//        C1 cb = new C1(10);
//        //C1 ca = new C1();
//    }
//}


//class A1 {
//    A1() {
//        System.out.println("A1's no arg constructor");
//    }
//
//    A1(int a) {
//        System.out.println("A1 's constructor " + a);
//    }
//}
//
//class B1 extends A1 {
//    B1(){
//
//    }
//    B1(String x) {
//        super(50);
//        System.out.println("B1's no arg constructor");
//    }
//
//    B1(int b) {
//        super(1000);
//        System.out.println("B1‘s constructor" + b);
//    }
//}
//
//class C1 extends B1 {
//    C1() {
//        System.out.println("C1 's no arg constructor");
//    }
//
//    C1(int c) {
//        super(100);
//        System.out.println("C1 's constructor " + c);
//    }
//}
//
//class TestingInheritance {
//    public static void main(String args[]) {
//        C1 ca = new C1(10);
//    }
//}


//class A1 {
//    A1() {
//        System.out.println("A1's no arg constructor");
//    }
//
//    A1(int a) {
//        System.out.println("A1 's constructor " + a);
//    }
//}
//
//class B1 extends A1 {
//    B1() {
//        System.out.println("B1's no arg constructor");
//    }
//
//    B1(int b) {
//        this("x");
//        System.out.println("B1 's constructor " + b);
//    }
//
//    B1(String b) {
//        super(1000);
//        System.out.println("B1 's constructor " + b);
//    }
//}
//
//class C1 extends B1 {
//    C1() {
//        System.out.println("C1 's no arg constructor");
//    }
//
//    C1(int c) {
//        super(100);
//        System.out.println("C1 's constructor " + c);
//    }
//}
//
//class TestingInheritance {
//    public static void main(String args[]) {
//        C1 ca = new C1(10);
//    }
//}
//


