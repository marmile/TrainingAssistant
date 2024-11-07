# TrainingAssistant

TrainingAssistant to aplikacja mobilna na system Android, która wspiera użytkowników w zarządzaniu planami treningowymi. Aplikacja pozwala tworzyć bloki treningowe, dodawać ćwiczenia, konfigurować przerwy oraz przypomnienia, a także zapewnia szczegółowy podgląd każdego bloku treningowego.

## Funkcjonalności

- **Tworzenie bloków treningowych**: Możliwość tworzenia bloków przypisanych do wybranych dni z konfiguracją czasu trwania i ćwiczeń.
- **Ćwiczenia**: Dodawanie ćwiczeń do bloku, z ustawieniami liczby powtórzeń, opisu, czasu na wykonanie oraz opcjonalnymi zdjęciami.
- **Timer**: Automatyczne odliczanie czasu ćwiczeń i przerw.
- **Przypomnienia**: Powiadomienia o nadchodzących treningach i przerwach między ćwiczeniami.
- **Historia treningów**: Przechowywanie historii ukończonych treningów (w przyszłości).

## Technologie

Aplikacja jest napisana w Kotlin i przeznaczona na Androida 12. Wykorzystuje:
- **Kotlin**: język programowania.
- **Android SDK**: narzędzia i biblioteki Androida.
- **Git**: wersjonowanie kodu.
- **GitHub**: zdalne repozytorium projektu.

## Instalacja

1. **Sklonuj repozytorium**:
   ```bash
   git clone https://github.com/marmile/TrainingAssistant.git
   ```

2. Otwórz projekt w Android Studio.
3. Zbuduj projekt i uruchom na emulatorze lub urządzeniu z systemem Android 12.

## Struktura projektu
* app/src/main/java/com/example/trainingassistant/
    * models: Modele danych, jak TrainingBlock i Exercise.
    * ui: Aktywności, np. MainActivity i TrainingBlockActivity.
    * utils: Narzędzia pomocnicze, np. TrainingTimer.

## Przykład Użycia
Po otwarciu aplikacji użytkownik może:

1. Tworzyć nowe bloki treningowe przypisane do dni tygodnia.
2. Dodawać do bloków ćwiczenia z konfiguracją czasu i powtórzeń.
3. Ustawiać przerwy między ćwiczeniami, które aplikacja będzie automatycznie odliczać.
4. Otrzymywać powiadomienia o nadchodzących treningach.

## Wkład
Chętnie przyjmujemy wszelkie propozycje usprawnień. Jeśli chcesz wnieść wkład:

1. Sforkuj repozytorium.
2. Utwórz gałąź dla swoich zmian (git checkout -b feature/TwojaFunkcjonalnosc).
3. Dokonaj zmian i wykonaj commit (git commit -m "Dodano nową funkcjonalność").
4. Wypchnij zmiany (git push origin feature/TwojaFunkcjonalnosc).
5. Utwórz Pull Request.

## Licencja
Projekt jest dostępny na licencji MIT. Więcej informacji znajdziesz w pliku [LICENSE](LICENSE).

[Polska wersja](README_PL.md)





