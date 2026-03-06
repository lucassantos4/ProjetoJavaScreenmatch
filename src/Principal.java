import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {

        var filme3 = new Filme();
        filme3.setNome("O Espetacular Homem Aranha.");
        filme3.setAnoDeLancamento(2012);
        filme3.setDuracaoEmMinutos(136);
        filme3.avalia(10);

        var meuFilme = new Filme();

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        Filme outroFilme = new Filme();

        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

//        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
//        //System.out.println(meuFilme.somaDasAvaliacoes); private
//        //System.out.println(meuFilme.totalDeAvaliacoes); private
//        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
//        System.out.println("Média de avaliações do filme: " + meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
//        lost.exibeFichaTecnica();
//        System.out.println("Para maratonar Lost " + lost.getDuracaoEmMinutos() + ". vai dar trabalho");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        //System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);

        ArrayList<Filme> listadefilmes = new ArrayList<>();

        listadefilmes.add(filme3);
        listadefilmes.add(outroFilme);
        listadefilmes.add(meuFilme);
        System.out.println("Tamanho da lista" +listadefilmes.size());
        System.out.println("Primeiro filme: " + listadefilmes.get(0).getNome() );

    }
}
