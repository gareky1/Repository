package SistemaRodoviario.Funcionalidades;

import SistemaRodoviario.Objetos.Onibus;
import SistemaRodoviario.Objetos.Assento;

public class FuncionalidadesOnibus {

    private Onibus[] onibus;
    private int cont;
    private boolean flag;
    private Assento a;
    private String lugar;

    public FuncionalidadesOnibus(Assento[] assento) {

        this.cont = 0;

    }

    public FuncionalidadesOnibus() {

        this.cont = 0;
        this.onibus = new Onibus[30];

    }

    public void adicionarOnibus(Onibus o) {
        if (o == null || onibus.length == cont || procurarOnibus(o.getOnibusrotas()) != -1) {
            System.out.println("Não foi possível adicionar o onibus pois ja existe em nosso sistema!");
        } else {
            this.onibus[cont] = o;
            cont++;
            System.out.println("seu onibus foi adicionado com sucesso a sua empresa");
        }
        flag = false;
    }

    private int procurarOnibus(String Onibusrotas) {
        if (flag == true) {
            for (int i = 0; i < cont; i++) {
                if (this.onibus[i].getOnibusrotas().equals(Onibusrotas)) {
                    return i;
                }
            }
            return -1;
        } else {

            int inicio = 0, fim = this.cont - 1, meio;

            while (inicio <= fim) {
                meio = (inicio + fim) / 2;
                if (this.onibus[meio].getOnibusrotas().compareToIgnoreCase(Onibusrotas) == 0) {
                    return meio;
                } else if (Onibusrotas.compareToIgnoreCase(this.onibus[meio].getOnibusrotas()) < 0) {
                    fim = meio - 1;
                } else {
                    inicio = meio + 1;
                }
            }
            return -1;
        }
    }

    public boolean resevarAssento(Onibus o) {

        if (o == null || onibus.length == cont || procurarOnibus(o.getOnibusrotas()) != -1) {
            System.out.println(" Onibus existente   !");
            return true;
        } else {
            this.onibus[cont] = o;

            return false;
        }

    }

    public boolean resevarAssentoEspecial(Onibus o) {

        if (o == null || onibus.length == cont || procurarOnibus(o.getOnibusrotas()) != -1) {
            System.out.println("Onibus existente !");
            return true;
        } else {
            this.onibus[cont] = o;

            return false;
        }

    }

}
