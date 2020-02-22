package app;

import util.CFila;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.*;

public class Main {

//    public static CFila organiza(CFila fila1, CFila fila2, int tamanho){
//        int[] fila3 = new int[tamanho];
//        int i;
//        for (i=0; i<tamanho; i++){
//            fila3[i] = (int) fila1.desenfileira();
//        }
//        for (;i<tamanho*2; i++){
//            fila3[i] = (int) fila2.desenfileira();
//        }
//        Arrays.sort(fila3);
//        CFila novaFila3 = new CFila();
//        while(Arrays){
//            novaFila3.enfileira(fila3.get(0));
//            fila3.remove(0);
//        }
//        return novaFila3;
//    }

    public static void main(String[] args) {
        CFila fila1 = new CFila();
        CFila fila2 = new CFila();
        CFila fila3 = new CFila();

        int tamanho = 100;

        for (int i = 0; i < tamanho; i++){
            fila1.enfileira((int)((random() * ((100 - 1) + 1)) + 1));
            fila2.enfileira((int)((random() * ((100 - 1) + 1)) + 1));
        }

        organiza(fila1,fila2,tamanho);

        fila3.mostra();

    }
}
