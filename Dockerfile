FROM tomcat:8.5.31-jre8
COPY /target/privacy-workshop.war /usr/local/tomcat/webapps/pw.war

