package com.enterprise.cinesage.Repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.enterprise.cinesage.Model.User;

@Repository
public interface UserRepository extends CouchbaseRepository<User, String> {

}
