package java;

import AccessModifier.MyClass_1;
import AccessModifier.MyClass_Private;
import AccessModifier.MyClass_Protected;

public class HelloWorld extends MyClass_Protected {

    static String name="Hello, World";

    String numb="1223";

  //  Control structures: if, switch, for, while, and do-while


    public static void main(String[] args){
        System.out.println(name);

        MyClass_1 myClass_1=  new MyClass_1();
        myClass_1.publicVariable=0;
        myClass_1.genericMethod();


        MyClass_Private myClass_private=new MyClass_Private();
        //myClass_private.

        HelloWorld helloWorld=new HelloWorld();
        helloWorld.protectedVar=0;

    }

}
