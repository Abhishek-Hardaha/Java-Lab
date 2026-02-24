import java.util.Scanner;

class Calculator{
	int add(int a, int b){
		return a + b;	
	}
	int subtract(int a, int b){
		return a - b;
	}
	int multiply(int a, int b){
		return a * b;
	}
	int divide(int a, int b){
		return a / b;
	}
}

public class CalculatorAppDoWhile{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		Calculator calc= new Calculator();
		int choice;
		do{
			System.out.println("Menu: ");
			System.out.println("1. Addition ");
			System.out.println("2. Subtraction ");
			System.out.println("3. Multiplication ");
			System.out.println("4. Division ");
			System.out.println("5. Exit ");
			System.out.println("Enter your choice: ");
			choice= sc.nextInt();

			if(choice >= 1 && choice <= 4){
				System.out.println("Enter first number: ");
				int x= sc.nextInt();
				System.out.println("Enter second number: ");
				int y= sc.nextInt();
			
				switch(choice){
					case 1:
						System.out.println("Result: " + calc.add(x, y));
						break;
					case 2:
						System.out.println("Result: " + calc.subtract(x, y));
						break;
					case 3:
						System.out.println("Result: " + calc.multiply(x, y));
						break;
					case 4:
						System.out.println("Result: " + calc.divide(x, y));
						break;
				}
			}
			else if(choice == 5){
				System.out.println("Exiting.....");
			}
			else{
				System.out.println("Invalid Choice!");	
			}
		}while(choice != 5);
	}
}
