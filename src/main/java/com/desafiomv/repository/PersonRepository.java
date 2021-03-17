package com.desafiomv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafiomv.models.Person;

public interface PersonRepository extends JpaRepository<Person,Integer> {

   Person findByDocumentNumber(String documentNumber);
}