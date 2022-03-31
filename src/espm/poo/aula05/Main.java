package src.espm.poo.aula05;

import src.espm.poo.Ex2.Cliente;

public class Main {

    public static void main(String[] args) {

        Cliente selmini = new Cliente();
        selmini.getConta().depositar(15); 
        System.out.println(selmini.getConta().getSaldo());
        selmini.getConta().depositar(25); 
        System.out.println(selmini.getConta().getSaldo());
        selmini.getConta().depositar(25);

    }
    
}
