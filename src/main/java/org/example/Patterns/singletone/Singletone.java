package org.example.Patterns.singletone;

public class Singletone {
    static Singletone s;
    static boolean isCreated = false;
   private Singletone(){
       System.out.println("1Hello world from singletone!");
   }

   static public Singletone createSingletone(){
       if(!isCreated){
           s = new Singletone();
           isCreated = true;
       }
       return s;
   }
}
