package cloud.servicebroker.mongodb.repository;

import cloud.servicebroker.mongodb.model.ServiceInstanceBinding;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoServiceInstanceBindingRepository extends MongoRepository<ServiceInstanceBinding, String> {

}
