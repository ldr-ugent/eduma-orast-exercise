# Instructies

Je krijgt extra zakgeld!

Vul de methode `double berekenNieuwZakgeld(double oudZakgeld, double procentExtra)` aan zodat deze het nieuwe bedrag dat je aan zakgeld zult krijgen berekent en teruggeeft. De methode krijgt volgende parameters mee:
- `oudZakgeld` : het huidige bedrag dat je aan zakgeld krijgt
- `procentExtra` : hoeveel procent je extra krijgt (bij 10% extra zal de waarde 10.0 zijn). Dit zal altijd groter of gelijk zijn aan 0.

Vul de expressie op de plaats van de vraagtekens in.

<p class="spoiler">
15% = 15.0 / 100.0 
</p>

<p class="spoiler">
15% van bedrag = 15.0 / 100.0 * bedrag
</p>

<p class="spoiler">
Je krijgt extra zakgeld, dus het nieuwe bedrag is altijd hoger dan het oude ;-)
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