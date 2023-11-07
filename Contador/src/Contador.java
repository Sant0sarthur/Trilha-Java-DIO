import java.util.Scanner;



public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro paramentro: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo paramentro: ");
        int n2 = sc.nextInt();
        try{
            if (n1 > n2){
                throw new Exception ("Número 1 precisa ser maior que número 2.");
            }
        }
        catch( Exception e){
            System.out.println("Aconcteceu um erro");
            System.out.println(e.getMessage());
        }
        sc.close();
       
    } 

    static void contar(int n1, int n2) {
        int sub = n2 - n1;
        for (int aux = 1; aux <= sub; aux++){
            System.out.println("Imprindo o número " + aux);
        }

    }
}
