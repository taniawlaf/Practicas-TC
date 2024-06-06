import java.util.Scanner;

public class Omega {

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
        //System.out.println("Ingresa opcion \nD:depositar \nR:retirar \nC:consultar \nS:salir");
        opcion = entrada.next().charAt(0);
        if(opcion=='D'){	
          double dep = entrada.nextDouble();
          saldo=depositar(saldo,dep);
        }else if(opcion=='R'){
          double ret = entrada.nextDouble();
          saldoAux=retirar(saldo,ret);
          if(saldoAux==-1.00){
            saldoAux=0.00;
          }else{
            saldo=saldoAux;
          }
        }else if(opcion=='C'){
          System.out.println("$"+saldo);
        }else if(opcion=='S'){
          salir=-1;
        }
      }while(salir!=-1);   
  }
}