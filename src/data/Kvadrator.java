package data;

/**
 * Created by root on 10.02.17.
 */
public class Kvadrator implements Runnable{
    private int[] ints;
    private Consumer consumer;

    public Kvadrator(int[] ints, Consumer consumer) {
        this.ints = ints;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        Consumer.mes(0,ints[1],0);
    }
    }

