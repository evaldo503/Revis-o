
package br.senai.sc.model.percistencia;

import br.senai.sc.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/** 
 * Classe que guarda as informações aos funcionário
 * @version 1.0   31/07/2013
 * @author bruna_zakrzeski
 */

public class FuncionarioDAO {
    
    
    //Vetor dinâmico para armazenar funcionários cadastros.
    
    private List<Funcionario> funcionarios = new ArrayList<>();
    
    
    
    //Método para adicionar um funcionário no vetor de funcionários.
    
    public void adicionar(Funcionario f){
        funcionarios.add(f);
 
JOptionPane.showMessageDialog(null, "Funcionário" + "Adicionado Com Sucesso!");
   
    
    
    
    }
}