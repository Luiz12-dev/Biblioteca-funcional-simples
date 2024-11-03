import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca {
    Scanner entrada = new Scanner(System.in);
    List<Livro> livros;
    String titulo;
    String autor;
    int anodepublicacao;
    int numerodecopias;
    String removertitulo;


   public Biblioteca(){
       livros =new ArrayList<>();
       livros.add(new Livro("O Alquimista", "Paulo Coelho", 1988, 10));
       livros.add(new Livro("Dom Quixote", "Miguel de Cervantes", 1605, 5));

   }


   public void exibirLivros(){
       if (livros.isEmpty()){
           System.out.println("Nenhum livro cadastrado !");

       }else{
           System.out.println("Livros cadastrados: ");
           for(Livro TodosLivros: livros){
               TodosLivros.exibirdetalhes();
               System.out.println("-----------------");
           }

       }

   }

   public void cadastroLivros(){
       System.out.println("Insira o título do livro: ");
       titulo = entrada.nextLine();

       System.out.println("Insira o nome do autor: ");
       autor= entrada.nextLine();

       System.out.println("Insira a data de publicação");
       anodepublicacao = entrada.nextInt();

       System.out.println("Insira a quantidade de cópias: ");
       numerodecopias= entrada.nextInt();

       entrada.nextLine();

       Livro livro3 = new Livro(titulo,autor,anodepublicacao,numerodecopias);
     livros.add(livro3);
     System.out.println("Livro cadastrado com sucesso !!");

   }

   public void removerLivro(){
       System.out.println("Qual o nome do livro que deseja remover: ");
       removertitulo= entrada.nextLine();

       boolean removido = false;

       for (int i=0 ; i < livros.size(); i++){
           if (livros.get(i).titulo.equalsIgnoreCase(removertitulo)){
               livros.remove(i);
               System.out.println("Livro: '"+ removertitulo+ "' retirado !");
               removido= true;

           }
       }
       if(!removido){
           System.out.println("Livro não encontrado !");
       }

   }


   public void buscaLivros(){
       System.out.println("Nome do livro que deseja encontrar: ");
       String nomelivro = entrada.nextLine();
       boolean encontrado = false;


       for(Livro livro: livros){
           if (livro.getTitulo().equalsIgnoreCase(nomelivro)){
               System.out.println("Livro encontrado: ");
               livro.exibirdetalhes();
               encontrado= true;
               break;
           }
       }
   }
    public void emprestarlivro(){
       System.out.println("Digite o nome do livro que deseja emprestar: ");
       String nomeLivro = entrada.nextLine();
       boolean encontrado = false;

       for (Livro livro: livros){
           if (livro.getTitulo().equalsIgnoreCase(nomeLivro)){
               encontrado =true;
               if (livro.getQuantidadecopias()> 0){
                   livro.emprestarlivro();
                   System.out.println("Livro emprestado com sucesso !");
               }else{
                   System.out.println("Livro '"+ titulo +"' esgotado!");
               }
               break;

           }
       }
        if (!encontrado){
            System.out.println("Livro não encontrado !");
        }


    }



}
