# spring-cloud-config-example

Run with 

java -jar spring-cloud-config-example.jar --current.environment=integration

to set the envrionment - otherwise it defaults to "developer"

When run, by default, the config server tries to get the data from 

https://github.com/nds-examples/properties-examples

by git checkout.

To access the data when the server is running call - 

http://localhost:8888/application-one/info

or similar