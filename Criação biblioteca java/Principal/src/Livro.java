public class Livro {
    String titulo;
    String autor;
    int anopublicacao;
    int quantidadecopias;

    public Livro(String titulo, String autor, int anopublicacao, int quantidadecopias){
        this.titulo=titulo;
        this.autor= autor;
        this.anopublicacao=anopublicacao;
        this.quantidadecopias=quantidadecopias;

    }
    public void exibirdetalhes(){
        System.out.println("Titulo: "+ titulo+ "\nAutor: "+autor+ "\n Ano de publicação: "+ anopublicacao+ "\n Quantidade de cópias: "+ quantidadecopias);

    }
    public int getQuantidadecopias(){
        return quantidadecopias;

    }



    public String getTitulo(){
        return titulo;
    }

    public void emprestarlivro(){
        if (quantidadecopias >0){
            quantidadecopias--;

        }
    }


}
