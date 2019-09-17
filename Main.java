	
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        String nome = "Maria Silva";
        int id, dia, mes, ano;
        Evento silencio = new Evento();
        
        System.out.println("Informe nome: ");
        nome = sc.nextLine();
        System.out.println("Informe id: ");
        id = sc.nextInt();
        System.out.println("Informe dia: ");
        dia = sc.nextInt();
        System.out.println("Informe mes: ");
        mes = sc.nextInt();
        System.out.println("Informe ano: ");
        ano = sc.nextInt();
        //sc.next();
        

        silencio.setId(id);
        silencio.setNome(nome);
        silencio.getOcorrencia().setDia(dia);
        silencio.getOcorrencia().setMes(mes);
        silencio.getOcorrencia().setAno(ano);

        System.out.println();
        System.out.println("Nome: " + silencio.getNome());
        System.out.println("id: " + silencio.getId());
        System.out.println("Data: "+silencio.getOcorrencia().getFormated());

    }
}