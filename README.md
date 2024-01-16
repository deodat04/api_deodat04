* Description

Ce projet est une API (Application Programming Interface) qui permet de gérer une liste de produits. L'API offre des fonctionnalités pour créer, lire, mettre à jour et supprimer des produits de la liste.

* Avant de commencer, assurez-vous d'avoir effectué les étapes suivantes :

    Avoir installé Wamp Server (ou tout autre serveur de base de données MySQL).
    Avoir créé une base de données dans Wamp Server avec le même nom que celui renseigné dans le fichier application.properties.
    Modifier les informations d'accès à la base de données dans le fichier application.properties avec vos propres informations.

* Installation et exécution de l'API

    Cloner le projet à partir du dépôt GitHub.
    Assurez-vous que le serveur Wamp est en cours d'exécution.
    Exécutez l'API en utilisant un IDE compatible avec Java et Spring Boot, tel que Spring Tool Suite (STS).
    L'API sera accessible à l'adresse http://localhost:8080/produitApp/.

* Endpoints de l'API

    GET /produit/read: Récupérer la liste de tous les produits.
    POST /produit/create: Créer un nouveau produit en spécifiant les détails dans le corps de la requête (format JSON).
    PUT /produit/update/{id}: Mettre à jour les informations d'un produit existant en spécifiant l'ID du produit dans l'URL et les nouvelles informations dans le corps de la requête (format JSON).
    DELETE /produit/delete/{id}: Supprimer un produit en spécifiant l'ID du produit dans l'URL.

* Exemple d'utilisation

    Ouvrez Postman (ou tout autre outil de test d'API).
    Exécutez la requête GET http://localhost:8080/produit/read pour récupérer la liste des produits (étant vide au départ).
    Exécutez la requête POST http://localhost:8080/produit/create avec le corps de la requête pour créer un nouveau produit :

    {
        "nom": "Produit A",
        "prix": 100,
        "description": "Description du produit A",
        "devise": "EUR",
        "taxe": 10,
        "date_expiration": "2023-12-31",
        "fournisseur": "Fournisseur A"
    }

Vous pouvez maintenant utiliser les autres requêtes de l'API pour mettre à jour, supprimer ou ajouter d'autres produits.
