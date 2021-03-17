package com.desafiomv.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafiomv.exception.ResourceNotFoundException;
import com.desafiomv.models.Account;
import com.desafiomv.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repository;


    public Account getConta (String numero){
        Account Conta = repository.findById(numero).get();

        if(Conta!=null){
            return Conta;
        }else{
            throw new ResourceNotFoundException("Conta não encontrado");
        }

    }

    public List<Account> list (){
        List<Account> Contas = repository.findAll();
        if (Contas.isEmpty()){
            throw new ResourceNotFoundException("Lista vazia");
        }else {
            return Contas;
        }
    }

    public void save (Account Conta){
        if(repository.findById(Conta.getAccNumber())==null){
            repository.save(Conta);
        }
    }
    public void update (Account Conta){
        if(repository.findById(Conta.getAccNumber())!=null){
            repository.save(Conta);
        }else{
            throw new ResourceNotFoundException("Conta não encontrada");
        }
    }

 
}