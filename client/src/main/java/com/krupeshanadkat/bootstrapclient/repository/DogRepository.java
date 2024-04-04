package com.krupeshanadkat.bootstrapclient.repository;

import com.krupeshanadkat.bootstrapclient.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
