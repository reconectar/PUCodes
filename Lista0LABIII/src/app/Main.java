package app;

import util.CFila;

import static java.lang.Math.*;

public class Main {

    public static CFila mesclaOrdenaFilas(CFila fila1, CFila fila2){
        CFila fila3 = new CFila();
        int quantidade = fila1.quantidade() + fila2.quantidade();
        for(int i=0; i< quantidade; i++){
            int menorFila1 = fila1.quantidade() == 0 ? Integer.MAX_VALUE:fila1.retornaMenorInt(); //Gambiarra
            int menorFila2 = fila2.quantidade() == 0 ? Integer.MAX_VALUE:fila2.retornaMenorInt(); //Gambiarra

            if((menorFila1 < menorFila2) && fila1.quantidade()!=0){
                fila3.enfileira(fila1.retornaRemoveMenorInt());
            }else if((menorFila2 < menorFila1) && fila2.quantidade()!=0){
                fila3.enfileira(fila2.retornaRemoveMenorInt());
            }else if(menorFila1 == menorFila2 && fila1.quantidade()!=0 && fila2.quantidade()!=0){
                fila3.enfileira(fila1.retornaRemoveMenorInt());
                fila3.enfileira(fila2.retornaRemoveMenorInt());
                quantidade--;
            }
        }
        return fila3;
    }

    public static void main(String[] args) {
        CFila fila1 = new CFila();
        CFila fila2 = new CFila();
        CFila fila3 = new CFila();

        int tamanho = 2;

        for (int i = 0; i < tamanho; i++){
            fila1.enfileira((int)((random() * ((100 - 1) + 1)) + 1));
            fila2.enfileira((int)((random() * ((100 - 1) + 1)) + 1));
        }

//        fila1.enfileira(2);
//        fila2.enfileira(1);
//        fila2.enfileira(2);


        fila3 = mesclaOrdenaFilas(fila1, fila2);
        fila3.mostra();

    }
}
