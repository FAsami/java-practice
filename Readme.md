### Printing something to the console in java
```java
public class Init {
    public static  void main(String[] args){
        System.out.println("Say Hello !");
    }
}
```


### Taking input with `Scanner` class 
```java
import java.util.*;
public class ScannerInput {
    public static void main(String[] args){
        String str  = new Scanner(System.in).next();
        String _str  = new Scanner(System.in).nextLine();
        System.out.println("Here is your word:  " + _str);
    }
}
```
- `next()` is used for taking a single word 
- `nextLine()` is used for taking a whole line


### Taking input using `BufferedReader` class
```java
import java.io.*;

public class BufferedReaderInput {
    public static void main(String[] args) throws  IOException{
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println("Here is what you have written "+str);
    }
}
```