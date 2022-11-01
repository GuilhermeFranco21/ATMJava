package br.com.atm.modelos;// br.com.atm.modelos.DepositSlot.java
// Representa a abertura para depósito do br.com.atm.modelos.ATM

public class DepositSlot {

    // indica se o envelope foi recebido (sempre retorna true,
    // porque isso só é uma simulação do software de uma abertura para depósito real)
    public boolean isEnvelopeReceived(){

        return true; // o envelope de depósito foi recebido
    }// fim do método isEnvelopeReceived
}// fim da classe br.com.atm.modelos.DepositSlot
