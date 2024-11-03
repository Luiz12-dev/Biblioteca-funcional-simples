import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner entrada = new Scanner(System.in);
        int opcoes;


        System.out.println("Bem vindo a biblioteca Luiz Almeida !");

        System.out.println("1. Exibir todos os livros");

        System.out.println("2. Cadastrar novos livros");

        System.out.println("3. Remover Livro");

        System.out.println("4. Buscar livro");

        System.out.println("5. Emprestar livro");

        System.out.println("6. Sair");

        System.out.println("Opções: ");
        opcoes = entrada.nextInt();
        entrada.nextLine();


        switch (opcoes){
            case 1 :
                biblioteca.exibirLivros();
                break;
            case 2:
                biblioteca.cadastroLivros();
                break;
            case 3:
                biblioteca.removerLivro();
                break;
            case 4:
                biblioteca.buscaLivros();
                break;

            case 5:
                biblioteca.emprestarlivro();
                break;
            case 6:
                System.out.println("Saindo da biblioteca !");
            default:
                System.out.println("Entrada incorret , tente novamente !");


        }while(opcoes != 6){
            entrada.close();
            break;
        }






    }



}