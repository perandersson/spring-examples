# Example1

Empty Project. 

## Build using maven

The source code is written to be compatible with java 16. This is set using the reserved
property **maven.compiler.source**. The built binary file will also be java 16 compatible. This is defined
using the **maven.compiler.target** property.

Use the following command to build the application:

```bash
mvn install
```

Result is put into the **target** folder.

## Run in terminal

Build name is decided by maven and is <groupid>-<artifactid>-<version>.jar by default.

```bash
java -jar target/se.westcoastcode-example1-1.0-SNAPSHOT.jar
```

## Run in editor

Main method is **se.westcoastcode.example1.Application.main**.
