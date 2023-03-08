/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;



/**
 *
 * @author Aluno
 */
@Entity 
@Table (name = "obra")
public class ObraDeArte {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String titulo;
    @Column(name = "nome_autor", nullable = true)
    private String autor;
    private String tecnica;
    private String tipo;
    private String procedencia;
    private String dimensoes;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_obra", nullable = true)
    private Calendar dataObra;
    private int ano;

    
    
    
    
    /**
     * @return the titulo
     */
    public Long getId() {
        return Id;
    }
       
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the tecnica
     */
    public String getTecnica() {
        return tecnica;
    }

    /**
     * @param tecnica the tecnica to set
     */
    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the procedencia
     */
    public String getProcedencia() {
        return procedencia;
    }

    /**
     * @param procedencia the procedencia to set
     */
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    /**
     * @return the dimensoes
     */
    public String getDimensoes() {
        return dimensoes;
    }

    /**
     * @param dimensoes the dimensoes to set
     */
    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    /**
     * @return the dataObra
     */
    public Calendar getDataObra() {
        return dataObra;
    }

    /**
     * @param dataObra the dataObra to set
     */
    public void setDataObra(Calendar dataObra) {
        this.dataObra = dataObra;
    }
    
    
    
}
