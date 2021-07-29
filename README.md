##This project simulates taxi service's work.

**Functionality**:

  As a user you can be a driver. Fo r this you must register or login, using login and password.
  After this action you can see information about another drivers, cars, drivers cars, assign driver to a car.
  Without registration you can only add new driver.
  The project was written using N-tier architecture, used  Injector(that simulate Spring's working) and reflection API. 

**Technologies used**:
- JDK 
- JDBC
- MySQL
- Servlet
- JSP
- JSTL
- Tomcat 9.0.50
- Maven

**To run the project on your local machine**,
- Download or clone this project into your local folder, whereupon open the project in an IDE. Recommend use the Intellij idea
- Install and configure Local Tomcat Server (set "/" in Deployment - web-security:war exploded).
- Download MySQL and MySQL Workbench. After copy code with file "init_db" from resources folder
and establish a connection with your java project. In the java.taxi.util.ConnectionUtil change my Database settings to your own.
- Run this project!

