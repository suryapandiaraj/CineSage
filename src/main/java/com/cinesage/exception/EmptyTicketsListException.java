package com.cinesage.exception;

public class EmptyTicketsListException extends Exception {

    public EmptyTicketsListException(){
        super("Ticket not found!");
    }

    public EmptyTicketsListException(String message){
        super(message);
    }
}
