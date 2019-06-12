package core;

public class Using_Short1 {
	public static void main(String[] args) {
		
        final long start = System.nanoTime();

        Short sum = 0;

        int max = 1_000_000_000;

        for (int i = 0; i < max; i++) {sum++;}

        final long finish = System.nanoTime();

  System.out.println("Using [Short] " + max + " times, Elapsed time: " + (finish - start) / 1_000_000.0 + " ms");

 }
}
