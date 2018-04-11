# Overview

This sample project to implement a MongoDB service.

## Getting Started

You need to install and run MongoDB somewhere and configure connectivity in [application.yml](src/main/resources/application.yml).

Build it:

    ./gradlew build

After building, you can push the broker app to Cloud Foundry or deploy it some other way and then [register it to Cloud Foundry](http://docs.cloudfoundry.org/services/managing-service-brokers.html#register-broker).


## Enable Auth in your MongoDB instance

Add the Initial Admin User:
```
$ mongo
> use admin
> db.createUser({ user: 'admin', pwd: 'password', roles: [{"role" : "readWriteAnyDatabase","db" : "admin"},{"role" : "userAdminAnyDatabase","db" : "admin"}] });
```

Update your mongod.conf file to enable authorization. For example, add lines like these: 

```
security:
  authorization: enabled
```

Restart your Mongo service and test that authentication is working as expected: 

`mongo --authenticationDatabase "admin" -u "admin" -p "password"`

Refer to the MongoDB docs for more details: https://docs.mongodb.com/manual/tutorial/enable-authentication/

##  Legacy mongo-service-broker
Mongo Broker https://github.com/sergiubodiu/spring-service-broker
