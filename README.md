Using Graph Database (Neo4J) with Java Spring Framework

# CREATE A JAVA SPRING PROJECT
1. Go to https://start.spring.io/ and select congire settings
  - Project: Maven Project, 
  - Language: Java, 
  - Spring Boot: 2.1.6, 
  - Packaging -> Jar Java: 11 
  - Dependencies: Spring Web, Neo4J
  
2. Generate the project

## Set Configurations
1. Open CMD and run 'mvnw spring-boot:run' in project files
2. Open 'pom.xml' and insert to code
3. Insert the following code
        <dependency>
            <groupId>org.neo4j</groupId>
            <artifactId>neo4j-ogm-bolt-driver</artifactId>
            <version>3.2.0-RC2</version>
        </dependency>
        
# CREATE A GRAPH DATABASE
## Install "Neo4j Desktop" 
1. Download from website https://neo4j.com/download/
2. Install "Neo4j Desktop"
## Create Graph
1. Select "New Project"
2. Click "Add Graph" from panel to be opened. 
3. Start service
4. Click "Open Browser" from Manage page
## Add Data to Database
### Add Movie
* CREATE (Inception:Movie {title: 'Inception', director: 'Christopher Nalan'})
* CREATE (DarkKnight:Movie {title: 'The Dark Knight', director: 'Christopher Nalan'})
### Add User
* CREATE (Furkan: User {name: 'Furkan Uyanik', age: 23})
* CREATE (Umut: User {name: 'Yunus Nalkiran', age: 39})
