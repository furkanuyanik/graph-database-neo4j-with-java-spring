Using Graph Database (Neo4J) with Java Spring Framework

* **Host:** localhost
* **Port:** 8081

**Download & Run:** http://localhost:8081/api/user

# A. CREATE A JAVA SPRING PROJECT
## 1. Create Project
- Go to https://start.spring.io/ and select congire settings
  - **Project:** Maven Project, 
  - **Language:** Java, 
  - **Spring Boot:** 2.1.6, 
  - **Packaging -> Jar Java:** 11 
  - **Dependencies:** Spring Web, Neo4J
  
- Generate the project

## 2. Set Configurations
- Open CMD and run 'mvnw spring-boot:run' in project files
- Open 'pom.xml' and insert to code
- Insert the following code
        <dependency>
            <groupId>org.neo4j</groupId>
            <artifactId>neo4j-ogm-bolt-driver</artifactId>
            <version>3.2.0-RC2</version>
        </dependency>
        
# B. CREATE A GRAPH DATABASE
## 1. Install "Neo4j Desktop" 
- Download from website https://neo4j.com/download/
- Install "Neo4j Desktop"
## 2. Create Graph
- Select "New Project"
- Click "Add Graph" from panel to be opened. 
- Start service
- Click "Open Browser" from Manage page
## 3. Add Data to Database
### a. Add Movie
* CREATE (Inception:Movie {title: 'Inception', director: 'Christopher Nalan'})
* CREATE (DarkKnight:Movie {title: 'The Dark Knight', director: 'Christopher Nalan'})
### b. Add User
* CREATE (FurkanUyanik: User {name: 'Furkan Uyanik', age: 23})
* CREATE (YunusKan: User {name: 'Yunus Kan', age: 39})
* CREATE (UmutNalkiran: User {name: 'Umut Nalkıran', age: 34})
* CREATE (GurkanSolen: User {name: 'Gürkan Şölen', age: 20})
### c. Add Connection
```* CREATE (Inception)-[:RATED {rating: 9}]->(FurkanUyanik)
* CREATE (Inception)-[:RATED {rating: 2}]->(YunusKan)
* CREATE (Inception)-[:RATED {rating: 6}]->(UmutNalkiran)
* CREATE (Inception)-[:RATED {rating: 4}]->(GurkanSolen)
* CREATE (DarkKnight)-[:RATED {rating: 1}]->(FurkanUyanik)
* CREATE (DarkKnight)-[:RATED {rating: 2}]->(YunusKan)
* CREATE (DarkKnight)-[:RATED {rating: 3}]->(UmutNalkiran)
* CREATE (DarkKnight)-[:RATED {rating: 4}]->(GurkanSolen)```
