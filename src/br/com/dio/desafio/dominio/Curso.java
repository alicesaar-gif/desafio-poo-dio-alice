package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;
    private String nivel; 

    @Override
    public double calcularXp() {
    
        if ("Avançado".equalsIgnoreCase(nivel)) {
            return XP_PADRAO * cargaHoraria * 2; 
        } else if ("Intermediário".equalsIgnoreCase(nivel)) {
            return XP_PADRAO * cargaHoraria * 1.5;
        }
        return XP_PADRAO * cargaHoraria; // Básico
    }

    public int getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }
    
    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }
}
