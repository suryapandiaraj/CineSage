package com.cinesage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.config.BeanNames;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.data.couchbase.repository.config.RepositoryOperationsMapping;

@Configuration
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

    @Override
    public String getConnectionString() {
        return "localhost";
    }

    @Override
    public String getUserName() {
        return "admin";
    }

    @Override
    public String getPassword() {
        return "admin1";
    }

    @Override
    public String getBucketName() {
        return "users";
    }

    @Bean(name = BeanNames.COUCHBASE_OPERATIONS_MAPPING)
    public RepositoryOperationsMapping couchbaseRepositoryOperationsMapping(CouchbaseTemplate couchbaseTemplate) {
        return new RepositoryOperationsMapping(couchbaseTemplate);
    }

}
