package com.sapient.springboot.contactservice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactsDao extends MongoRepository<Contact, Integer> {

}
