package data;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by root on 10.02.17.
 */
public class Consumer {
    public static AtomicBoolean lockCub = new AtomicBoolean(false);
    public static AtomicBoolean lockKva = new AtomicBoolean(false);
    public static AtomicBoolean lockSimp = new AtomicBoolean(false);
    public static AtomicInteger sum = new AtomicInteger(0);


    public static void mes(int cub, int kva, int simp){
        if (cub!=0 && !lockCub.get()){
            lockCub.compareAndSet(false,true);
            sum.getAndAdd((int)(Math.pow(cub,3)));
        }
        if (kva!=0 && !lockKva.get()){
            lockKva.compareAndSet(false,true);;
            sum.getAndAdd((int)(Math.pow(kva,2)));
        }
        if (simp!=0 && !lockSimp.get()){
            lockSimp.compareAndSet(false,true);;
            sum.getAndAdd(simp);
        }
        if (lockCub.get()&&lockKva.get()&& lockSimp.get()){
            System.out.println(sum);
            sum.getAndSet(0);
            lockSimp.getAndSet(false);
            lockKva.getAndSet(false);
            lockCub.getAndSet(false);
        }
    }
}
