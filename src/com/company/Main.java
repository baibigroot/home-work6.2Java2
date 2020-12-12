package com.company;

public class Main {

    public static void main(String[] args) {

        Tickets <Integer> tickets = new Tickets <> ();
        tickets.setPassanger(25);
        System.out.println(tickets.getPassanger());

        Tickets <Integer> tickets1 = new Tickets <> ();
        tickets.setPassanger(10);
        System.out.println(tickets1.getPassanger());


    }
}
