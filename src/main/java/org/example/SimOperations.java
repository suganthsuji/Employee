package org.example;

public class SimOperations implements Sim{
    @Override
    public void call() {
        System.out.println("Calling");
    }

    @Override
    public void surfing() {
        System.out.println("Browsing");
    }

    @Override
    public void texting() {
        System.out.println("Texting");
    }

    public void recharge() {
        System.out.println("recharge");
    }
    public void network() {
        System.out.println("network");
    }

}
