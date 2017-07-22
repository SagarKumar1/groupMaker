package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import pojo.test;

@Repository
public interface testRepository extends MongoRepository<test, String>{
}
