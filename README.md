<h1 align="center">Students Project</h1>

<p align="center">
    <h4 align="center">Developed with the software and tools below</h4>
    <div align="center">
    <img src="https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot">
    <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white">
    <img src="https://img.shields.io/badge/Thymeleaf-%23005C0F.svg?style=for-the-badge&logo=Thymeleaf&logoColor=white">
    <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white">
    </div>
</p>

---

## Overview

Back- und Frontend meines ersten Spring Boot Projects. Angefangen habe ich mit [diesem Tutorial](https://www.youtube.com/watch?v=9SGDpanrc8U&ab_channel=Amigoscode)
und später habe ich das Projekt einfach selber erweitert, z.B. mit Thymeleaf um mit meinem Frontend zu kommunizieren, damit
ich über das Frontend Schüler "erstellen", "löschen" und "bearbeiten" kann. Um die Datenbank zu verwalten benutze ich PostgreSQL.

## Getting Started

### Setup

1. Clone this repository

```
git clone https://github.com/github-gabriel/vertretungsplan.git
```

2. Go into the `vertretungsplan-server` folder

```
cd .\vertretungsplan-server\
```

3. To compile, build and test the code run

```
mvn clean install
```

or if you don't have Maven installed you can just use the Maven Wrapper inside the project

```
.\mvnw clean install
```

### Running the Server

After you built everything you can run

```
mvn spring-boot:run
```

or use the Maven Wrapper

```
.\mvnw spring-boot:run
```

to start the application.

Now you can visit http://localhost:8080/students 

## Screenshots

![View_Student](https://github.com/github-gabriel/students-project/assets/92476790/24594504-c9f2-46a5-91f8-dc93028e03bd)

![Create_Student](https://github.com/github-gabriel/students-project/assets/92476790/3d47c073-9c61-46b6-9f7d-cdda7c84ff28)

![Edit_Student](https://github.com/github-gabriel/students-project/assets/92476790/3309bc0e-1d9a-4ebf-a416-c0f9ed410651)

