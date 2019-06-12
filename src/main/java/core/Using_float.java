package core;

public class Using_float {
	public static void main(String[] args) {
		
        final long start = System.nanoTime();

        float sum = 0;

        int max = 1_000_000_000;

        for (int i = 0; i < max; i++) {sum++;}

        final long finish = System.nanoTime();

  System.out.println("Using [float] " + max + " times, Elapsed time: " + (finish - start) / 1_000_000.0 + " ms");

 }
}
