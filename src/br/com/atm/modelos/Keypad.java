package br.com.atm.modelos;// keypad.java
// Representa o teclado do br.com.atm.modelos.ATM
import java.util.Scanner; // o programa utiliza Scanner para obter a entrada de usuário

public class Keypad {

    private Scanner input; // lê os dados na linha de comando

    public Keypad(){

        input = new Scanner( System.in );
    }// fim do construtor br.com.atm.modelos.Keypad sem argumentos

    // retorna um valor inteiro inserido pelo usuário
    public int getInput(){

        return input.nextInt(); // supomos que o usuário insira um inteiro
    }// fim do método getInput
}// fim da classe br.com.atm.modelos.Keypad

