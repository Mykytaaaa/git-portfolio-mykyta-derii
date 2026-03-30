# Calculator

### Project description

The project implements a console-based calculator for integer operations. If you run the project, you will see the detailed usage instructions.

Running: mvn package, then run the jar

This Git repo demonstrates the use of feature branches, fast-forward merges, three-way merge, and conflict resolution.

I chose Maven because I already had some experience with it.

### Conflict Resolution

I have created two feature branches: mod-operation and extend-calculation-logic-to-multiplication-division.
In the first one, I added a new case to a switch-case statement in Calculator.Calculate, and in the second one I added another two cases.
Merging the branches to Main resulted in a conflict.

I opened a text editor and removed the "<<<<<<< HEAD", "=======", and ">>>>>>> features/mod-operation" marks, accepting both modifications and arranging the added cases one after another.
At the end, marked the conflict as resolved in Source Tree, and made a "merge" commit.