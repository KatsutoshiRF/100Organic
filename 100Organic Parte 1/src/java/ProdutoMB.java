/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
@Named(value = "produtoMB")
@SessionScoped
public class ProdutoMB implements Serializable {

    private Produto produto;
    private List<Produto> listaProdutos;
    
    public ProdutoMB() {
        produto = new Produto();
        listaProdutos = new ArrayList<Produto>();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    
    public String addProduto(){
    listaProdutos.add(produto);
    this.produto = new Produto();
    return("Produtos");
    }
}
