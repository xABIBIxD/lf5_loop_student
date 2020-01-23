#Zahlenverarbeitung**

Die Klasse `NumberAnalyser` bietet verschiedene Methoden an, um Ganze Zahlen zu verarbeiten

###Aufgaben
1. Implementiere in der Klasse `NumberAnalyser`die Methode `public int getGGT(int number1, int number2))`. 
Sie ermittelt den größten gemeinsamen Teiler der beiden übergebenen Zahlen. Der ggT lässt sich ermitteln, 
indem die kleinere der beiden Zahlen von der größeren abgezogen wird. Das Ergebnis wird dann in die Variable
 gespeichert, in der die größere Zahl steht. Dieser Vorgang wird solange wiederholt, bis das Ergebnis null ist.  
                                                                            
   ```
   Beispiel: 12 und 8
          
   12-8 = 4
   8-4=4
   4-4=0
   Der ggT ist also 4
    ```
2. Implementiere in der Klasse `NumberAnalyser`die Methode `public boolean isPrimeNumber(int number))`. Sie ermittelt,
ob es sich bei der übergebenen Zahl um eine Primzahl handelt. Primzahlen heißen Zahlen, die größer als 1, nur durch 1 und 
durch sich selbst ohne Rest teilbar sind. Handelt es sich um eine Primzahl, gibt die Methode true, andernfalls false zurück.
3. Implementiere in der Klasse `NumberAnalyser`die Methode `public String getPrimeNumbers(int start, int end)`. Sie gibt einen 
String zurück, der aus allen Primzahlen besteht, die sich in einem Intervall Start- und Endwert befinden.  
   ```
   Beispiel: Startwert = 4 und Endwert = 19
   Der zurückgegebene String lautet "5 7 11 13 17 19 "       
   ```
