package oop_lab4;

public class overloadmethod {
//1. overload Methode
//2. overloading Methode
//3. Methode overloading/overload

    public class OverLoadMethod {
        public static void A(){
            System.out.println("Hello Al");
        }
        public static void A(int x){
            System.out.println("Hello"+x);
        }
        public static void A(int x,int y){
            System.out.println("Hello "+(x+y));
        }

        public static void main(String[] args){
            A();
            A(10);
            A(10,20);


        }//main
    }//class