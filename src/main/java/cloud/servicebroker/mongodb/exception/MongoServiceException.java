package cloud.servicebroker.mongodb.exception;

import org.springframework.cloud.servicebroker.exception.ServiceBrokerException;

public class MongoServiceException extends ServiceBrokerException {

	public MongoServiceException(String message) {
		super(message);
	}
	
}
