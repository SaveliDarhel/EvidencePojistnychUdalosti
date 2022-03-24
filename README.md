# Evidence Pojistnych Udalosti App
My requalification project



## Motivation

Fully functional segment of Insurance-evidence app, from which i have learned basics of building Spring Boot applications with MVC structure, working with URL mapping and database communication repositories. In the project there are used @ManyToOne, @OneToMany, @JoinColumn database relations and basic dependency injections. 

Application uses Spring Boot Security configuration to achieve the role-based access that divides permission levels on User(systemUser) and Admin(systemAdmin). The view forms are also configured due to role-based access.



## How to run

To run this application you need:

- Java 8
- Apache NetBeans IDE 12.6 (or any other IDE where you can work with Spring Boot)
- MySQL server
- Your browser (Chrome)



### Next key elements are already installed as dependencies in pom.xml file, so you shouldn't extra install it to run this application:

- spring-boot-starter-thymeleaf
- mysql-connector-java
- spring-boot-starter-data-jpa
- javax.persistence-api
- spring-boot-starter-security
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
> | HomePageController | home.html | Pojistene |
> | PojisteniController | add.html | PojisteneRepository |
> | AdresyController | detail.html | Adresy |
> | | edit.html | AdresyRepository |
> | | spravovatPojisteni.html | SpringSecurityConfig |
> | | spravovatAdresy.html | |
> | | pridatPojisteni.html | |
> | | pridatAdresu.html | |
> | | editovatPojisteni.html | |
> | | editovatAdresu.html | |



## Features

**The app shows full functionality with next use cases**:

- Complete **CRUD** (Create, Read, Update, Delete) functionallyty with any of involving database tables 
- Roles-based access to the application so Read and Add operations are alowed for both thypes of users(systemUser, systemAdmin), but Edit and Delete operations are allowed only for systemAdmin.
- View templates of application has role-based access too, so users with 'USER' role only can not see some controles on the templates as shown on screenshots below:

**The Home page view of users with an 'ADMIN' Role**:

![HomePage 'ADMIN' view](/screenshots/systemAdminView.png)

**The Home page view of users with a 'USER' Role**:

![HomePage 'USER' view](/screenshots/systemUserView.png)


> Tables are connected together using *@OneToMany*, *@ManyToOne* and *@JoinColumns* annotations
> If you will remove an insured from the list, all of his insurance and addresses information will remove automatically


## Next-steps

- Add responsivity for smaller display users
- Improve visual style of application (*bootstrap custom styles*)
- Add payment account to every user (example: *insurance can be paid by an employee company*)




## Security

> Database security of application is fully managed by Spring Boot classes and functionality (*SpringSecurityConfiguration*)
