import java.util.LinkedList;
import java.util.Scanner;

public class senha {
    
     public static void main (String[] args){

            Scanner Ler = new Scanner( System.in);
            LinkedList<String> lista = new LinkedList<String>();
            int senha;
            String nome;
            int op = 0;

            while(op != 3){

                System.out.println("=============================");
                System.out.println("1 - inserir nome:");
                System.out.println("2 - Atender:");
                System.out.println("3 - Sair.");

                System.out.println("Digite uma das opcoes a cima:");
                op = Ler.nextInt();
                Ler.nextLine();//come a quebra de linha

                if(op == 1 ){

                    System.out.println("insira nome: ");
                    nome = Ler.nextLine();
                    System.out.println("insira senha: ");
                    senha = Ler.nextInt();
                    

                    if(senha == 1){



                              lista.addFirst("nome: "+ nome +"| Senha: " + senha);// adiciona a lista


                    }else{

                            lista.addLast("nome: "+ nome +"| Senha: " + senha);// adiciona a lista.
                    
                        }
                }else if(op == 2){

                    if(!lista.isEmpty()){

                        System.out.println(lista.getFirst());// pega o primeiro da lista e imprime
                        lista.removeFirst();// remove o primeiro da lista

                    }else{



                        System.out.println("Fila vazia!");


                    }
                    
                    



                }else{

                    System.out.println("tchau");

                }





            }






        }


    


}