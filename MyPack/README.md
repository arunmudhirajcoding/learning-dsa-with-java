# 🧩 Rules You Must Know

1. The package statement must be the first line in your Java file.

2. A class inside a package must be inside a matching folder.

3. To use classes of another package → use import or fully-qualified names.

4. Same package → no import needed.

5. Only one package declaration allowed per file.

### Rule-1: Access Modifiers Decide Whether Inheritance Works Across Packages

| Modifier | Same Package | Different Package | Different Package (Subclass) |
| --- | --- | --- | --- |
| public | ✔ accessible | ✔ accessible | ✔ accessible |
| protected | ✔ accessible | ✖ not directly | ✔ accessible via inheritance |
| default | ✔ accessible | ✖ not accessible | ✖ not accessible |
| private | ✖ | ✖ | ✖ |
