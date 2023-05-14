# Instructies

## Punten songfestival

Op het Eurovisie songfestival mag een land aan 10 andere landen punten geven. De eerste krijgt 12 punten, de 2<sup>e</sup> krijgt 10 punten, de 3<sup>e</sup> 8 punten en dan telkens 1 punt minder tot de 10<sup>e</sup> die 1 punt krijgt. 


| Plaats | Punten |
|-------:|-------:|
| 1 | 12 |
| 2 | 10 |
| 3 | 8 |
| 4 | 7 |
| ... | ... |
| 10 | 1 |

Vul de methode `int plaatsNaarPunten(int plaats)` aan zodat deze het aantal punten teruggeeft die overeenkomt met de plaats. De methode krijgt volgende parameters mee:
- `plaats` : de plaats van het land bij de toekenning van punten. Dit is altijd een getal tussen 1 en 10 (1 en 10 inbegrepen).

Vul de code op de plaats van de vraagtekens in.

<br>

_Ga met je muis over de tips om ze te bekijken. Tijdens een toets of het examen krijg je geen tips, dus weersta aan de verleiding om alle tips te openen zonder zelf eerst eens te proberen._

<br>


<p class="spoiler">
Je hebt hier een meervoudige selectie nodig. 
</p>

<p class="spoiler">
Je hoeft geen 10 selectieblokken te hebben. Vanaf de 3<sup>e</sup> plaats krijg je één punt minder per plaats verder. Dit kan je berekenen.
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