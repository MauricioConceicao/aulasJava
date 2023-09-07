import java.util.LinkedList;
import java.util.Scanner;

public class tarefas {


    public static void main(String[] args) {
        
        Scanner ler = new Scanner( System.in);
        LinkedList<String> pilha = new LinkedList<String>();
        int op = 0;


        while(op != 3){

            System.out.println("=============================");
            System.out.println("1 - inserir Tarefa:");
            System.out.println("2 - mostrar proxima tarefa: ");
            System.out.println("3 - Sair.");

            System.out.println("Digite uma das opcoes a cima:");
            op = ler.nextInt();
            ler.nextLine();//come a quebra de linha

            if(op == 1 ){

                System.out.println("digite a tarefa: ");
                pilha.addLast(ler.nextLine());
                
                

            
            }else if(op == 2){

                if(!pilha.isEmpty()){

                    System.out.println(pilha.getLast());// pega o primeiro da lista e imprime
                    pilha.removeLast();// remove o primeiro da lista

                }else{



                    System.out.println("pilha vazia!");


                }
                
                



            }else{

                System.out.println("tchau");

            }





        }


    }


}
