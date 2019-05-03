public class StaticExample {
    static int a=5;
    public static void main(String[] args) {
        StaticExample se = new StaticExample();
        se.print(5);
        //System.out.println(print(5));
        System.out.print(a);
    }

    private int print(int i) {
        a=0;
        return a;
    }
}


class demo {

    public static void main(String args[]) {
        demo d = new demo();
        d.add(10,20);     // to call the non-static method
    }

    public void add(int x ,int y) {
        int a = x;
        int b = y;
        int c = a + b;
        System.out.println("addition" + c);
    }
}


/*
class Sample{
int i_val;
public static void main(String[] xyz){
System.out.println("i_val is
:"+this.i_val);
}
}
* This keyword can't referred inside static method
*
*
*
class Sample{
int i_val=10;
Sample(int i_val){
this.i_val=i_val;
System.out.println("inside Sample
i_val: "+this.i_val);
}
public static void main(String[] xyz){
Sample o = new Sample();}
}


No default constructor created

 */