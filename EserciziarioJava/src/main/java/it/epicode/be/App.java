package it.epicode.be;

/**
 * Hello world!
 *
 */
//public class App 
//{
//	
//	
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//        Albero a = new Abete();
//        a.cresce(); 
//        System.out.println(b());
//        
//    }
//    
//    int b () {
//    	return 20;
//    }
//    
//    
//}


class Base {
    public static void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends Base {
    public static void show() {
       System.out.println("Derived::show() called");
    }
}
  
class App {
    public static void main(String[] args) {
        Base b = new Derived();;
        Base.show();
    }
}



