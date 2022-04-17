# Ideensammlung

Grundprinzip:
- Einstellbare Spielezahl
- Reihum Ist jeder dran
- Einstellbare Rundenzahl
- Punkte
- Andere Leute dürfen auch Antworten wenn falsch
    - Punkte sinken aber mit jedem Mal
- Am Ende jeder Runde ein Duellspiel

Fancy Schamcy:
- Normale Kategorien können auch besondere Spiele sein
    - Bei Geografie, Kultur quasi ein Pin It Spiel
    - Bei Kultur einen Videoclip oder eine Soundspur und daraus muss man raten was das ist
        - Intro von Serien raten
    - Mathematik als Kategorie
        - In den Einstellung, pre game Schulniveau einstellen über Slider
    - 
    

Kategorien:
- Unterhaltung
    - Video Clips
    - Soundtracks
    - Populäre Charaktere / Märchen erraten (Emoji basiertes Raten)
- Geografie
    - Pin It
    - Land -> Farben der Flagge
    - Flagge -> Länderformen multiple choice
- Geschichte
    - Duell-Spiel: Auf Zeitstrahl ein Even markieren und wer näher dran ist
    - Bilder 
    - Emoji Raten -> Wichtiges Ereignis
- Mathe
    - Aufgabe Lösung (Multiple Choice)
- Deutsch / Literatur
    - Diktat -> schweres Wort vorlesen und man muss es richtig schreiben
- Fremdsprachenraten
    - Erraten von Wörtern nach mehrmaligem Google Übersetzer
- (Kunst aka Musik)
- Wissenschaft und Technik
    - Dumme Gadgets erraten (Multiple choice)
- Natur / Biologie
    - Tiere/Pflanzen erraten
    - Duell Spiel: Verpixeltes / verzerrtes Bild erraten
  
---

## Version 1

- Grundprinzip
- Standard Multiple Choice Fragen
- Duell Spiel: Schätzduell
- Punktesystem

## Design

- Frage -> Daten / Speicherlösung: 1 JSON pro Frage die man in einen Ordner packt und das Spiel 
  durchsucht und erkennt automatisch neue Fragen
- Die Einstellungen und SPieler in einer globalen Variable
- 