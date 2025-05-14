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
- **Database**: SQL (if applicable for test data or reporting)

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