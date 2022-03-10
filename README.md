# Evidence Pojistnych Udalosti App
My requalification project



## Motivation

Fully functional segment of Insurance-evidence app, from which i have learned basics of building Spring Boot applications with MVC structure, working with URL mapping and database communication repositories. In project are used @ManyToOne, @OneToMany, @JoinColumn hybernate annotations and @Autowired dependency injections.



## How to run

To run this application you need:

- Java 11
- Apache NetBeans IDE 12.6 (or any other IDE where you can work with Spring Boot)
- MySQL
- Your browser



### Next key elements are already installed as dependencies in pom.xml file, so you shouldn't extra install it to run this application:

- spring-boot-starter-thymeleaf
- mysql-connector-java
- spring-boot-starter-data-jpa
- javax.persistence-api
- Also i used Botstrap 5 to improve user experiance from the application

> 
> After run application (left click in main -> run) the Tomcat server will run, and you will see the main page of application on url(http://localhost:8080/home)
> 



## Architecture

### MVC architecture means dividing responsibilities between Model, View and Controller:

- *Models* (stores logic operations of application)
- *Controllers* (manages data flow of application through URL address mapping)
- *Views* (shows an information to users of an application by help of HTML forms connecting with different URL address)


> ### Table illustrates classes and HTML foms that used in arcitecture of this version of app
> 
> | **Controller** | **View** | **Model** |
> | :-----------: | :-----: | :-------: |
> | HomePageController | add.html; detail.html; edit.html; home.html; | Pojistene; PojisteneRepository |



## Features

The app shows full functional with database table (*Pojistene*):

- Show list of insured (Pojisteny)
- Show detail of insured (Pojisteny)
- Create insured person (Pojisteny)
- Delete insured
- Edit ensured

> After last update app have also full functionality with Insuranse(*Pojisteni*). Tables are connected together by *@OneToMany*, *@ManyToOne* and 
> *@JoinColumns* annotations, so functionality improved on:

- Add insurance (Pojisteni)
- Show list of insurance (Pojisteni) for particular person (Pojisteny)
- Edit insurance information (examle: insuranse name or type)
- Delete insuranse from the list

> After update if you will remove an insured from the list, all of his insurance information will remove automatically


## Next-steps

- Add "address" table conected with "insured" table by OneToMany relation
- Improve visual style of application (*bootstrap custom styles*)
- Add roles (*User, Administrator*)
- Add payment account to every user (example: *insurance can be paid by an employee company*)
- Add responsivity for mobile devices



## Security

> Database security of application is fully managed by Spring Boot classes and functionality (*CrudRepository*)
