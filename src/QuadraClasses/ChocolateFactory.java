package QuadraClasses;

public class ChocolateFactory {
	
	
public static void main(String[] args) {
	ChocolateFactory factory = new ChocolateFactory();
	factory.Chocolates(5, 8);
	factory.truffles(7, 3);
	factory.mms(6,108);
	
}
public static int Chocolates(int i, int n){
System.out.println("Chocolates: " + n + i);
return(n + i);
}
public static int truffles(int i, int n){
System.out.println("truffles: " + n + i);
return(n + i);
}
public static int mms(int i, int n){
System.out.println("M&Ms: " + n + i);
return(n + i);
}
}
