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
@Named(value = "insumoMB")
@SessionScoped

public class InsumoMB implements Serializable{

    private Insumo insumo;
    private List<Insumo> listaInsumos;
    
    public InsumoMB() {
        insumo = new Insumo();
        listaInsumos = new ArrayList<Insumo>();        
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public List<Insumo> getListaInsumos() {
        return listaInsumos;
    }

    public void setListaInsumos(List<Insumo> listaInsumos) {
        this.listaInsumos = listaInsumos;
    }
    
    public String addInsumo(){
        listaInsumos.add(insumo);
        this.insumo = insumo;
        return("Insumos");
    }
        
}
