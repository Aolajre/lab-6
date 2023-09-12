# Use the official Tomcat 10 image as the base image
FROM tomcat:10-jre11-slim

# Remove the default Tomcat webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR file into the Tomcat webapps directory
COPY target/lab6.war /usr/local/tomcat/webapps/

# Expose the HTTP port (default is 8080)
EXPOSE 8080

# Start Tomcat when the container starts
CMD ["catalina.sh", "run"]
