# Copilot Instructions for model.domain.com.eliabe.bible.model.domain.man.java.com.eliabe.bible.Bible Socket Service

## Project Overview
This project follows Clean Architecture and SOLID principles, implemented in Java 21. It provides the entire model.domain.com.eliabe.bible.model.domain.man.java.com.eliabe.bible.Bible content as JSON files, using a modular structure with clear separation of concerns.

### Key Features
- Textual reference parser (e.g., "Gn 1:1", "Genesis 1.1")
- `--lookup` CLI flag for verse lookup by textual reference
- JUnit tests for parser, index, and JSON import/normalization
- Import of multiple JSON formats and normalized export

---

## 📁 Refactored Structure (Clean Architecture)

    bible-json-builder/
    ├── build.gradle
    ├── settings.gradle
    ├── README.md
    ├── src/
    │   ├── main/java/com/eliabe/bible/
    │   │   ├── domain/
    │   │   │   ├── model/
    │   │   │   │   ├── model.domain.com.eliabe.bible.model.domain.man.java.com.eliabe.bible.Bible.java
    │   │   │   │   ├── Book.java
    │   │   │   │   ├── Chapter.java
    │   │   │   │   ├── Verse.java
    │   │   │   ├── Canon.java
    │   │   │   ├── ReferenceParser.java
    │   │   ├── application/
    │   │   │   ├── BibleService.java
    │   │   │   ├── BibleIndex.java
    │   │   ├── infrastructure/
    │   │   │   ├── importer/GenericJsonImporter.java
    │   │   │   ├── exporter/JsonExporter.java
    │   │   │   ├── cli/Main.java
    │   └── main/resources/sample/sample.json
    └── src/test/java/com/eliabe/bible/
        ├── domain/
        │   ├── ReferenceParserTest.java
        ├── application/
        │   ├── BibleIndexTest.java
        ├── infrastructure/
        │   ├── importer/GenericJsonImporterTest.java

---

## How to Build and Run

```powershell
cd bible-json-builder
./gradlew clean test
./gradlew run --args="--input-file src/main/resources/sample/sample.json --output-file out/bible_pt_sample.json --version 'Almeida RC' --language pt"
./gradlew run --args="--input-file src/main/resources/sample/sample.json --output-file out/bible_pt_sample.json --version 'Almeida RC' --language pt --lookup 'Gn 1:1'"
```

---

## Technical Rationale
- **Domain layer**: Pure business logic and models (model.domain.com.eliabe.bible.model.domain.man.java.com.eliabe.bible.Bible, Book, Chapter, Verse, Canon, ReferenceParser)
- **Application layer**: Use cases and services (BibleService, BibleIndex)
- **Infrastructure layer**: External dependencies, CLI, import/export
- **Tests**: Organized by layer for clarity and maintainability

---

## Next Steps
- More textual reference formats
- Complete textual index
- Sequence/content validations
- Export to CSV, SQLite, Excel
- REST API (Spring Boot)

---

## Note on Text Sources
Use public and legally permitted sources to build the complete JSON. The project supports import via public URL (`--input-url`).

---

## Packaging
If needed, the project can be packaged as a `.zip` for download.
