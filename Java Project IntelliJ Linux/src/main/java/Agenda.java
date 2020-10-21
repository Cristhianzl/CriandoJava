import java.awt.*;
import java.util.Scanner;

public class Agenda {
    public static void main (String [] args) {

        String [] nome = new String[20];
        String [] endereco = new String[20];
        Integer[] telefone = new Integer[20];

        for (int i = 0;i<20;i++){
            nome[i] = "";
            telefone[i] = null;
            endereco[i] = "";
        }

        String nomeExcluir = "";
        String continuar = "";
        String opcao = "";
        Scanner entrada = new Scanner(System.in);
        int posicao = 0;



        do {
            System.out.println("Escolha a opcao: \n Incluir - Listar - Excluir - Sair");
            opcao = entrada.nextLine();

            switch (opcao){
                case "Incluir":
                    //Codigo para Incluir
                    do {
                        System.out.print("Digite o nome: ");
                        nome[posicao] = entrada.nextLine();

                        System.out.print("Digite o endereco: ");
                        endereco[posicao] = entrada.nextLine();

                        System.out.print("Digite o telefone: ");
                        telefone[posicao] = Integer.valueOf(entrada.nextLine());

                        System.out.print("Deseja continuar? ");
                        continuar = entrada.nextLine();

                        posicao++;


                    }while (continuar.equals("Sim"));
                    break;

                case "Listar":
                    //Codigo para Listar
                    for (int i=0 ; i<20 ; i++){
                        if (!nome[i].equals("")){

                        System.out.println("Nome: " + nome[i] + " " +
                                "Telefone: " + telefone[i] + " " +
                                "Endereco: " + endereco[i]);
                        }
                    }
                    break;

                case "Excluir":
                    //Codigo para Excluir
                    System.out.print("Quem deseja excluir? ");
                    nomeExcluir = entrada.nextLine();
                    for (int i=0;i<20;i++){
                        if(nome[i].equals(nomeExcluir)){
                            nome[i] = "";
                            telefone[i] = null;
                            endereco[i] = "";
                        }

                    }

                    break;

                case "Sair":
                    //Codigo para sair
                    System.out.println("Programa Finalizado!");
                    return;

                default:
                    //Opcao Invalida
                    System.out.println("Opcao Invalida! Tente novamente.");
                    break;
            }


        }while (!opcao.equals("Sair"));
    }
}
