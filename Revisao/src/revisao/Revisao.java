
package revisao;

import javax.swing.JOptionPane;

public class Revisao {

    public static void main(String[] args) {
        
     String nome;
     int idade;
     String dataNascimento;
     
     
     nome = JOptionPane.showInputDialog("Digite seu nome: ");
     idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
     dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento: ");
     
     
     
     System.out.println("Nome do Paciente: " + nome + "\nIdade do Paciente: " + idade
             + "\nData de Nascimento do Paciente: " + dataNascimento);
     
     
    }
}
