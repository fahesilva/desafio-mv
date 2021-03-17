package com.desafiomv.services;


import org.springframework.stereotype.Service;

import com.desafiomv.exception.ResourceNotFoundException;
import com.desafiomv.models.Address;
import com.desafiomv.repository.AddressRepository;

import java.util.List;

@Service
public class AddressService {
    
    private AddressRepository repository;

    public Address getEndereco (int id){
        Address Endereco = repository.findById(id).get();

        if(Endereco!=null){
            return Endereco;
        }else{
            throw new ResourceNotFoundException("Endereço nao encontrado");
        }

    }

    public List<Address> list (){
        List<Address> Enderecos = repository.findAll();
        if (Enderecos.isEmpty()){
            throw new ResourceNotFoundException("Lista de endereços vazia ");
        }else {
            return Enderecos;
        }
    }

    public void save (Address Endereco){
        if(repository.findById(Endereco.getId())==null){
            repository.save(Endereco);
        }
    }
    public void update (Address Endereco){
        if(repository.findById(Endereco.getId())!=null){
            repository.save(Endereco);
        }else{
            throw new ResourceNotFoundException("Endereço nao encontrado para editar");
        }
    }
}
