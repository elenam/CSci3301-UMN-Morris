Java Reflection Factory Example
======
Based on [https://github.com/MannyPeterson/ReflectionFactory](https://github.com/MannyPeterson/ReflectionFactory) It's been modified in Feb 2024 by Elena Machkasova for the UMN Morris CSci 3301 to be used as an example use of reflection in Factory design pattern. 

It's been simplified to using the default package (not a great practice, but this avoids file permission issues) and modified a bit by adding comments and emphasizing the dynamic use of reflection. 

Many thanks to the original author Manny Peterson! 


## Java Reflection Factory Example (original description)

The **Java Reflection Factory Example** is an example of how reflection may be used in a factory to allow applications to be extended (think add-ons, plug-ins and user contributed content in games) without the need to update core application source code as required by many factory design patterns. Currently scanning JAR files is unsupported. Also, the class scanner does not scan below the packageName - this is intentional and the behavior of the class scanner can be easily adapted to recurse the directories.

## License 
* see [LICENSE](https://github.com/MannyPeterson/ReflectionFactory/blob/master/LICENSE.md) file
