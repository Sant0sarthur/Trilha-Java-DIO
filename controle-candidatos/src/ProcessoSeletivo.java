import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    
    public static void main(String[] args) throws Exception {
        selecaoCandidato();
    }


    static void selecaoCandidato (){
        String [] candidatos = {"Felipe", "Marcia", "Artur", "João", "Berg", "Voleide", "Tati", "Linde", "Alvaro", "Saulo"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        String[] candidatossele = new String[5];

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = salario();
            System.out.println( "O candidato " + candidato + " solicitou este salario " + salarioPretendido +".");

            if (salarioBase >= salarioPretendido){
                candidatossele[candidatosSelecionados] = candidatos[candidatosAtual];
                candidatosSelecionados++;
            }
            candidatosAtual++;
            
        }

        if (candidatosSelecionados < 5){
            System.out.println("\nNão conseguimos escolher os 05, escolhemos apenas "+ candidatosSelecionados);
            imprimir(candidatossele);
        }
        else {
            imprimir(candidatossele);
        }
        
        System.out.println("----------------------------------------------------");
        System.out.println("Tentativa de contato. \n");
        entrandoEmContato(candidatossele);

    
    }

    static void entrandoEmContato(String selecionados[]){
        for (String aux: selecionados){
            if (aux == null){
                break;
            }
            else{
                int nTentativas = 1;
                boolean continuarTentando = true;
                boolean atendeu = false;
                do {
                    atendeu = anteder();
                    continuarTentando = !atendeu;
                    if (continuarTentando){
                    nTentativas++;
                    }else{
                        System.out.println("Contato realizado.");
                    }
                }while( continuarTentando && nTentativas < 3);
                
                if (atendeu){
                    System.out.println("Fizemos contato com o candidato " + aux + " na tentativa de nº "+ nTentativas+ ".\n");
                }
                else{
                System.out.println("Não conseguimos entrar em contato com o candidato " +aux+", número de tentativas máxima alcançado.\n" );
                }
            }
        }
    }

    static boolean anteder(){
        return new Random().nextInt(3)==1;
    }

    static void imprimir(String Selecionados[]){
        for (int index = 0; index < Selecionados.length; index++){
            if(Selecionados[index] == null){
                break;
            }
            else{
                System.out.println("O candidato de nº "+ (index+1) + " selecionado foi: " + Selecionados[index]);
            }
        }
    }
    
    static double salario(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido)
            System.out.println("Ligar para candidato");
        else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidto com contra proposta");
        else 
            System.out.println("Aguardando resultado de outros.");
    }
}
