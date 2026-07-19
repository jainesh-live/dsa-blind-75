# dsa-blind-75

This repository contains Java solutions for the popular "Blind 75" data-structures & algorithms (DSA) problem list. The goal is to provide clean, well-documented, and idiomatic Java implementations for most of the 75 problems so others (and my future self) can study, run, and learn from them.

## Repository structure

Recommended structure (actual folders/files may vary):

- java/                       - All Java solutions, one file per problem
  - 01_TwoSum.java
  - 02_AddTwoNumbers.java
  - ...
- README.md                   - This file

Each Java file contains a single public class (named after the file) and a `main` method or unit-test-friendly methods for quick testing.

## Naming & style conventions

- Filenames: <problem-number>_<ProblemName>.java (e.g., `01_TwoSum.java`). If there's a LeetCode ID or other canonical identifier you prefer, include it in the filename.
- Class names: PascalCase matching the file name (e.g., `public class TwoSum { ... }`).
- Methods: Keep helper methods private when appropriate and document time/space complexity in comments.
- Comments: Brief explanation of the approach, complexity analysis, and any edge cases considered.

## How to compile & run

Simple compile & run for a single file with a main method:

javac java/01_TwoSum.java
java -cp java TwoSum

If you group files into packages, compile with -d and run with the fully-qualified class name. Or import this project into an IDE (IntelliJ IDEA, Eclipse) and run directly.

## Testing

- For quick manual tests, add a `main` method showing sample inputs and printing outputs.
- For more formal testing, consider adding JUnit tests under `src/test/java` and using Maven or Gradle to run them.

## Problem coverage

This repo aims to include solutions for the majority of the Blind 75 problems. If a problem is missing, it may be added later or purposely omitted if it duplicates another problem's technique.

## Contribution

Contributions are welcome! If you'd like to add or improve solutions:

1. Fork the repository.
2. Add your Java solution following the naming/style conventions.
3. Include explanation and complexity analysis in comments or a short markdown file.
4. Open a pull request with a clear description of changes.

Please ensure code is readable and well-commented.

## License

This repository is provided under the MIT License — see LICENSE file (or add one) for details.

## Contact

If you have questions or suggestions, open an issue or a pull request.

Happy coding! 🚀
