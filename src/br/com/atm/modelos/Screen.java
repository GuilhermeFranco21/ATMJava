package br.com.atm.modelos;// br.com.atm.modelos.Screen.java
// Representa a tela do br.com.atm.modelos.ATM

public class Screen {

    // exibe uma mensagem sem retorno de carro
    public void displayMessage( String message ){

        System.out.print( message );

    }// fim do método displayMessage

    // exibe uma mensagem com um retorno de carro
    public  void displayMessageLine( String message ){

        System.out.println( message );
    }// fim do método displayMessageLine

    // exibe um valor em dólares
    public void displayDollarAmout( double amount ){

        System.out.printf( "$%,.2f", amount);
    }// fim do método displayDollarAmount
}// fim da classe br.com.atm.modelos.Screen
