## Project Overview

This repository contains a collection of Java practice programs and utilities. The goal of this change is to provide a minimal, consistent project layout and simple instructions to build and run the code.

## Recommended Folder Structure

- `src/main/java/` — primary Java source files (move your .java files here)
- `src/test/java/` — test sources (optional)
- `lib/` — third-party JAR dependencies (optional)
- `bin/` — compiled class files (output)
- `scripts/` — helper scripts (build/run shortcuts)

Note: The workspace currently contains many `.java` files at the repository root and an existing `src/` folder. This script will move top-level `.java` files into `src/main/java/` (it will not alter files already inside `src/`).

## Quick Build & Run (raw javac/java)

1. Create the output folder if missing:

```powershell
mkdir -Force bin
```

2. Compile all `.java` files under `src` (example):

```powershell
javac -d bin $(Get-ChildItem -Path src -Recurse -Filter "*.java" | ForEach-Object FullName)
```

3. Run a main class (example):

```powershell
java -cp bin App
```

Replace `App` with the fully-qualified class name that contains `public static void main(String[] args)`.

## Suggested Next Steps

- I can move source files into `src/main/java/` for you (confirm first). 
- Add a lightweight Gradle or Maven build if you want standard build lifecycle and dependency management.
- Add simple `scripts/build.ps1` and `scripts/run.ps1` for convenience.

## Contacts & Notes

If you'd like, tell me whether you prefer a manual `javac` workflow or a Gradle/Maven project and I will: create folders, move files, and add build scripts accordingly.

