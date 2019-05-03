//class Test {
//    public static void main(String[] ar) {
//        int a = 10;
//        int b = 017; //Octal
//        int c = 0X3A; //Hexa
//        System.out.println(a + "," + b + "," + c);
//    }
//}
class Test {
    static int i =5; //static
    public static void main(String [ ] args) {
        int x;
        //System.out.println(i);   //Not initialized
        Num n = new Num();
        n.test();
    }

}
class Num {
    int i = 5; //instance or non-static
    void test() {
        System.out.println(i);
    }
}