package fr.adneom.partition;

import java.util.Arrays;
import java.util.List;

public class MainApplication {
    public static void main(String[] args){
        //-------(1,2,3,4,5,6,7), 2
        List<List<?>> lists = Partition.partionner(Arrays.asList(1,2,3,4,5,6,7), 2);
        //-------(1), 2
        List<List<?>> lists1 = Partition.partionner(Arrays.asList(1), 2);
        //-------(), 2
        List<List<?>> lists2 = Partition.partionner(Arrays.asList(), 2);
        //-------(1,2,3,4,5,6,7), 3
        List<List<?>> lists3 = Partition.partionner(Arrays.asList(1,2,3,4,5,6,7), 3);
        //-------(1,2,3,4,5,6), 2
        List<List<?>> lists4 = Partition.partionner(Arrays.asList(1,2,3,4,5,6), 2);
    }
}
