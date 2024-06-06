import java.util.Scanner;

public class Fibonacci{

	public static void cicloFibonacci(int cant){
		int a=0;
		int b=1;
		int sum=0;
		for (int i=0;i<cant;i++){
			if(i==0){
				System.out.println("\n"+a+" ");
			}else if(i==1){
				System.out.println(b+" ");
			}else{
				sum = a+b;
				a=b;
				b=sum;	
				System.out.println(sum+" ");
			}
		}
		
	}
	public static void main(String[] args){
		System.out.println("Ingresa la cantidad de numeros de la serie Fibonacci");
		Scanner inScan = new Scanner(System.in);
		int cant = inScan.nextInt();
		while(cant<=0){
			System.out.println("Ingresa una cantidad mayor a 0");
			cant = inScan.nextInt();
		}	
		cicloFibonacci(cant);
	}



}