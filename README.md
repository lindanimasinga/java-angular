# java-angular project
This project consist of a java/spring project as a root folder and angular project is found is a folder called sample-angular


## LIVE demo hosted on AWS elastic bean stalk
Here is the url to the Angular application: http://assessment-env.eba-jsk3jput.us-east-1.elasticbeanstalk.com/ 

The Web page includes a home page users can register thier name surname and ID number. If invalid SA id number is entered. The api returns an error message displayed on the page.

To view reports, navigate on the menu and click report.

Here is the url to Swagger docs:  http://assessment-env.eba-jsk3jput.us-east-1.elasticbeanstalk.com/swagger-ui.html

## Building and running the java project

run ./mvn install to generate a war file. The war file should found on root/target/sample-1.0.war

run java -jar /target/sample-1.0.jar to start the application

to access the API webpage got to http://localhost:8080

to access API documentation http://localhost:8080/swagger-ui.html
