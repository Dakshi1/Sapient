package com.ps.mongodemo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactsDao extends MongoRepository<Contact, ObjectId> {

	

}
