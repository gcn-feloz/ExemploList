import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(3.4);
        notas.add(6.7);
        notas.add(8.0);
        notas.add(3.0);
        notas.add(9.3);
        notas.add(7.8);
        notas.add(5.0);

        System.out.println(notas.toString());

        Double num1 = 6.7;

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(num1));

        notas.add(4, 7d);
        notas.add(4, 2.3);
        notas.add(4, 1.9);

        System.out.println(notas);

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 0d);
        System.out.println(notas);

        System.out.println("Substitua a nota 6.7 pela nota 4.4: ");
        notas.set(notas.indexOf(6.7), 4.4);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5.3));

        System.out.println("exiba todas as notas na ordem em que foram informados: ");
        for (double nota : notas)
            System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.printf("Exiba a média das notas = %.2f %n", (soma/notas.size()));
                                                  
        System.out.println("remova a nota 0: ");
        notas.remove(4.4d);
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota na posição zero: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next > 3) iterator1.remove();
             
        }
        System.out.println(notas);


        System.out.println("Apague toda a lista:");
        notas.clear();
        System.out.println(notas);

        System.out.println("A lista esta vazia: " + notas.isEmpty());
        System.out.println(notas);


        }



   




    }

