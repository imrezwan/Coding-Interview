package Java.ThreadProgramming;

import java.util.concurrent.TimeUnit;

public class BasicThreadDemo {

    public static void main(String[] args) {
        Thread thread = new ExtendedThread();
        thread.setName("Extended Thread");
        thread.start();

        for(int i = 1 ;i<=5;i++){
            System.out.println("["+i+"]"+Thread.currentThread().getName());
            sleepOneSecond();
            if(i==2){
                thread.interrupt();
            }
        }
    }

    private static void sleepOneSecond() {
        try{
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        }
        catch(InterruptedException e){
            e.printStackTrace();

        }
    }
}

class ExtendedThread extends  Thread{

    @Override
    public void run() {
        for(int i = 1 ;i<=15;i++){
            System.out.println("["+i+"]"+Thread.currentThread().getName());
            sleepOneSecond();

        }
    }

    private void sleepOneSecond() {
        try{
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        }
        catch(InterruptedException e){
            //e.printStackTrace();
            if(Thread.interrupted()){
                System.out.println("Thread Is Interrupted");
                return;
            }
        }
    }
}
