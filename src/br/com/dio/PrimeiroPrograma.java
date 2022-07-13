package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();

        System.out.println(gato);

        Livro livroI = new Livro("Violetas na Janela", 250);

        System.out.println(livroI);

       /* int a = 5;
        int b = 7;

        System.out.println("Hello Wordl!  " + (a+b));*/
    }
}
 class Livro {
    private String nome;
    private Integer numPaginas;

     public Livro(String nome, Integer numPaginas) {
         this.nome = nome;
         this.numPaginas = numPaginas;
     }

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public Integer getNumPaginas() {
         return numPaginas;
     }

     public void setNumPaginas(Integer numPaginas) {
         this.numPaginas = numPaginas;
     }

     @Override
     public String toString() {
         return "Livro{" +
                 "nome='" + nome + '\'' +
                 ", numPaginas=" + numPaginas +
                 '}';
     }
 }