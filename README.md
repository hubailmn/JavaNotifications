# AdvancedProgramming

Small Java examples demonstrating core object-oriented and functional concepts, kept as course exercises.

## Features

- `Notification` base class with `send()`.
- `EmailNotification` and `SecureEmailNotification` inheritance examples.
- `MessageFormatter` as a functional interface.
- Anonymous inner class usage in `AnonymousClassTest`.
- `TestNotification` runs all notification variants and prints their output.

## Requirements

- Java 22
- Maven

## Build & Run

```bash
mvn clean package
```

The classes are plain console programs with `main` methods. Run them directly from an IDE or with `java`, for example:

```bash
java -cp target/classes TestNotification
java -cp target/classes AnonymousClassTest
```

## Project structure

- `src/main/java/` — all example classes (default package).

## Notes

These are short teaching examples rather than a single application.
