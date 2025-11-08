# tp1-ACE

# Core Application

Application Java utilisant l'injection de dépendances via réflexion.

## Description

Ce projet implémente une architecture en couches avec :
- **Repository Layer** : Gestion de l'accès aux données
- **Service Layer** : Logique métier
- **UI Layer** : Interface utilisateur et contrôleur

## Structure du projet

```
src/main/java/com/project/core/
├── repository/
│   ├── DataRepository.java (interface)
│   └── RepositoryImplementation.java
├── service/
│   ├── BusinessService.java (interface)
│   └── ServiceImplementation.java
├── ui/
│   └── ApplicationController.java
└── Application.java
```

## Configuration

Le fichier `application.properties` contient les chemins complets des classes à instancier :
- Première ligne : classe Repository
- Deuxième ligne : classe Service

## Compilation et exécution

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.project.core.ui.ApplicationController"
```

## Technologies

- Java 23
- Maven
- Reflection API

## Auteur

Projet académique - KARKACHI Mohamed

