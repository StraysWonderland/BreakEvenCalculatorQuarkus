# BreakEvenCalculatorQuarkus
Sample Quarkus Serverless Function written in Java
This Repo is meant to test how easy the workflow for developing, testing and deploying a function to different serverless plattforms is.


The code is a simple break even function.
- Developed with Quarkus
- Using GraalVM to build binary executable

## Running Locally
Quarkus allows to test the code by running it locally with hot reload.
- compile in development mode
  ```bash
  ./mvnw compile quarkus:dev
  ```

## Package into native executable
- add to pom.xml
  ```xml
  <profiles>
      <profile>
          <id>native</id>
          <properties>
              <quarkus.package.type>native</quarkus.package.type>
          </properties>
      </profile>
  </profiles>
  ```
- run
  ```bash
  ./mvnw package -Pnative
  ```
