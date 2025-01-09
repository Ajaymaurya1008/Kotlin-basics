# Kotlin Basics

## Types of classes

1. Regular Classes:
The most basic type of class.
Declared using the class keyword. Can have properties, functions, constructors, and inheritance.
```
class Person(val name: String, var age: Int) {
    fun greet() = println("Hello, my name is $name.")
}
```

2. Data Classes:
Designed for storing data. Automatically generate equals(), hashCode(), toString(), and copy() methods.
Declared using the data class keyword
```
data class User(val id: Int, val name: String)
```

3. Sealed Classes:
Represent a restricted class hierarchy. Useful for defining a set of possible types.
Declared using the sealed class keyword.
```
sealed class Result {
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
}
```

5. Abstract Classes:
Cannot be instantiated directly. Used as a base for other classes to inherit from.
Declared using the abstract class keyword.
```
abstract class Shape {
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double = Math.PI * radius * radius
}
```
5. Enum Classes: Represent a set of named constants and Declared using the enum class keyword.
```
enum class Color {
    RED, GREEN, BLUE
}
```

6. Inner Classes:
Defined inside another class.
Have access to the members of the outer class.
```
class Outer {
    val x = 10

    inner class Inner {
        fun printX() = println(x)
    }
}
```

7. Nested Classes:
Defined inside another class, but without access to the outer class's members.
Declared using the inner keyword.

```
class Outer {
    class Nested {
        fun printMessage() = println("Hello from Nested class")
    }
}
```

8. Object Classes: Create a singleton instance of a class and Declared using the object keyword.

```
object Logger {
    fun log(message: String) = println("Log: $message")
}
```

9. Companion Objects: Hold class-level properties and functions and Similar to static members in Java.
```
class MyClass {
    companion object {
        const val PI = 3.14159
        fun createInstance() = MyClass()
    }
}
```
