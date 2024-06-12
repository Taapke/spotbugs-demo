# Spotbugs Demo
This is a demo project to illustrate how to use SpotBugs for static code analysis in Java projects. SpotBugs helps identify potential bugs in Java programs by analyzing the bytecode.

## Getting started
Prerequisites
* Java Development Kit (JDK) 8 or higher
* Apache Maven

## Installation
Clone the repository:
``git clone https://github.com/Taapke/spotbugs-demo``
``cd spotbugs-demo``

``mvn compile``
``mvn spotbugs:check``

or to use with Spotbug gui:

``mvn compile``
``mvn spotbugs:gui``

## Usage
After running the commands, SpotBugs will analyze the code and generate a report. The results can be found in Intellij, the spotbugs gui or the target/spotbugsXml.xml file.

## Configuration
SpotBugs can be configured by modifying the pom.xml file. You can specify the rules and the format of the report according to your needs.