package br.edu.ifnmg.poo;

/**
 *
 * @author ifnmg
 */
public class PessoaFisica extends Pessoa {

    private Long cpf;

//    public PessoaFisica(Long id, Long cpf, String nome) {
//        setId(id);
//        setNome(nome);
//        this.cpf = cpf;
//    }

    public PessoaFisica(Long cpf, Long id, String nome) {
        super(id, nome);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + this.cpf;
    }

    
    
    

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}
