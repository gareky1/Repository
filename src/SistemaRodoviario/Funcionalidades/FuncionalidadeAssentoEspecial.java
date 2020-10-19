package SistemaRodoviario.Funcionalidades;

import SistemaRodoviario.Objetos.AssentoEspecial;

public class FuncionalidadeAssentoEspecial {

    private AssentoEspecial[] onibus;

    private int cont;

    public FuncionalidadeAssentoEspecial() {

        this.cont = 0;
        this.onibus = new AssentoEspecial[5];
    }

    /*Método para criar novo Assento.*/
    public void adicionarAssentoEspecial(AssentoEspecial E) {
        if (onibus.length == cont) {
            System.out.println("Porem assento especial lotado!");
        } else {
            System.out.println("Portando assento especial reservado !");
            this.onibus[cont] = E;
            cont++;
        }
    }
}
