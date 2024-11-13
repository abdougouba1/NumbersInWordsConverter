# Numbers in Words

## Description

Ce projet est une application Java conçue pour convertir des montants numériques en leur représentation en mots. C’est utile dans des cas comme les chèques ou contrats où il est nécessaire d’écrire les montants en chiffres et en mots pour éviter les erreurs ou les fraudes. Par exemple, un montant de 745 $ serait écrit comme « seven hundred and forty-five dollars ».

## Fonctionnalités

1. **Conversion de nombres en mots** : 
   - Permet de convertir un nombre entier en sa représentation textuelle.
   - Exemple : `745` devient `seven hundred and forty-five`.

2. **Conversion inverse (mots en nombres)** : 
   - Permet de convertir une phrase en un nombre entier.
   - Exemple : `seven hundred and forty-five` devient `745`.

3. **Test-Driven Development (TDD)** :
   - Ce projet est développé avec une approche TDD, avec des tests unitaires pour garantir la précision des conversions.
   
## Prérequis

- **Java 17** : Le projet est configuré pour Java 17.
- **Maven** : Utilisé pour la gestion des dépendances et la compilation du projet.

## Dépendances Principales

- **Spring Context** et **Spring Web** : Utilisés pour gérer le contexte de l'application et pour le support de l'API web (si vous ajoutez une API REST).
- **AWS SDK** : Inclut pour la connectivité avec AWS si besoin.
- **JUnit** et **AssertJ** : Pour les tests unitaires et les assertions.

## Installation

1. Clonez le dépôt :

   ```bash
   git clone https://github.com/abdougouba1/NumbersInWordsConverter.git
   cd numbers-in-words
