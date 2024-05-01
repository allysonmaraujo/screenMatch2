import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.avalia(8);
        meuFilme.avalia(9.7);
        meuFilme.avalia(6.9);
        meuFilme.avalia(7.9);
        meuFilme.avalia(8.8);
        meuFilme.exibeFichaTecnica();
        System.out.println("A Media de notas do filme '" + meuFilme.getNome() + "' é " + meuFilme.pegaMedia());
        System.out.println("A soma das avaliações é: " + meuFilme.getSomaDasAvaliacoes());
        System.out.println("O numero total de avaliações é : " + meuFilme.getTotalDeAvaliacoes());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEspisodiosPorTemporada(12);
        lost.setMinutosPorEspisodio(45);
        System.out.println("Duração total para maratonar a série em minutos: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

    }
}