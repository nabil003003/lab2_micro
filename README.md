# Lab 2 : Injection de dépendances avec Spring

Ce projet Java montre comment Spring injecte une dépendance avec les annotations et un fichier XML.

La classe `MetierImpl` utilise `IDao` pour lire une valeur et la multiplier par deux. Son attribut s'appelle `sourceDonnees`.

`DaoImpl` retourne 100 et utilise le profil `prod`. `DaoImpl2` retourne 150 et utilise le profil `dev`.

`Presentation2` active le profil `dev` et choisit `dao2` avec `@Qualifier`. Le résultat est 300.

`PresentationXML` charge `applicationContext.xml`. Le fichier injecte `dao2` avec le setter `setSourceDonnees`. Le résultat est aussi 300.

## Exécution

Utiliser un JDK 17 ou supérieur et Maven.

```bash
mvn test
```

Ouvrir le projet dans IntelliJ IDEA et lancer `Presentation2` ou `PresentationXML`.

## Captures du TP

Les captures montrent les étapes du TP avant le renommage de l'attribut.

Première exécution : le résultat est 200 avec une valeur de 100.

![Résultat égal à 200](docs/images/resultat-200.jpg)

Avec `@Qualifier("dao2")`, Spring utilise la deuxième implémentation. Le résultat est 300.

![Injection avec Qualifier](docs/images/injection-qualifier.jpg)

Le profil `dev` active la version de développement. Le résultat est 300.

![Exécution avec le profil dev](docs/images/profil-dev.jpg)
