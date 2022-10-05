package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static java.util.Collections.max;
import static java.util.Collections.min;

class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e informe as sete notas do aluno: ");

        List<Double> notas = new ArrayList<Double>();
        //usando metodo add, insere as 7 notas do aluno
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        //agora imprime para saber se deu certo. Tem duas formas de imprimir

        System.out.println(notas); //Primeiro informando a variavel
        System.out.println(notas.toString());// Segunda opção usando metodo toString

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); //metodo indexOf

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d); //metodo add
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0, pela nota 6.0");//metodo index of e metodo set
        //notas.indexOf(5d) para achar o nr 5
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: "+ notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem que foram informadas: ");
        System.out.println(notas);//List já imprime na ordem que foi inseridas
        for (Double nota : notas) System.out.println(nota);// mas o for it é um método para isso

        System.out.println("Exiba a terceira nota adicionada " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + min(notas));

        System.out.println("Exiba a maior nota: " + max(notas));

        System.out.println("Exiba a soma dos valores: ");
        //chama o metodo interator com notas.interator e altera a variavel notas
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(("A soma deu: " + soma));

        System.out.println("Exiba a média das notas: " + soma/notas.size());//metodo size

        System.out.println("Remova a nota 0");
        notas.remove(0d); //metodo remove
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();//para saber quais notas são menor que 7 usa iterator
        while (iterator1.hasNext()){ //enquanto tiver proximo elemento,
            Double next = iterator1.next(); //vou pegar o proximo elemento
            if(next < 7) iterator1.remove(); //se for menor que 7 removo da minha lista
        }
        System.out.println(notas);//exibe apenas as notas maiores ou igual a 7

        System.out.println("Apague toda a lista"); //metodo
        //notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());//retorna verdadeiro ou falso
    }
}
