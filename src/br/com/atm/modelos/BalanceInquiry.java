package br.com.atm.modelos;// br.com.atm.modelos.BalanceInquiry.java
// Representa uma transação de consulta de saldos do br.com.atm.modelos.ATM

public class BalanceInquiry extends Transaction {

    public BalanceInquiry( int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase ){

        super( userAccountNumber, atmScreen, atmBankDatabase );
    }// fim do construtor

    // realiza a transação
    @Override
    public void execute() {
        // obtém as referências ao banco de dados e tela do banco
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        // obtém o saldo disponível da conta envolvida
        double availableBalance = bankDatabase.getAvailableBalance( getAccountNumber() );

        // obtém o saldo total da conta envolvida
        double totalBalance = bankDatabase.getTotalBalance( getAccountNumber() );

        // exibe as informações sobre o saldo da tela
        screen.displayMessageLine( "\nBalance information:" );
        screen.displayMessage( " - Available balance: " );
        screen.displayDollarAmout( availableBalance );
        screen.displayMessage( "\n - Total balance: " );
        screen.displayDollarAmout( totalBalance );
        screen.displayMessageLine( "" );
    }// fim do método execute
}// fim da classe br.com.atm.modelos.BalanceInquiry

