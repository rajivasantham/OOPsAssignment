package polymorphism;

public class Concating extends Polymorphism {
    public void add(int a,int b){
        String str1=Integer.toString(a);
        String str2=Integer.toString(b);
        System.out.println("conacting:"+(str1+str2));
    }

    public static void main(String[] args) {
        Polymorphism p2=new Polymorphism();
        Polymorphism p3=new Concating();
        p2.add(5,6);
        p3.add(10,10);
    }
}
