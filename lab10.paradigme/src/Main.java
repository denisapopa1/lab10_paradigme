import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static sun.awt.image.MultiResolutionCachedImage.map;


public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> numere = IntStream.range(0, 10)
                .map(i -> random.nextInt(21) + 5)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Lista de numere întregi aleatoare:");
        System.out.println(numere);

        int suma = numere.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Suma elementelor: " + suma);

        int max = numere.stream().mapToInt(Integer::intValue).max().orElseThrow();
        int min = numere.stream().mapToInt(Integer::intValue).min().orElseThrow();

        System.out.println("Valoarea maximă: " + max);
        System.out.println("Valoarea minimă: " + min);

        List<Integer> filteredNumbers = numere.stream()
                .filter(num -> num >= 10 && num <= 20)
                .collect(Collectors.toList());

        System.out.println("Lista filtrată cu elementele din intervalul [10, 20]:");
        System.out.println(filteredNumbers);

        List<Double> doubleNumbers = numere.stream()
                .map(Integer::doubleValue)
                .collect(Collectors.toList());

        System.out.println("Lista de valori Double:");
        System.out.println(doubleNumbers);

        boolean contains12 = numere.contains(12);
        if (contains12) {
            System.out.println("Valoarea 12 se găsește în listă.");
        } else {
            System.out.println("Valoarea 12 nu se gaseste in lista");
        }


        List<Integer>  listaPatrate = Arrays.asList(9,10,3,4,7,3,4);

        List<Integer> listaNoua=listaPatrate.stream()
                        .map(num -> num * num)
                        .distinct()
                        .collect(Collectors.toList());



        System.out.println("Lista cu patratele numarului");
        System.out.println(listaPatrate);

        List<String> listaCuvinte = Arrays.asList("Acesta","este","un","program","scris","cu","java","8","si","expresii","lambda");

        List<String> cuvinteLungi=new ArrayList<>();
        for(String cuvant:listaCuvinte){
            if(cuvant.length()>=5){
                cuvinteLungi.add(cuvant);
            }
        }
        System.out.println(listaCuvinte);

       Collections.sort(cuvinteLungi);
        System.out.println("Lista cuvinte ordonate este: ");
        System.out.println(cuvinteLungi);

        System.out.print("Lista cuvinte cu litera p: ");
        for(String cuvant: listaCuvinte){
            if(cuvant.startsWith("p")){
                cuvinteLungi.add(cuvant);
                System.out.println(cuvant);
            }
        }
    }
}