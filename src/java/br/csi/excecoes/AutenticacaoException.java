/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.csi.excecoes;

/**
 *
 * @author Aluno
 */
public class AutenticacaoException  extends Exception{

    public AutenticacaoException() {
        super("Email ou senha inválidos");
    }

    public AutenticacaoException(String message) {
        super(message);
    }
      
}
