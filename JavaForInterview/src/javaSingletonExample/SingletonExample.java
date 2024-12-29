package javaSingletonExample;

 class Singleton{
    private static Singleton single_instance = null;
    public String s;
    //private constructor
    private Singleton(){
        s = "Hello I am a String part of Singleton class";
    }
    public static synchronized Singleton getInstance(){
            if(single_instance == null){
                single_instance = new Singleton();
            }
            return single_instance;
     }
}
public class SingletonExample {
     public static void main(String[] args){
         Singleton x = Singleton.getInstance();
         Singleton y = Singleton.getInstance();
         Singleton z = Singleton.getInstance();

         System.out.println("Hashcode of x is "+x.hashCode());
         System.out.println("Hashcode of y is "+y.hashCode());
         System.out.println("Hashcode of z is "+z.hashCode());

         if(x==y && y==z){
             System.out.println("Three Objects points to the same memory location on the heap i.e. to the same object");
         }else{
             System.out.println("Three Objects doesn't share same memory location on the heap i.e. to the same object");
         }

     }
}
