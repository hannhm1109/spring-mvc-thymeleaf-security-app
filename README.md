# 🛠️ Projet Spring MVC - Gestion des Produits

Ce projet est une application web simple développée avec **Spring Boot**, **Spring MVC**, **Thymeleaf**, et **Spring Data JPA**.  
Il permet de gérer une liste de produits avec des opérations de base comme l’ajout et l’affichage.

## ✅ Fonctionnalités

- Création automatique de produits à l’exécution
- Affichage de la liste des produits dans la console
- Structure simple et claire pour apprendre Spring MVC

## 🧱 Technologies utilisées

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- H2 (base de données en mémoire)
- Lombok

## 📁 Structure du projet

- `entities/` : contient la classe `Product`
- `repository/` : contient l’interface `ProductRepository`
- `BdccEnsetSpringMvcApplication` : classe principale qui initialise le projet et insère des données test

## ▶️ Lancer le projet

Assure-toi d’avoir Java installé, puis exécute la commande suivante :

```bash
./mvnw spring-boot:run

## 📦 Produits ajoutés automatiquement

Les produits suivants seront ajoutés automatiquement :

- **Computer**
- **Printer**
- **Smart Phone**

## 🖥️ Exemple de sortie (console)

```plaintext
Product(id=1, name=Computer, price=5400.0, quantity=12.0)
Product(id=2, name=Printer, price=1200.0, quantity=11.0)
Product(id=3, name=Smart Phone, price=12000.0, quantity=33.0)
