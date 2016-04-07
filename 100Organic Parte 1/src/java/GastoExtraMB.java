/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author pedro
 */
@Named(value = "gastoExtraMB")
@SessionScoped

public class GastoExtraMB implements Serializable{

    private GastoExtra gastoExtra;
    private List<GastoExtra> listaGastosExtras;
    
    public GastoExtraMB() {
        gastoExtra = new GastoExtra();
        listaGastosExtras = new ArrayList<GastoExtra>();
    }

    public GastoExtra getGastoExtra() {
        return gastoExtra;
    }

    public void setGastoExtra(GastoExtra gastoExtra) {
        this.gastoExtra = gastoExtra;
    }

    public List<GastoExtra> getListaGastosExtras() {
        return listaGastosExtras;
    }

    public void setListaGastosExtras(List<GastoExtra> listaGastosExtras) {
        this.listaGastosExtras = listaGastosExtras;
    }
    
    public String addGastoExtra(){
    listaGastosExtras.add(gastoExtra);
    this.gastoExtra = gastoExtra;
    return("GastosExtras");
    }
    
}
