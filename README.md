# English Vocabulary Learner

English Vocabulary Learner is an Android app built in Android Studio using Java. It helps users improve their English vocabulary through category-based word lists, multiple-choice quizzes, pronunciation support, and progress tracking. This project is designed as an offline learning app for students and beginners who want a simple and clean way to practice English words every day.

## Features

- Splash screen for app launch
- Login and signup interface
- Home screen with category selection
- Vocabulary lists for categories such as Animals, Food, and Colors
- Multiple-choice quiz for practice
- Score screen with quiz result
- Profile and progress screen
- Audio pronunciation using TextToSpeech
- Offline local data for words and questions

## Built With

- Java
- Android Studio
- XML Layouts
- Android SDK
- RecyclerView
- SharedPreferences
- TextToSpeech
- Gradle (Groovy)

## Project Structure

```text
app/
└── src/
    └── main/
        ├── java/com/example/mon_app_2026/
        │   ├── activities/
        │   │   ├── MainActivity.java
        │   │   ├── loginPage.java
        │   │   ├── Signup_page.java
        │   │   ├── Home.java
        │   │   ├── VocabularyActivity.java
        │   │   ├── QuizActivity.java
        │   │   ├── ScoreActivity.java
        │   │   └── ProfileActivity.java
        │   ├── adapters/
        │   │   └── WordAdapter.java
        │   ├── data/
        │   │   └── DataProvider.java
        │   ├── models/
        │   │   ├── Word.java
        │   │   └── Question.java
        │   └── utils/
        │       └── PreferenceManager.java
        └── res/
            ├── layout/
            ├── drawable/
            └── values/
```

## How It Works

The app starts with a splash screen and then opens the login page. After login or signup, the user enters the home screen, selects a vocabulary category, and can either open the vocabulary list or start a quiz. The vocabulary screen displays words using RecyclerView, while the quiz screen checks answers and calculates the final score. The profile screen shows simple progress data such as learned words, best score, and learning streak.

## Installation

1. Open Android Studio.
2. Clone or download this repository.
3. Open the project folder in Android Studio.
4. Let Gradle sync all dependencies.
5. Connect an Android device or start an emulator.
6. Click **Run** to build and launch the app.

## Gradle Dependencies

Make sure your app-level `build.gradle` includes dependencies like these:

```gradle
implementation 'androidx.appcompat:appcompat:1.6.1'
implementation 'com.google.android.material:material:1.8.0'
implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
implementation 'androidx.recyclerview:recyclerview:1.3.2'
implementation 'androidx.cardview:cardview:1.0.0'
```

Also use Java 1.8 compile options:

```gradle
compileOptions {
    sourceCompatibility JavaVersion.VERSION_1_8
    targetCompatibility JavaVersion.VERSION_1_8
}
```

## Screens

- Splash Screen
- Login Screen
- Signup Screen
- Home Screen
- Vocabulary Screen
- Quiz Screen
- Score Screen
- Profile Screen

## Future Improvements

- Add more vocabulary categories
- Save full quiz history with Room database
- Add favorites/bookmarks for words
- Add dark mode
- Add user authentication with Firebase
- Add speech recognition for pronunciation practice

## Purpose of the Project

This project was created as an Android learning project and educational application to practice Java, Activities, Intents, RecyclerView, quiz logic, XML design, and local data handling in Android Studio.

## Author

Your Name

## License

This project is for educational use and personal learning.
