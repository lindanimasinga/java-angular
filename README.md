# java-angular project
This project consist of a java/spring project as a root folder and angular project is found is a folder called sample-angular


## LIVE demo hosted on AWS elastic bean stalk
Here is the url to the Angular application: http://assessment-env.eba-jsk3jput.us-east-1.elasticbeanstalk.com/ 

Here is the url to Swagger docs:  http://assessment-env.eba-jsk3jput.us-east-1.elasticbeanstalk.com/swagger-ui.html

## Building the Angular project
To build and run the angular project ensure you have the following

This project was generated with Angular CLI version 8.2.0.

once installed, run npm install to download all dependencies

Run ng build --prod and all javascript file will be built and stored on root/main/resources/static of the springboot project


## Building the java project
Make sure you have java 8 and tomcat8.5 or higher installed

run ./mvn install to generate a war file. The war file should found on root/target/sample-1.0.war

Deploy the warfile in the tomcat container webapps director

to access the API webpage got to http://localhost:8080
