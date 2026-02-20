# La classe String in Java ☕

La classe `String` in Java è fondamentale per la manipolazione di testo. Una sua caratteristica chiave è l'**immutabilità**: ogni volta che una stringa viene modificata, viene creato un nuovo oggetto `String` in memoria.

Di seguito una panoramica dei metodi più utilizzati.

-----

### **`length()`**

Restituisce il numero totale di caratteri nella stringa.

```java
String saluto = "Benvenuto!";
int lunghezza = saluto.length();
System.out.println("La lunghezza è: " + lunghezza); // Stampa: La lunghezza è: 10
```

-----

### **`charAt(int index)`**

Recupera il carattere a una posizione (indice) specifica. L'indice parte da 0.

```java
String parola = "Java";
char primoCarattere = parola.charAt(0); // 'J'
char terzoCarattere = parola.charAt(2); // 'v'
System.out.println("Primo carattere: " + primoCarattere); // Stampa: Primo carattere: J
```

-----

### **`substring(int beginIndex, int endIndex)`**

Estrae una porzione della stringa. La nuova stringa va dall'indice `beginIndex` fino a `endIndex - 1`. Esiste anche una versione con un solo parametro che estrae dall'indice specificato fino alla fine.

```java
String frase = "Imparare a programmare è divertente";
String sottoStringa = frase.substring(11, 22); // Estrae "programmare"
System.out.println(sottoStringa); // Stampa: programmare
```

-----

### **`equals()` e `equalsIgnoreCase()`**

  * `equals()`: Confronta due stringhe in modo **case-sensitive** (distingue maiuscole/minuscole).
  * `equalsIgnoreCase()`: Confronta due stringhe ignorando maiuscole e minuscole.

<!-- end list -->

```java
String str1 = "Ciao";
String str2 = "ciao";
String str3 = "Ciao";

System.out.println(str1.equals(str2));              // Stampa: false
System.out.println(str1.equalsIgnoreCase(str2));    // Stampa: true
System.out.println(str1.equals(str3));              // Stampa: true
```

-----

### **`toUpperCase()` e `toLowerCase()`**

Convertono l'intera stringa rispettivamente in maiuscolo e in minuscolo.

```java
String testo = "Questo è un Testo di Prova";
System.out.println(testo.toUpperCase()); // Stampa: QUESTO È UN TESTO DI PROVA
System.out.println(testo.toLowerCase()); // Stampa: questo è un testo di prova
```

-----

### **`trim()`**

Rimuove gli spazi bianchi all'inizio e alla fine della stringa. Perfetto per pulire l'input utente.

```java
String input = "   utente@email.com   ";
String pulito = input.trim();
System.out.println("'" + pulito + "'"); // Stampa: 'utente@email.com'
```

-----

### **`replace(String target, String replacement)`**

Sostituisce ogni occorrenza di una sequenza di caratteri con un'altra.

```java
String messaggio = "Il cielo è blu.";
String nuovoMessaggio = messaggio.replace("blu", "rosso");
System.out.println(nuovoMessaggio); // Stampa: Il cielo è rosso.
```

-----

### **`split(String delimiter)`**

Divide la stringa in un array di sotto-stringhe basandosi su un delimitatore.

```java
String lista = "mele,pere,banane,arance";
String[] frutta = lista.split(",");

for (String frutto : frutta) {
    System.out.println(frutto);
}
// Stampa:
// mele
// pere
// banane
// arance
```

-----

### **`indexOf(String str)`**

Restituisce l'indice della **prima** occorrenza della sotto-stringa specificata. Se non la trova, restituisce -1.

```java
String testo = "cercare per trovare e ricercare";
int primaOccorrenza = testo.indexOf("care");
System.out.println("Prima occorrenza di 'care': " + primaOccorrenza); // Stampa: 3
```

-----

### **`startsWith(String prefix)` e `endsWith(String suffix)`**

Verificano se la stringa inizia o termina con una sequenza di caratteri specifica.

```java
String file = "immagine.jpg";
System.out.println("Il file inizia con 'img': " + file.startsWith("img")); // Stampa: false
System.out.println("È un file JPG? " + file.endsWith(".jpg"));             // Stampa: true
```

-----

### **`contains(String s)`**

Controlla se la stringa contiene una determinata sequenza di caratteri.

```java
String frase = "La conoscenza è potere.";
boolean contienePotere = frase.contains("potere");
System.out.println("La frase contiene 'potere'? " + contienePotere); // Stampa: true
```

-----

### **`isEmpty()`**

Restituisce `true` se la stringa ha lunghezza 0, altrimenti `false`.

```java
String vuota = "";
String nonVuota = "Testo";
System.out.println(vuota.isEmpty()); // Stampa: true
System.out.println(nonVuota.isEmpty()); // Stampa: false
```

## Altri metodi utili che non sono della classe String

### **`Character.isAlphabetic(char c)`**

Restituisce `true` se il carattere è alfabetico, altrimenti `false`.

```java
char alfabetico = 'V';
String nonAlfabetico = '?';
System.out.println(Character.isAlphabetic(alfabetico)); // Stampa: true
System.out.println(Character.isAlphabetic(nonAlfabetico)); // Stampa: false
```

---

### **`Character.isDigit(char c)`**

Restituisce `true` se il carattere è numerico, altrimenti `false`.

```java
char numerico = '7';
String nonNumerico = 'X';
System.out.println(Character.isDigit(numerico)); // Stampa: true
System.out.println(Character.isDigit(nonNumerico)); // Stampa: false
```
