package easy.slidingwindow;

import java.util.Arrays;
import java.util.Collections;

public class MinRecoloursGetKConsecutiveBlocks {

    public static void main(String[] args) {

        System.out.println(minimumRecolors("BWWWBB", 6));

    }

    public static int minimumRecolors(String blocks, int k) {

        if( blocks.indexOf("B".repeat(k)) >= 0){
            return 0;
        }
        int min = Integer.MAX_VALUE;

        int i=0;
        int j=k-1;

        while(j<blocks.length()){
            min = Math.min(min, countChar(blocks.substring(i, j+1)));
            i++;
            j++;
        }

        return min;


    }

    private static int countChar(String substring) {
       return  Collections.frequency(
               Arrays.asList(substring.split("")),
               String.valueOf('W'));
    }
}
