import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {

		// Criando conteúdos
		Curso curso1 = new Curso("Sintaxe java", "Conheça o básico do Java", 5);
		Curso curso2 = new Curso("POO em Java", "Conheça e aplique os Pilares da OO em Java", 20);
		Mentoria mentoria = new Mentoria("Produtividade na IDE", "Conheça melhor a IDE eclipse e vsCode",
				LocalDate.now());

		// Criando Bootcamp e adicionando conteúdos nele
		Bootcamp bootcampJava = new Bootcamp("Bootcamp Java",
				"Bootcamp Java oferecido pelo Santander em parceira com DIO");
		bootcampJava.getConteudos().add(curso1);
		bootcampJava.getConteudos().add(curso2);
		bootcampJava.getConteudos().add(mentoria);

		Dev dev1 = new Dev("Mariazinha");
		dev1.inscreverBootcamp(bootcampJava);

		// Fazendo Mariazinha concluir dois cursos com progredir()
		dev1.progredir();
		dev1.progredir();
		dev1.exibirProgressoCursos();

		Dev dev2 = new Dev("Pedrinho");
		dev2.inscreverBootcamp(bootcampJava);

		// Fazendo Pedrinho concluir o bootcamp (3 cursos progredidos)
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		dev2.exibirProgressoCursos();
	}

}
