### Build Application
```
$ mvn clean package
```
### Build docker image
```
$ docker image build --build-arg JAR_FILE=target/product-service-0.1.0.jar -t rselva/product-service:beta
```
### Run container 
```
$ docker container run --rm -d -p 8080:8080 --name product-service rselva/product-service:beta
```
http://localhost:8080
### Cleanup
```
$ docker container rm product-service