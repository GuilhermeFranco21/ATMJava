package br.com.atm.modelos;// br.com.atm.modelos.Transaction.java
// A superclasse abstrata br.com.atm.modelos.Transaction representa uma transação no br.com.atm.modelos.ATM

public abstract class Transaction {

    private int accountNumber; // indica conta envolvida
    private Screen screen; // Tela do br.com.atm.modelos.ATM
    private BankDatabase bankDatabase; // banco de dados de informações sobre a conta

    // Construtor de br.com.atm.modelos.Transaction invocado pelas subclasses utilizando super()
    public Transaction( int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase ){

        accountNumber = userAccountNumber;
        screen = atmScreen;
        bankDatabase = atmBankDatabase;
    }// fim do contrutor de br.com.atm.modelos.Transaction

    // retorna o número de conta
    public int getAccountNumber(){

        return accountNumber;
    }// fim do método getAccountNumber

    // retorna a referência à tela
    public Screen getScreen(){

        return screen;
    }// fim do método getScreen

    // retorna a referência ao banco de dados da instituição financeira
    public BankDatabase getBankDatabase(){

        return bankDatabase;
    }// fim do método getBankDatabase

    // realiza a transação (sobrescrita por cada subclasse)
    abstract public void execute();
}// fim da classe br.com.atm.modelos.Transaction
