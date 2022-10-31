# Sagetap Backend Coding Challenge
This is the technical portion of the Sagetap interview process for backend candidates. It should take anywhere from 30 to 60 minutes to complete.

You will be doing a live coding session with a senior developer from Sagetap. The expectation is not that you display an absolute mastery of any
particular language or that you perfectly execute on every question. Instead, this is meant to be more of a conversation with code-oriented prompts.
The intent is to see how you think, problem solve, and communicate, and to check your understanding of general engineering concepts and best practices.

Please see the prompts below, which your Sagetap partner will walk through and discuss with you.

## Prompt #1: ShoppingCart Code Fixes
Within this repository you will find a Kotlin project containing next relevant files and folders:
1. `src/main/*`, which contains an implementation for the classes `ShoppingCartKotlin` and `ShoppingCartManagerKotlin`.
2. `src/test/kotlin/ShoppingCartKotlinTest`, which contains tests for the aforementioned classes.

Within `ShoppingCartKotlinTest` you will find three further prompts. Please walk through those and edit/extend the code as you see fit and/or discuss your
thought process with your interviewer.

## Prompt #2: Technical Questions
Walk through the following two Kotlin coding exercises with your interviewer and talk through their solutions.

1. What will happen as a result of the output of this code?

```kotlin
fun main() {
    val list = mutableListOf<Int>()

    list.add(10)
    list.add(15)
    list.add(20)

    val query = list.filter { it == 10 }.filter { it < 20 }

    val result = query.toList()

    list.clear()

    println(result.count())
}
```

2. What will be the result of code execution?

```kotlin
private var result: String? = null

fun main() {
    saySomething()
    println(result)
}

suspend fun saySomething(): String {
    delay(5)

    result = "Hello world!";

    return "Something"
}
```

## Prompt #3: SQL
Given a table: `Employee`

| Name | Type | Index |
| --- | --- | --- |
| ID | number | PK |
| DEPARTMENT_ID | number |  |
| CHIEF_ID | number | FK (Employee table) |
| NAME | varchar(100) |  |
| SALARY | number |  |

- Display a list of employees who receive a salary greater than that of the immediate supervisor.
- Display a list of employees earning the highest salary in their department.
- Display a list of department IDs, the number of employees in which does not exceed 3 people.
