package com.desafiomv.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.desafiomv.enums.PersonType;

@Entity
@Table(name = "PERSON")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	@SequenceGenerator(name = "PERSON_SQ", sequenceName = "PERSON_SQ", allocationSize = 1)
	@GeneratedValue(generator = "PERSON_SQ", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Enumerated(EnumType.STRING)
	@Column(name = "TYPE", nullable = false)
	private PersonType type;

	@Column(name = "DOCUMENT_NUMBER", nullable = false)
	private String documentNumber;

	@Column(name = "CREATED_AT", nullable = false)
	private Date createdAt;

	@Column(name = "UPDATED_AT", nullable = true)
	private Date updatedAt;

	@Column(name = "EMAIL", unique = true, nullable = false)
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonType getType() {
		return type;
	}

	public void setType(PersonType type) {
		this.type = type;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

}
