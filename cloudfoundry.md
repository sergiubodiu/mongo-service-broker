## service-broker-mongodb

## Installation and Usage for Cloud Foundry

PREREQUISITES:
- Cloud Foundry is up and running
- You can use PCFDev / CFLocal

## Deploy the Service Broker to Cloud Foundry

The service broker is configured via environment variables, which are defined in the `manifest.yml` file. Make the necessary changes to the MongoDB config in order to connect to your Mongo instance.

Push the service broker as an app to Cloud Foundry:
`cf push`

Register the service broker using the default username and the password obtained from the previous step:
`cf csb mongodb admin admin http://mongodb-service-broker.local.pcfdev.io`

Enable access to the service broker:
`cf enable-service-access mongodb`

Create a service instance:
`cf cs mongodb default mymongodb`