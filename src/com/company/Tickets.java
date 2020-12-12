package com.company;

public class Tickets <T extends Number> implements Airport<T> {

private T passanger;

    public T getPassengers() {
        return passanger;
    }

    public void setPassengers(T passanger) {
        this.passanger = passanger;
    }

    @Override
    public int TurkishAirLines(T first, T vip) {
        return first.intValue() + vip.intValue();
    }
}
