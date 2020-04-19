FROM tomcat
ADD target/sample-0.0.1-SNAPSHOT.war ./webapps/sample.war
RUN ls webapps
EXPOSE 8085
CMD ["catalina.sh", "run"]