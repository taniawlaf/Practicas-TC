import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner ent = new Scanner(System.in);
    String llamada=ent.nextLine();
    int clave=0;
    int numin=0;
    double precio=0;
    String[] p1=llamada.split(",");
     clave=Integer.parseInt(p1[0]);
     numin=Integer.parseInt(p1[1]);
    if(clave==12){
        precio=2*numin;
    }else if(clave==15){
        precio=2.2*numin;
    }else if(clave==18){
        precio=4.5*numin;
    }else if(clave==19){
        precio=3.5*numin;
    }else if(clave==23||clave==25){
        precio=6*numin;
    }else if(clave==29){
        precio=5*numin;
    }
    System.out.println(""+precio);
  }
}