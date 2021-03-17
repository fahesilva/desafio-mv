package com.desafiomv.services;
/*

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafiomv.enums.TipoMovimentacao;
import com.desafiomv.exception.ResourceNotFoundException;
import com.desafiomv.models.Account;
import com.desafiomv.models.Movimentacao;
import com.desafiomv.repository.MovimentacaoRepository;

@Service
public class MovimentacaoService {

    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private AccountService contaService;



    public Movimentacao getMovimentacao (int protocolo){
        Movimentacao Movimentacao = (com.desafiomv.models.Movimentacao) repository.findById(protocolo).get();

        if(Movimentacao!=null){
            return Movimentacao;
        }else{
            throw new ResourceNotFoundException("Movimentacao com protocolo "+protocolo+ "nao encontrado");
        }

    }

    public List<Movimentacao> list (){
        List<Movimentacao> Movimentacaos = repository.findAll();
        if (Movimentacaos.isEmpty()){
            throw new ResourceNotFoundException("Lista de protocolos vazia ");
        }else {
            return Movimentacaos;
        }
    }

    public void throwMovimentation (Movimentacao movimentacao){
            Long numMovimentacoes = repository.totalMovimentacion(movimentacao.getConta().getAccNumber());
            if(numMovimentacoes<=10){
                movimentacao.setTaxa(1.0F);
            }else if (numMovimentacoes<=20&&numMovimentacoes>10){
                movimentacao.setTaxa(0.75F);
            }else {
                movimentacao.setTaxa(1.0F);
            }
            Account conta = contaService.getConta(movimentacao.getConta().getAccNumber());

            if(movimentacao.getTipo()== TipoMovimentacao.CREDITO){
                if(numMovimentacoes==0){
                    conta.setCurrent_balance(movimentacao.getValor()-movimentacao.getTaxa());
                }
                conta.setCurrent_balance((conta.getCurrent_balance()+movimentacao.getValor())-movimentacao.getTaxa());
            }else{
                conta.setCurrent_balance((conta.getCurrent_balance()-movimentacao.getValor())-movimentacao.getTaxa());
            }
            repository.save(movimentacao);
            contaService.update(conta);
        }
}
*/