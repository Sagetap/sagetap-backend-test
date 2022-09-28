# Sagetap Backend Coding Challenge
This is the technical portion of the Sagetap interview process for backend candidates. It should take anywhere from 30 to 60 minutes to complete. 

You will be doing a live coding session with a senior developer from Sagetap. The expectation is not that you display an absolute mastery of any 
particular language or that you perfectly execute on every question. Instead, this is meant to be more of a conversation with code-oriented prompts. 
The intent is to see how you think, problem solve, and communicate, and to check your understanding of general engineering concepts and best practices.

Please see the prompts below, which your Sagetap partner will walk through and discuss with you.

## Prompt #1: ShoppingCart Code Fixes
Within this repository you will find a Kotlin project containing two relevant files:
1. `src/main/kotlin/Main`, which contains an implementation for the classes `ShoppingCart` and `ShoppingCartManager`.
2. `src/test/kotlin/ShoppingCartTest`, which contains tests for the aforementioned classes.

Within `ShoppingCartTest` you will find three further prompts. Please walk through those and edit/extend the code as you see fit and/or discuss your 
thought process with your interviewer.

## Prompt #2: Technical Questions
Walk through the following two C# coding exercises with your interviewer and talk through their solutions.

1. What will happen as a result of the output of this code?

```c#
class Program
{
	static void Main()
	{
		var list=new List<int>();
		var query=list.Where(x=>x==10).Where(x=>x<20);
		list.Add(10);
		list.Add(15);
		list.Add(20);
		
		var result=query.ToList();
		list.Clear();
		Console.WriteLine(result.Count);
	}
}
```

2. What will be the result of code execution?

```c#
class Program
{
    private static string result;
    static void Main()
    {
        SaySomething();
        Console.WriteLine(result);
    }
    static async Task<string> SaySomething()
    {
        await Task.Delay(5);
        result = "Hello world!";
        return "Something";
    }
}
```

## Prompt #3: SQL
Given a table: `Employee`
| ID | number | PK |
| --- | --- | --- |
| DEPARTMENT_ID | number |  |
| CHIEF_ID | number | FK (Employee table) |
| NAME | varchar(100) |  |
| SALARY | number |  |

- Display a list of employees who receive a salary greater than that of the immediate supervisor.
- Display a list of employees earning the highest salary in their department.
- Display a list of department IDs, the number of employees in which does not exceed 3 people.
