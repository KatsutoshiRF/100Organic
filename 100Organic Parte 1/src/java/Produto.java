
import static com.oracle.jrockit.jfr.ContentType.Timestamp;
import java.sql.Timestamp;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
public class Produto {
    private String nomeProduto;
    private String qualidadeProduto;
    private double precoProduto;
    private String medidaProduto;

 
    public Produto() {
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getQualidadeProduto() {
        return qualidadeProduto;
    }

    public void setQualidadeProduto(String qualidadeProduto) {
        this.qualidadeProduto = qualidadeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    
    public String getMedidaProduto() {
        return medidaProduto;
    }

    public void setMedidaProduto(String medidaProduto) {
        this.medidaProduto = medidaProduto;
    }


    
    
}
