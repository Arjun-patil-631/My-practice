/*by the below codes we can understand the use of public class in java
and also how the jvm needs public and file name to be same 
*without public it consider it as a normal class
*every class should have only 1 public class or else the jvm cant decide what to execute
*jvm gives one .class file for evry class
*/

/*also understood the errors if we keep the class name and file name different
if we keep the class name and file name different then it will give an error
error: class demo is public, should be declared in a file named demo.java
*/

public class New{
    public static void main(String[] args){
        System.out.println("Hello, world!!!");
    }
}

//try all cases u want to understand the use of public class and file name and class name should be same or not