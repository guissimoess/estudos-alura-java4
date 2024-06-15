package br.com.alura.screenmatch.exerciciosexceptions;

public class ErroConsultaGithubException extends RuntimeException {

    public ErroConsultaGithubException(String mensagem) {
        super(mensagem);
    }
}
