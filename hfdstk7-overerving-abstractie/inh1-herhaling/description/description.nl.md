# Instructies

## Herhaling

Test
![klasdiagram](media/classDiagram.png)

Test

<br>

_Ga met je muis over de tips om ze te bekijken. Tijdens een toets of het examen krijg je geen tips, dus weersta aan de verleiding om alle tips te openen zonder zelf eerst eens te proberen._

<br>


<p class="spoiler">
De functie <code>IsCorrectBPM</code> moet <code>true</code> teruggeven indien de meegegeven bpm binnen de minimum en maximum BPM van het muziekgenre ligt (grenzen inbegrepen).
</p>

<p class="spoiler">
De constructor moet dus uitgebreid worden.
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