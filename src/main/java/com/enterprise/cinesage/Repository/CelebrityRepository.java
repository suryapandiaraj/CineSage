package com.enterprise.cinesage.Repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.enterprise.cinesage.Model.Celebrity;

@Repository
public interface CelebrityRepository extends CouchbaseRepository<Celebrity, String>{

}
