package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;
    protected double xp;
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "\nTitulo: " + getTitulo() + "\nDescrição: " + getDescricao() + "\nCarga Horária: " + cargaHoraria;
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO*cargaHoraria;
    }

    
}
