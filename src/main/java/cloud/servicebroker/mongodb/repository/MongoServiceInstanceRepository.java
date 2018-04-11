package cloud.servicebroker.mongodb.repository;

import cloud.servicebroker.mongodb.model.ServiceInstance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoServiceInstanceRepository extends MongoRepository<ServiceInstance, String> {

}