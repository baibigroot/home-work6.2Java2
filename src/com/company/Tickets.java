package com.company;


public class Tickets <T extends Number> implements Airport<T> {

    @Override
    public int TurkishAirLines(T first, T vip) {
        return first.intValue() + vip.intValue();
    }
}
