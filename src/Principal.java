    import br.com.alura.sceenmatch.calculos.CalculadoraDeTempo;
    import br.com.alura.sceenmatch.calculos.FiltroRecomendacao;
    import br.com.alura.screenmatch.modelos.Episodio;
    import br.com.alura.screenmatch.modelos.Filme;
    import br.com.alura.screenmatch.modelos.Serie;

    import java.util.ArrayList;

    public class Principal {
        public static void main(String[] args) {
            Filme meuFilme = new Filme("Homem-Aranha: Sem Volta Para Casa");
            meuFilme.setAnoDeLancamento(2021);
            meuFilme.setDuracaoEmMinutos(148);

            Filme meuFilme2 = new Filme("Harry Potter e a Pedra Filosofal");
            meuFilme2.setAnoDeLancamento(2001);
            meuFilme2.setDuracaoEmMinutos(152);

            Filme meuFilme3 = new Filme("Vingadores: Ultimato");
            meuFilme3.setAnoDeLancamento(2019);
            meuFilme3.setDuracaoEmMinutos(181);

            meuFilme.exibeFichaTecnica();
            meuFilme.avalia(8);
            meuFilme.avalia(10);
            meuFilme.avalia(10);
            meuFilme.avalia(6);
            meuFilme.avalia(7);
            System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
            System.out.println("Avaliação: " + meuFilme.pegaMedia());

            ArrayList<Filme> listaDeFilmes = new ArrayList<>();
            listaDeFilmes.add(meuFilme);
            listaDeFilmes.add(meuFilme2);
            listaDeFilmes.add(meuFilme3);
            System.out.println("Tamanho da lista: " + listaDeFilmes.size());
            System.out.println("Nome do filme 1: " + listaDeFilmes.get(0).getNome());
            System.out.println(listaDeFilmes);


            //**************************************************************************

            /*Serie theBoys = new Serie();
            theBoys.setNome("The Boys");
            theBoys.setTemporadas(4);
            theBoys.setEpisodiospPorTemporadas(8);
            theBoys.setAnoDeLancamento(2019);
            theBoys.setMinutosPorEpisodio(50);

            theBoys.exibeFichaTecnica();
            System.out.println("Duração da série em minutos: "+ theBoys.getDuracaoEmMinutos());

            CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
            calculadora.inclui(meuFilme);
            calculadora.inclui(meuFilme2);
            calculadora.inclui(theBoys);
            System.out.println(calculadora.getTempoTotal());

            FiltroRecomendacao filtro = new FiltroRecomendacao();
             filtro.filtra(meuFilme);

            Episodio ep1 = new Episodio();
            ep1.setSerie(theBoys);
            ep1.setNome("O Massacre do Capitão Patria");
            ep1.setNumero(7);
            ep1.setTotalVisualizacoes(600);

            System.out.println(ep1.getClassificacao());
        }*/

            Filme meufilme5 = new Filme("Pedro Legal");

            System.out.println(meufilme5);

        }

    }