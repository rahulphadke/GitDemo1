# Hello World Java Project

This project is a simple Java application that prints "Hello, World!" to the console. It serves as an introductory example for Java development using Maven.

## Project Structure

```
hello-world-java
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── App.java
│   │   └── resources
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── AppTest.java
├── pom.xml
├── .gitignore
└── README.md
```

## Requirements

- Java Development Kit (JDK) 8 or higher
- Maven 3.6 or higher

## Building the Project

To build the project, navigate to the project directory and run the following command:

```
mvn clean install
```

## Running the Application

After building the project, you can run the application using the following command:

```
mvn exec:java -Dexec.mainClass="com.example.App"
```

## Running Tests

To run the tests, use the following command:

```
mvn test
```

## License

This project is licensed under the MIT License.