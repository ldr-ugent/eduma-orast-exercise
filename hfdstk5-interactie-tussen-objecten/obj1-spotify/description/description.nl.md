# Instructies

## Spotify

In een boek staat meestal vermeld in welk jaar het gedrukt is. Een voorbeeld zie je hieronder.

```mermaid
classDiagram
    Animal <|-- Duck
    Animal <|-- Fish
    Animal <|-- Zebra
    Animal : +int age
    Animal : +String gender
    Animal: +isMammal()
    Animal: +mate()
    class Duck{
      +String beakColor
      +swim()
      +quack()
    }
    class Fish{
      -int sizeInFeet
      -canEat()
    }
    class Zebra{
      +bool is_wild
      +run()
    }
```


Vul de methode `int geefJaarVanDruk(String drukVermelding)` aan zodat deze het jaar teruggeeft waarin het boek gedrukt werd. Volgende parameters worden meegegeven:
- `drukVermelding` : een `String` met de drukvermelding. Bijv. 'Vierde druk: 2020' Je mag er van uitgaan dat de laatste 4 karakters van de string het jaar bevatten.

Vul de code op de plaats van de vraagtekens in.




<br>

_Ga met je muis over de tips om ze te bekijken. Tijdens een toets of het examen krijg je geen tips, dus weersta aan de verleiding om alle tips te openen zonder zelf eerst eens te proberen._

<br>


<p class="spoiler">
Met de functie <code>substring</code> haal je een deel uit een <code>String</code>.
</p>

<p class="spoiler">
De functie <code>length</code> geeft je de lengte van de string terug.
</p>

<p class="spoiler">
Je zult een <code>String</code> moeten omzetten naar een getal. Kijk in je boek hoe dit moet.
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