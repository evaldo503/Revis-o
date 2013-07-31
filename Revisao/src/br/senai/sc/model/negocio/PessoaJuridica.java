
package br.senai.sc.model.negocio;


/** 
 * Classe representa as pessoas jurídica do sistema
 * @version 1.0   31/07/2013
 * @author bruna_zakrzeski
 */

public class PessoaJuridica extends Pessoa {
    
    
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;

    public PessoaJuridica() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
    
    

    
}
