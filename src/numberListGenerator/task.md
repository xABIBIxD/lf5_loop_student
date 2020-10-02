# Zahlengenerator *

Die Klasse `Generator` bietet zwei methoden an um einen String mit einer Zahlenfolge zu generieren. Die Zahlenfolge soll immer aufsteigend sein, d.h. der Startwert muss kleiner als der Endwert sein. Ist dies nicht der Fall, soll ein leerer String zurückgegeben werden.

### Aufgaben

1. Implementiere in der Klasse `Generator` die Methode `public String generateNumbers(int start, int end)`. Diese Methode soll einen String mit der Zahlenfolge von `start` bis inklusive `end` erstellen. Die Zahlen sind mit einem `,` zu trennen.
2. Implementiere in der Klasse `Generator` die Methode `public String generateNumbers(int start, int end, int steps, char delimiter)`. In ergänzung zu 1. soll beliebige Schrittweite sowie ein beliebige Trennzeichen (statt `,`) verwendet werden können.