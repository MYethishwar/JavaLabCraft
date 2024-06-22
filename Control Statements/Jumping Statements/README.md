## Jumping Statements in Java

Jumping statements in Java control the flow of execution by allowing you to jump to different parts of your code. The primary jumping statements are `break`, `continue`, and `return`.

### `break` Statement

The `break` statement is used to exit a loop or switch statement prematurely. When a `break` statement is encountered, the control flow jumps out of the current loop or switch block.

**Example:**

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // exit the loop when i is 5
    }
    System.out.println(i);
}
// Output: 1 2 3 4
```

### `continue` Statement

The `continue` statement is used to skip the current iteration of a loop and proceed with the next iteration. When a `continue` statement is encountered, the remaining code inside the loop is skipped for the current iteration.

**Example:**

```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // skip the rest of the loop body for even numbers
    }
    System.out.println(i);
}
// Output: 1 3 5 7 9
```
