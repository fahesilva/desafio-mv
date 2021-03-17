package com.desafiomv.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.desafiomv.models.Address;


public interface AddressRepository extends JpaRepository <Address,Integer> {

   
}