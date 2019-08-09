package com.sapient.springboot.contactservice;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@Getter
@Setter
@Table(name = "contacts")
public class Contact {

	@JsonProperty("_id")
	@XmlElement(name="_id")
	@Id
	@GeneratedValue(generator = "increment")
	private Integer id;
	private String firstname="Dakshi";
	private String lastname="Suri";
	private String gender;
	private String email="dakshi884@gmail.com";
	private String phone;
	private Date dob;
	private String city="Bengaluru";
	private String state="Karnataka";
	private String country="India";
	private String picture;
	
}
