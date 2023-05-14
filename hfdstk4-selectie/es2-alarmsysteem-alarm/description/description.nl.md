# Instructies

## Bewegingsdetectie alarmsysteem

Je werkt voor een fabrikant van een intelligent alarmsysteem. Dit alarmsysteem moet afgaan indien het een beweging detecteert op een afstand van kleiner dan 500 cm. (5 meter) Het alarmsysteem mag echter niet afgaan bij bewegende dieren. Het systeem kan de grootte van bewegende personen of dieren meten. Een bewegend object wordt als een dier beschouwd indien het kleiner is dan 100 cm. 

Vul de methode `boolean moetAfgaanNaBeweging(int afstand, double grootteBewegendObject)` aan zodat deze `True` teruggeeft als het alarmsysteem af moet gaan. De methode krijgt volgende parameters mee:
- `afstand` : de asftand tot het bewegende object in cm
- `grootteBewegendObject` : de grootte van het bewegende object in cm

Vul de code op de plaats van de vraagtekens in.

<br>

_Ga met je muis over de tips om ze te bekijken. Tijdens een toets of het examen krijg je geen tips, dus weersta aan de verleiding om alle tips te openen zonder zelf eerst eens te proberen._

<br>


<p class="spoiler">
Je hebt hier een enkelvoudige selectie nodig. 
</p>

<p class="spoiler">
De booleaanse expressie zal meerdere voorwaarden bevatten.
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