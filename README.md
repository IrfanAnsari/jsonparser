# A Tiny JSON Parser example


### Example 1

```json
object = {
          “x”:{
              “y”:{
                 “z”:”a”
                  }
                }
           }
key = x/y/z
value = a
```

### Example 2 - Invalid JSON 

```json
object = { 
            “x”:{ 
                “y”:{ 
                   “z”:”a”
                }
            }
         // Missing braces
key = x/y/z
expectation => an Exception is Thrown (In more scala way should have return Try or an Option)
```

### Prerequisite 
```
sbt 1.3.12
JDK 1.8+
Scala version "2.13.2"

```

