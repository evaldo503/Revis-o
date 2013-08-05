
package br.senai.sc.model.negocio;

/** 
 * Essa classe representa as pessoas do software
 * @version 1.0   31/07/2013
 * @author bruna_zakrzeski
 */


public class Pessoa {
    
    private int id;
    private String endereco;
    private String telefone;
    private String dataCadastro;
    
    
    public Pessoa(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    
    
    
}
