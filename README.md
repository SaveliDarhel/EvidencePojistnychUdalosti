# Evidence Pojistnych Udalosti App
Requalification Project



## Motivation

Fully functional segment of Insurance evidence app, from which i have learned basics of building Spring Boot applications with MVC structure, working with URL mapping and database communication repositories



## How to run

To run this application you need:

- Java 11
- Apache NetBeans IDE 12.6 (or any other IDE where you can work with Spring Boot)
- MySQL
- Your browser



### Next key elements are already installed as dependencies in pom.xml file, so you shouldn't extra install it to run this application:

- bootstrap 5
- spring-boot-starter-thymeleaf
- mysql-connector-java
- spring-boot-starter-data-jpa
- javax.persistence-api

> 
> After run application (left click in main -> run) the Tomcat server will run, and you will see the main page of application on url(http://localhost:8080/home)
> 



## Architecture

### MVC architecture means dividing responsibilities between Model, View and Controller:

- Models (stores logic operations of application)
- Controllers (manages data flow of application through URL address mapping)
- Views (shows an information to users of an application by help of HTML forms connecting with different URL address)

> | Controller | View | Model |
> | :-----------: | :-----: | :-------: |
> | HomePageController | add.html detail.html edit.html home.html | Pojistene PojisteneRepository |



## Features

Now the app shows full functional but only with one database table (Pojistene):

- Show list of insured (Pojisteny)
- Show detail of insured (Pojisteny)
- Create of Insured person (Pojisteny)
- Delete insured
- Edit ensured



## Next-steps

- Manage one-to-many relationship and improve the rest of functionality (insurance, insurance incidents)
- Improve visual style of application (bootstrap custom styles)
- Add roles (User, Administrator)
- Add payment account to every user (example: insurance can be paid by an employer)



## Security

> Database security of application is fully managed by Spring Boot classes and functionality (CrudRepository)
