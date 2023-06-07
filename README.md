# Springo
Springo est une application web serveur développée avec Spring Boot et MongoDB. Elle permet de gérer une liste d'étudiants en utilisant les opérations CRUD (Create, Read, Update, Delete) via une API. L'application intègre une authentification par token pour sécuriser l'accès.

## Prerequis:
* Java 17
* Gradle
* nodejs (mode développement)

## Fonctionnalités
//todo
## Pour installer le projet en local, suivez les étapes suivantes :
1. Clonez le repo :
```bash
git clone https://github.com/saoudi-h/springo.git
```
2. Déplacez vous a l'interieur du dossier du projet :
```bash
cd springo
```

3. Installation des dépendances du serveur:

```bash
gradle clean build
```
4. Pour lancer le serveur en mode developpement, exécutez la commande suivante :
```bash
gradle bootRun
```
5. Installation des dépendances de l'application frontend et lancement de cette dernière en mode développement:
```bash
cd frontend
npm install
npm run dev
```
## Contributeurs
Ce projet a été développé par Hakim Saoudi.
## Licence
Ce projet est sous licence [MIT](https://opensource.org/licenses/MIT).
