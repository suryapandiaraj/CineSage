package com.cinesage.repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.cinesage.model.Celebrity;

@Repository
public interface CelebrityRepository extends CouchbaseRepository<Celebrity, String>{

}
