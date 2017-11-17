public class Passer{

    private static String str = "Hi";
    private static int Integer = 2;
    
    public static String Stringer(String a){
	a += "1";
	return a;
    }

    public static int inter(int b){
	b += 1;
	return b;
    }

    public static void main (String[] args){
	
	System.out.println("str passes through fxn Stringer: expected Hi1");
	System.out.println(Stringer(str)); //Expected "Hi1"
	System.out.println("Integer passes through fxn inter: expected 3");
	System.out.println(inter(Integer)); //Expected 3
	
    }//end main 
}//end class
