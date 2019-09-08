public class Calculator{
	public static void main(String[] args){

		System.out.println(addition(3,4));
		System.out.println(subtraction(13,4));
		System.out.println(multiplication(5,4));
		System.out.println(division(12,4));
                
	}

	double addition(double x, double y){
		return x + y;
	}

	double subtraction(double x, double y){
		return x - y;
	}
 
   double multiplication(double x, int double){
		return x * y;
	}

	double division(double x, double y){
		return x / y;
	}
 
}