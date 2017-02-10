package data;

/**
 * Created by root on 10.02.17.
 */
public class Cubator  implements Runnable{
    private int[] ints;
    private Consumer consumer;

    public Cubator(int[] ints, Consumer consumer) {
        this.ints = ints;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        for (int num : ints) {
            Consumer.mes(num,0,0);
        }
    }


}
