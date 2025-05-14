# Project: Basic Healenium Automation

## Overview

This project, **Basic Healenium Automation**, is a Java-based automation framework designed to leverage Healenium for
self-healing test automation. It provides a robust solution for maintaining automated tests by automatically recovering
from changes in the UI, reducing manual intervention and maintenance efforts.

## Key Features

- **Self-Healing Automation**: Utilizes Healenium to detect and recover from changes in UI elements during test
  execution.
- **Customizable Recovery**: Configurable recovery attempts and scoring thresholds for element healing.
- **Lightweight Configuration**: Simple setup using `healenium.properties` for server and healing parameters.
- **Maven Integration**: Built with Maven for dependency management and build automation.

## Technologies Used

- **Programming Language**: Java
- **Build Tool**: Maven
- **Configuration**: `.properties` file for Healenium settings
- **Database**: POSTGRES

## File Structure

- `src/main/java/in/co/quickvikalp/App.java`: Contains the main entry point of the application.
- `src/test/resources/healenium.properties`: Configuration file for Healenium settings.
- `README.md`: Documentation for the project.

## Configuration

The `healenium.properties` file allows customization of the following parameters:

- `recovery-tries`: Number of attempts to recover a broken locator.
- `score-cap`: Minimum confidence score for a successful recovery.
- `heal-enabled`: Enables or disables the self-healing feature.
- `serverHost` and `serverPort`: Host and port for the Healenium server.
- `imitatePort`: Port for the imitation server.

## Usage

1. Clone the repository.
2. Configure the `healenium.properties` file as per your requirements.
3. Build the project using Maven:
   ```bash
   mvn clean install
4. Open terminal and navigate inside "infra" folder.   
5. Run the command "docker-compose up -d" to start the Healenium server. Make sure that Docker desktop app is up and running.

## How to Test?

1. Open the `TestCase.java` file.
2. Run the test cases.
3. After execution, verify the passed test cases in the console.
4. Set a breakpoint in the `LoginPage.java` file at line 38.
5. Run the code in debug mode.
6. Once the website opens, inspect the username field in the browser.
7. Modify the placeholder attribute of the username field in the inspected HTML.
8. Resume the code execution from the breakpoint.
9. Observe the self-healing process as the locator is automatically adjusted, and the username field is filled.
10. Check the console logs to view details of the healing process.
11. Also you can verify the healenium report using the URL as "http://localhost:7878/healenium/report/"