import java.util.Scanner;

public class Cajero {

  public static double retirar(double saldo, double ret){
	double res=0;
	if(saldo>=ret){
		res=saldo-ret;
	}else{
		res =-1.00;
	}
	return res;
  }

  public static double depositar(double saldo, double dep){
	double sum=0;
	if(dep>0){
		sum=saldo+dep;	
	}
	return sum;
  }

  public static void main(String[] args) {
    double saldo=1000.00;
	double saldoAux=0.00;
    Scanner entrada = new Scanner(System.in);
	char opcion;
	int salir=0;
	do{
		System.out.println("Ingresa opcion \nD:depositar \nR:retirar \nC:consultar \nS:salir");
		opcion = entrada.next().charAt(0);
		if(opcion=='D'||opcion=='d'){	
			System.out.println("Ingresa monto a depositar:");
			double dep = entrada.nextDouble();
			saldo=depositar(saldo,dep);
			System.out.println("Saldo:"+saldo);
		}else if(opcion=='R'||opcion=='r'){
			System.out.println("Ingresa monto a retirar:");
			double ret = entrada.nextDouble();
			saldoAux=retirar(saldo,ret);
			if(saldoAux==-1.00){
				System.out.println("Saldo insuficiente");
				saldoAux=0.00;
			}else{
				saldo=saldoAux;
			}
			System.out.println("Saldo:"+saldo);
		}else if(opcion=='C'||opcion=='c'){
			System.out.println("Saldo actual: "+saldo);
		}else if(opcion=='S'||opcion=='s'){
			System.out.println("Adios :)");	 
			salir=-1;
		}
	}while(salir!=-1);   
  }
}