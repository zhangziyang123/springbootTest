public class ClassLoadTest {
    //private static ClassLoadTest test = new ClassLoadTest();

   

    
    
    public static String getInsta(){
    	System.out.println("静态便令初始化test1");
    	return "a";
    }

    public static void main(String[] args) {
        System.out.println(new ClassLoadTest());
    }
}