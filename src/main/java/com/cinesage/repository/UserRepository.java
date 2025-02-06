package com.cinesage.repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.cinesage.model.User;

@Repository
public interface UserRepository extends CouchbaseRepository<User, String> {

}
