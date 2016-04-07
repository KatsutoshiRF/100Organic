
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
public class Insumo {
    private String nomeInsumo;
    private int quantidadeInsumo;
    private double precoInsumo;
    private Date dataInsumo;

    public Insumo() {
    }

    public String getNomeInsumo() {
        return nomeInsumo;
    }

    public void setNomeInsumo(String nomeInsumo) {
        this.nomeInsumo = nomeInsumo;
    }

    public int getQuantidadeInsumo() {
        return quantidadeInsumo;
    }

    public void setQuantidadeInsumo(int quantidadeInsumo) {
        this.quantidadeInsumo = quantidadeInsumo;
    }

    public double getPrecoInsumo() {
        return precoInsumo;
    }

    public void setPrecoInsumo(double precoInsumo) {
        this.precoInsumo = precoInsumo;
    }

    public Date getDataInsumo() {
        return dataInsumo;
    }

    public void setDataInsumo(Date dataInsumo) {
        this.dataInsumo = dataInsumo;
    }
    
    
    
}


