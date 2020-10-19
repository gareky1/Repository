package SistemaRodoviario.Funcionalidades;

import SistemaRodoviario.Objetos.Assento;

public class FuncionalidadesAssento {

    private Assento[] onibus;

    private int cont;

    public FuncionalidadesAssento() {

        this.cont = 0;
        this.onibus = new Assento[25];

    }

    /*Método para criar novo Assento.*/
    public void adicionarAssento(Assento a) {
        if (onibus.length == cont) {
            System.out.println("Onibus lotado!");
        } else {
            System.out.println("  Portando assento reservado !");
            this.onibus[cont] = a;
            cont++;
        }
    }

}
