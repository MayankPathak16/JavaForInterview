package java8InterviewQues.java8Concepts;

import java.util.stream.Stream;

public class FibonnaciSeries {
    public static void main(String[] args){
        /**
         * int[]{0,1}-> Starting element for fibonnaci
         * int[]{f[1],f[0]+f[1]}) -> Take first element and then add first and second after that
         * repeat it.
         * Then define the limit : We have print for 10 so given limit as 10
         * then we can print each element.
         */
        Stream.iterate(new int[]{0,1},f-> new int[]{f[1],f[0]+f[1]}).limit(10).
                map(f->f[0]).forEach(i->System.out.print(i+" "));
    }

}
