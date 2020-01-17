package fr.adneom.partition;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe permet de faire des opérations de partition sur des listes d'objets
 */
public class Partition {
    /**
     * Cette méthode permet de partitionner une liste d'objets en des sous listes d'objets ayant au maximum "le taille" elements
     * @param list : liste à partitionner
     * @param taille : la taille maximum des sous listes retourné
     * @return {@link List} de {@link List} d'objets de "taille" éléments
     */
    public static List<List<?>> partionner(List<?> list, Integer taille) {
        System.out.println("---------------> partionner la liste :   " + list.toString() + "   en des sous liste de " + taille + " elements maximum");
        List<List<?>> result= new ArrayList<>();
        if(list != null && !list.isEmpty() && taille > 0) {
            int iteration = list.size() / taille;
            int increment = 0;
            while (increment < iteration) {
                result.add(list.subList(taille * increment, (increment + 1) * taille));
                increment++;
            }
            if (taille * increment < list.size()) result.add(list.subList(taille * increment, list.size()));
        }
        System.out.println("---------------> Le résultat est :   " + result.toString());
        return result;
    }
}
