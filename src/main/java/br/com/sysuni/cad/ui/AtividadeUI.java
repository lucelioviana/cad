package br.com.sysuni.cad.ui;

import br.com.sysuni.cad.pojo.AtividadePOJO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class AtividadeUI implements Serializable {

    private List<AtividadePOJO> lista;
    private int selecionado;

    public AtividadeUI() {
        lista = new ArrayList<>();
        popula(5);
    }

    private void popula(int size) {
        for(int i = 0 ; i < size ; i++)
            this.lista.add(new AtividadePOJO(i, "nome"+i));
    }

    public List<AtividadePOJO> getLista() {
        return lista;
    }

    public void setLista(List<AtividadePOJO> lista) {
        this.lista = lista;
    }

    public int getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(int selecionado) {
        this.selecionado = selecionado;
    }
}