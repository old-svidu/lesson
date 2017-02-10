package data;

/**
 * Created by root on 10.02.17.
 */
public class Prostator implements Runnable{
    private int[] ints;
    private Consumer consumer;

    public Prostator(int[] ints, Consumer consumer) {
        this.ints = ints;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        Consumer.mes(0,0,ints[2]);
    }
}


