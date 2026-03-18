package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import org.w3c.dom.ls.LSOutput;

import java.lang.classfile.CodeElement;
import java.util.*;

public class MainComListas {
    static void main(String[] args) {

        var filme3 = new Filme("O espetacular homem aranha" , 2012);
        filme3.avalia(10);
        var meuFilme = new Filme("O poderoso chefão" , 1970);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Avatar" , 2023);
        meuFilme.avalia(10);
        Serie lost = new Serie("Lost" , 2000);
        lost.avalia(7);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filme3);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(lost);
//        System.out.println("Tamanho da lista " +lista.size());
//        System.out.println("Primeiro filme: " + lista.getFirst().getNome());
//        System.out.println("toString do Filme: " + lista.get(0).toString());

        for (Titulo titulo : lista) {
            if (titulo instanceof Filme filme && filme.getClassificacao() >= 2){
            System.out.println(titulo + " Classificação: " + ((Filme) titulo).getClassificacao());
            }else {
                System.out.println(titulo);
            }

        }
        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Ryan Gosling");
        buscaPorArtista.add("Christian Bale");
        buscaPorArtista.add("Andrew Garfield");
        buscaPorArtista.add("Adam Sandler");

        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println("lista de titulos ordenada");

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }


}
