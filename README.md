Using Graph Database (Neo4J) with Java Spring Framework

# CREATE A JAVA SPRING PROJECT
1. Go to https://start.spring.io/ and select congire settings
  - Project: Maven Project, 
  - Language: Java, 
  - Spring Boot: 2.1.6, 
  - Packaging -> Jar Java: 11 
  - Dependencies: Spring Web, Neo4J
  
2. Generate the project

# SET CONFIGURATIONS

1. Open CMD and run 'mvnw spring-boot:run' in project files
2. Open 'pom.xml' and insert to code
3. Insert the following code
        <dependency>
            <groupId>org.neo4j</groupId>
            <artifactId>neo4j-ogm-bolt-driver</artifactId>
            <version>2.1.1</version>
        </dependency>
        
# INSTALL "Neo4j Desktop" and Create Graph
1. Download from website https://neo4j.com/download/
2. Install "Neo4j Desktop"
3. Select "New Project"
4. Click "Add Graph" from panel to be opened. Then click "Manage" button, Go to details and "Start" service 
