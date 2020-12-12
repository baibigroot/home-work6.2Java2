package com.company;

public class Main {

    public static void main(String[] args) {

        Tickets <Integer> tickets = new Tickets <> ();
        tickets.setPassengers(25);
        System.out.println(tickets.getPassengers());

        Tickets <Integer> tickets1 = new Tickets <> ();
        tickets.setPassengers(10);
        System.out.println(tickets1.getPassengers());


    }
}
