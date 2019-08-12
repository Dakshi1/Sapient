package com.ps.mongodemo;



import java.util.Date;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@Getter
@Setter
@Document(collection="contacts")
public class Contact {

	@JsonProperty("_id")
	@XmlElement(name="_id")
	@Id
	private String id;
	private String firstname="Dakshi";
	private String lastname="Suri";
	private String gender;
	private String email="dakshi884@gmail.com";
	private String phone;
	private String dob;
	private String city="Bengaluru";
	private String state="Karnataka";
	private String country="India";
	private String picture;
	
}
