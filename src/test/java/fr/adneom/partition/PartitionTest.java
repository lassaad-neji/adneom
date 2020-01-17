package fr.adneom.partition;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Matchers.anyInt;

public class PartitionTest {

    private static List<Integer> listInt;
    private static List<String> listString;
    private static List<Long> listLong;

    @BeforeAll
    static void initAll() {
        listInt = Arrays.asList(1,2,3,4);
        listString = Arrays.asList("un","deux","trois","quatre","cinq");
        listLong = Arrays.asList(1L,2L,3L);
    }

    @Test
    void partitionner_list_long_taille_impair() {
        List<List<?>> result = Partition.partionner(listLong, 3);
        Assertions.assertEquals(result.size(), 1);
        Assertions.assertEquals(result.get(0).toString(), listLong.toString());
    }

    @Test
    void partitionner_list_integer_avec_sous_list_de_meme_taille() {
        List<List<?>> result = Partition.partionner(listInt, 2);
        Assertions.assertEquals(result.size(), 2);
        Assertions.assertEquals(result.get(0).toString(), Arrays.asList(1,2).toString());
        Assertions.assertEquals(result.get(1).toString(), Arrays.asList(3,4).toString());
    }

    @Test
    @DisplayName("Partitionner une liste vide avec n'importe quelle taille d'éléments")
    void partitionner_list_string_avec_liste_vide() {
        List<List<?>> result = Partition.partionner(Collections.emptyList(), anyInt());
        Assertions.assertEquals(result.toString(), Collections.emptyList().toString());
        Assertions.assertEquals(result.size(), 0);
    }

    @Test
    void partitionner_list_string_avec_taille_zero() {
        List<List<?>> result = Partition.partionner(listString, 0);
        Assertions.assertEquals(result.toString(), Collections.emptyList().toString());
        Assertions.assertEquals(result.size(), 0);
    }


    @Test
    void partitionner_list_string() {
        List<List<?>> result = Partition.partionner(listString, 3);
        Assertions.assertEquals(result.size(), 2);
        Assertions.assertEquals(result.get(0).toString(), Arrays.asList("un","deux","trois").toString());
    }


    @AfterAll
    static void tearDownAll() {
        //System.out.println("Rien à faire pour le moment");
    }


}
