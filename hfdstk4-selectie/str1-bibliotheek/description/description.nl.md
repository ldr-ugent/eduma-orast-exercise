# Instructies

## Bibliotheek

In een bibliotheek worden boeken in de rekken gerangschikt per thema en per auteur. Op de rug van het boek wordt een sticker geplaatst met de eerste 4 letters van de auteur.

Vul de methode `String geefCodeVoorBoek(String auteur)` aan zodat deze de code teruggeeft die op de rug van het boek geplaatst moet worden. Volgende parameters worden meegegeven:
- `auteur` : de naam van de auteur, vb. 'Dahl Roald' of 'Rowling J. K.'

De code die je dient terug te geven dient uit maximum 4 letters te bestaan en moeten allemaal hoofdletters zijn. Indien de naam van de auteur korter is dan 4 letters, mag de code ook korter zijn dan 4 letters.

Vul de code op de plaats van de vraagtekens in.

<br>

_Ga met je muis over de tips om ze te bekijken. Tijdens een toets of het examen krijg je geen tips, dus weersta aan de verleiding om alle tips te openen zonder zelf eerst eens te proberen._

<br>


<p class="spoiler">
Met de functie <code>substring</code> haal je een deel uit een <code>String</code>.
</p>

<p class="spoiler">
De functie <code>substring</code> geeft een fout als je indexen meegeeft die groter zijn dan de lengte van de string.
</p>

<p class="spoiler">
De functie <code>length</code> geeft je de lengte van de string terug.
</p>

<p class="spoiler">
Met de functie <code>toUpperCase</code> kan je de <code>String</code> omzetten naar hoofdletters.
</p>

<style>
.spoiler {
  visibility: hidden;
}

.spoiler::before {
  visibility: visible;
  content: "Tip !";
  color:lightblue;
}

.spoiler:hover {
  visibility: visible;
}

.spoiler:hover::before {
  display: none;
}
</style>