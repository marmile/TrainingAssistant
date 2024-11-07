# TrainingAssistant

TrainingAssistant is a mobile app for Android that helps users manage their workout plans. The app allows users to create training blocks, add exercises, configure breaks and reminders, and provides a detailed view of each training block.

## Features

- **Training Block Creation**: Ability to create blocks assigned to specific days with configurable duration and exercises.
- **Exercises**: Add exercises to a block, with settings for repetitions, description, time allocation, and optional images.
- **Timer**: Automatic countdown for exercise and break times.
- **Reminders**: Notifications for upcoming workouts and rest periods.
- **Workout History**: Storage of completed workouts (planned for future versions).

## Technologies

The app is written in Kotlin and targets Android 12. It utilizes:
- **Kotlin**: Programming language.
- **Android SDK**: Android tools and libraries.
- **Git**: Version control.
- **GitHub**: Project repository.

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/marmile/TrainingAssistant.git
   ```
2. Open the project in Android Studio.
3. Build and run the project on an Android 12 device or emulator.

## Project Structure
* app/src/main/java/com/example/trainingassistant/
    * models: Data models like TrainingBlock and Exercise.
    * ui: Activities, such as MainActivity and TrainingBlockActivity.
    * utils: Helper tools like TrainingTimer.

## Usage
Upon opening the app, users can:

1. Create new training blocks assigned to specific days.
2. Add exercises to blocks with configurable time and repetitions.
3. Set rest periods between exercises, which the app will automatically countdown.
4. Receive notifications for upcoming workouts.

## Contribution
We welcome contributions. To contribute:

1. Fork the repository.
2. Create a branch for your feature (git checkout -b feature/YourFeature).
3. Make your changes and commit them (git commit -m "Add new feature").
4. Push your changes (git push origin feature/YourFeature).
5. Open a Pull Request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

[English version](README.md)