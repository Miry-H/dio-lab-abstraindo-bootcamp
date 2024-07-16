package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	public Curso(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao);
		this.cargaHoraria = cargaHoraria;
	}

	private int cargaHoraria;

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso{" + getTitulo() + ": " + getDescricao() + "(" + cargaHoraria + "h)}";
	}
}
