package com.company;
  /*import  java.util.Scanner;
 public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       System.out. println("Input: ");

        int a = 3;
       // int b = 24;
        int b = in.nextInt();
        int c = b / a ;
        int d = b % a;
        if(d == 0)
        {
        System.out.println("true");}
       else  {
          System.out.println( "false" );
       }

    }

}*/


public class Main{
    String name;
    int  age;
    Main(){

    }
    Main(String name){
        this. name = name;
    }
    Main(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: " + name + "Age: " + age);
    }
    public static void main(String[] args){
        Main obj1 = new Main();
        Main obj2 = new Main("Yurii");
        Main obj3 = new Main("Yurii", 48);
        obj1.display();
        obj2.display();
        obj3.display();
    }
}
