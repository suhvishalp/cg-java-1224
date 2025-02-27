Decision Making statements  in java
----------------------------------------------

    int a = 10;
    int b = 30;


    if statement 

        if(boolean-expression){
            statements;
            statements;
        }


    if-else statement 

        if(boolean-expression){
            statements;
            statements;
        }else{
            statements;
            statements;
        }

    if-else if-else statement 

        if(boolean-expression1){
            statements;
            statements;
        }else if(boolean-expression2){
            statements;
            statements;
        }else if(boolean-expression3){
            //..
        }
        ..
        .
        .
        else {

        }

    switch case statement 

        switch(expression){

            case 'case-expression1':
                statements;
                statements;
                break;
            
             case 'case-expression2':
                statements;
                statements;
                break;

             case 'case-expression3':
                statements;
                statements;
                break;
                ..

                ..

            default:
                statement;
        }


        **IMP: 
            - the switch expression must evaluate to either byte, short, int, long, char or string
                - A switch works with the byte, short, char, and int primitive data types, enumerated types (Enum Types), String, Character, Byte, Short,  Integer 
            - the switch statement can have a number of possible execution paths

            - 'case-expressions': case expressions must be constant expressions

Array
------------------
    - arrays to store multiple values 
    - collection of elements 
    - arrays in java are "fixed size" group of elements 
    - in java, array is an object 


    - declare an array variable 

        <DATATYPE>[] arrayVariableName;

        int[] nums;     int [] nums;       int []nums;      int nums[];

        byte[] byteArray;

        String[] names; 

        Employee[] empArray;

    - create array 

        arrayVarName = new <DATATYPE>[size];

        nums = new int[5];

    - initialize values to an array 

        int[] nums = {10,20,30,40,50};
        int[] nums = new int[]{10,20,30,40,50};

        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;

    - Arrays class in java 
    ------------------------------
        - this is a utility class,  contains various methods for manipulating arrays (such as sorting and searching)

        - static int binarySearch(int[] a, int key)
            - Searches the specified array of ints for the specified value using the binary search algorithm.
            - returns -1 if the value not found

        - static void	sort(int[] a)
            - Sorts the specified array into ascending numerical order.   
        
        - static int[]	copyOf(int[] original, int newLength)
            Copies the specified array, truncating or padding with zeros (if necessary) so the copy has the specified length.

        - static int[]	copyOfRange(int[] original, int from, int to)
            - Copies the specified range of the specified array into a new array.

        - static boolean	equals(int[] a, int[] a2)
            - Returns true if the two specified arrays of ints are equal to one another.

        - static void	fill(int[] a, int val)
            - Assigns the specified int value to each element of the specified array of ints.

    Multi dimenensional arrays
    -------------------------------

        matrix / 2D array
        -----------------------

            int[] nums = new int[5]

            int[][] data = new int[2][];


            Declaration and initialize 2D array
            ------------------------------------------
                Declaration
                    <datatype>[][] arrayName;

                    int[][] data;

                Initialization 

                    int[][] data = {
                        {2020, 100},
                        {2021, 433},
                        {2022, 540},
                        {2024, 6534}
                    };

                int[][] data = new int[4][2];
                data[rowIndex][colIndex]
                data[0][0] = 2020;
                data[0][1] = 100;

                data[1][0] = 2021;
                data[1][1] = 433
                ///

    Static keyword
    ------------------------
        - static variables


        - static methods 


    final keyword
    ------------------------
        - final variables 
            - value cannot be changed once assigned
            - used to create constants 

                final int MAX = 100;


        - final methods 
            - a final method cannot be overridden in the subclass

        - final classes
            - a final class cannot be inherited



    String in java
    -----------------------

        String str = "welcome";

        String str = new String("welcome");

        **IMP: in java strings are immutable, their content cannot be changed once created 
            - The string pool is a special memory region in the heap where string literals are stored
            - only the strings created using literals are stored in the "string pool"
                - java uses the concept of "string pool" to ensure memory efficiency by reusing the objects 

        Common operations using String methods
        ----------------------  
            - char charAt(int index)
                    - Returns the char value at the specified index.
            
            - int compareTo(String anotherString)
                    - Compares two strings lexicographically.

            - String	concat(String str)
                - Concatenates the specified string to the end of this string.

            - boolean	equals(String anObject)
                - Compares this string to the specified String.

            - int	indexOf(int ch)
                - Returns the index within this string of the first occurrence of the specified character.

            - boolean	isEmpty()
                - Returns true if, and only if, length() is 0.

            - int	lastIndexOf(String str)
                - Returns the index within this string of the last occurrence of the specified substring.
           
            - int	lastIndexOf(String str, int fromIndex)
                    - Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index.
            
            - int	length()
                - Returns the length of this string.

            - boolean	matches(String regex)
                - Tells whether or not this string matches the given regular expression.

            - String	replace(char oldChar, char newChar)
                - Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.           

            - boolean	startsWith(String prefix)
                - Tests if this string starts with the specified prefix.

            - String	substring(int beginIndex)
                - Returns a string that is a substring of this string.

            - String	toLowerCase()
                - Converts all of the characters in this String to lower case using the rules of the default locale.

            - String	toUpperCase()
                - Converts all of the characters in this String to upper case using the rules of the default locale.

            - String	trim()
                -Returns a string whose value is this string, with any leading and trailing whitespace removed.



        **IMP:  compareTo() returns a "compare value" in int

                0       - both the objects are same

                >0      - first object is greater than the given object

                <0      - first object is less than the given object


    **IMP: Character class methods
    -------------------------------------
        - isDigit()
                

    Regular Expressions (Regex)
    ----------------------------
        - regex is powerful way to match and manipulate text/strings based on "patterns"

            *Syntax of Regex
            --------------------------

                Regex Patterns
                ------------------
                \d   OR [0-9]                      - matches a digit (0-9)
                \D   OR [^0-9]                     - matches a non-digit character
                \w   OR [a-zA-Z0-9_]               - matches a word character [a-z A-Z 0-9 _]
                \W                                 - matches a non-word character
                \s                                 - matches a whitespace character
                \S                                 - matches a non-whitespace character 
                [abc]                              - matches any one character between a, b and c
                [^abc]                             - matches any character except a, b and c
                [a-z]                              - matches any character between a to z
                ^                                  - matches the beginning of the string 
                $                                  - matches the end of the string
                \b                                 - word boundary indicates that a pattern is bounded by a     
                                                        non-word character, i.e. any character except a-z A-Z 0-9 _


                Quantifiers
                -----------------
                *                                   - matches 0 or more occurences
                +                                   - matches 1 or more occurences
                ?                                   - matches 0 or 1 occurence
                {n}                                 - matches exactly n occurences 
                {n,m}                               - matches between n and m occurecnes 
                {n,}                                - matches at least n occurences

                Excaping special characters 
                ----------------------------------
                    - use backslash (\\) to match a special character like . , * or ? 

                    \\.


                Java API for Regex
                ---------------------------

                    - Pattern class
                        - compiles a regex pattern into a 'Pattern' object 
                        - Pattern.compile(String regex)
                            
                    - Matcher class
                        - matches input strings againts a compiled 'Pattern"
                        - methods

                            find()          - finds the next subsequence matching the pattern
                            matches()       - checks if the entire input string matches the pattern
                            group()         - returns the matched substring 
                            start(), end()  - get the start and end indices of the match


        StringBuilder and StringBuffer
        -----------------------------------
            - these objects are used to create mutable strings 
            - StringBuffer is usually used in multi-threaded application, because it is synchronized 

            - insert()
            - append()
            - remove()
            - replace()

        StringTokenizer 
        --------------------
            -  is used to break a string into tokens


        Enums (Enumeration) in Java
        -----------------------------

                - a special data type that represents a collection of constants
                - ENUMS are used when you have a fixed set of related values that do not change
                    i.e. days of week, name of months, states or processes etc.


                    - fixed set of constants 
                    - type-safe 
                    - enums can have methods, fields and constructor 


                    public enum Day {
                        MONDAY,
                        TUESDAY,
                        WEDNESDAY,
                        THURSDAY,
                        FRIDAY,
                        SATURDAY,
                        SUNDAY
                    } 


            Dates in Java
            -------------------------

                java.util.Date class
                ----------------------------
                    - represents a date and time 

                        Date dt = new Date();       //represents the current date and time

                    - SimpleDateFormat class - used to format or parse a date


                Java Date time api
                -------------------
                java8: introduced a new package called java.time package, 
                    which offers a new Date time api

                    - LocalDate
                    - LocalTime
                    - LocalDateTime
                    - ZoneDateTime
                    - ...
                    - ..

    classes & Objects 
    ----------------------

        - Class
            - bluepint or template for creating objects
            - it defines properties(fields / data members / instance variables) and 
                behaviours (methods) that the objects of the class will have 

            - create a class 

                class <<ClassName>> {
                    
                    //fields/properties/instance variables / static variables
                    <<datatype>> varname;
                    ..
                    ..
                    ..

                    //instance methods

                    //static methods 

                    //abstract methods

                    //inner classes
                }

            - Object:
            ----------
                - an instance of a class, created using 'new' keyword 

                Employee emp  = new Employee();

        OOPS Concepts 
        ---------------

            - Encapsulation
                - wrapping data and logic into a single unit ('class')

            - Abstraction 
                - hiding the implementation details and showing only essential features of an objects

            - Inheritance 
                - allows onc class (subclass) to heriti the properties (feilds) and behaviours (methods) of another class (parent / super class)

            - Polymorphism 
                - 'many forms'
                - many forms of the same interface 
                - allows the methods to behave differently based on the object that calls them



        Terminologies
        ----------------------------
            BO - business objects 

            SO - service objects 

            DAO - data access objects 

            DTO - data transfer objects 

        **IMP: Inner classes / nested classes 



        - Constructors 
        ----------------------
            - a constructor a special method in class, that has same name as it's class, and no return type
            - it is used to initialize values to the data members
            - constuctor is called automatically whenever an object is created 

                - default constructor - no parameters, provided by java if no other constructor is defined 

                - no-arg constructor - no parameters

                - parameterized constructor  - accepts arguments to initialize the fields 


                - this() constructor
                    - used to invoke another constructor of the same class

        - Methods Overloading 
        ---------------------------
            - a class can have multiple methods with the same name but different parameters 
                - the method signature must differ in
                    - number of parameters OR
                    - type of parameteres Or
                    - order of parameters 
                - the decision to invoke the appropriate method is taken at compile time based
                     on the arguments supplied and the overloaded method definitions.
                        - this is called compile time polymorphism / static binding  


        - Inheritance 
        --------------------
            - allows one class to acquire / inherit properties/methods of another class 
            - a child class / sub class inherits from parent / super class 
            - the child classes uses  'extends' keyword to inherit from a parent class 
            **IMP: in java, a class can extend from only 1 class at a time

            - offers reusability, maintainability and extendibility  
            - creates IS-A relationship between parent and child classes 

            class Person {
               protected String firstName;
               protected String lastName;
               protected Date dob;

                //getter/setter
            }

            class Employee extends Person {                 class Customer extends Person {
                private int empId;
                private double salary;                              String street, city, phoneNumber;

                ..  
            }                                               }

            Emoployee IS-A Person
            Customer IS-A Person

            **IMP: 
                - a variable of type super class can reference to an instance of child class 
                - by default, the child class construcrtor invokes the no-arg constructor of super class


                Person person = new Employee();

                Employee emp = new Employee();


                    Product 
                        |
                        |-represent a product with name and price
                        |
                    Electronics
                        |
                        |- extends Product class and adds specific features for electronic items i.e. warranty
                        |
                    SmartPhone
                        |
                        |-extends Electronics class and adds specific features for smartphones
                        |-storage, operatingSystem etc.





        - Abstract classes 
            - an abstract class acts just as a superclass, representing all the common charactersticks 
            - we cannot create object of abstract class

            - when you want to provide a common base class /parent class for a group of child classes, and you dont want to instantiate the base class you can use abstract class, 
                - it provides features like code reusability, extensibility and polymorphism

                abstract class Person {

                    //fields / datamembers 

                    //constructors

                    //methods
                }

        - Abstract Methods 
            - method marked with 'abstract' keyword and without body/definition is called abstract method 
            - an abstract method must be overriden by it's immediate subclass 

                    public abstract void show();


        - Method Overriding     
            - re-defining a superclass method in the subclass
            - overriding is used to have child-specific implementation of the super class method
            - rules for method overriding 

                    1. the overridden method signature should be same as superclass  



        - Polymorphism
        ------------------------
            - a variable can reference to different types at different time, and based on the type of object 
                it is referencing the appropriate methods are invoked
            - allows to implement many forms of the same interface

            - Polymorphism means ‘many forms’.  In OOP, polymorphism means a type can point to different objects    at different times. In other words, the actual object to which a reference type refers, can be determined at runtime. In Java, polymorphism is based on inheritance and overriding.  


            - Rule #1: Only inherited methods can be overridden. 
                Inheritable methods are declared with the following access modifiers: public, protected and default (in the same package). That means private and default methods (in different package) cannot be overridden.’ 


            - Rule #2: Final and static methods cannot be overridden. 
            
            - Rule #3: The overriding method must have same argument list as the overridden method. 

            - Rule #4: The overriding method must have same return type (or sub type). 
                     In case of the overriding method’s return type is a sub type of the overridden method’s return type, it is called co-variant return type. 
           
           
                    class A {
                        public Person show(){

                        }
                    }

                    class B extends A {
                        public Employee show(){

                        }
                    }

            - Rule #5: The overriding method must not have more restrictive access modifier.  
                For example: if the overridden method is public, you cannot make the overriding method protected, private or default. 
            
                    public class A {

                        public void show(){

                        }
                    }

                    public class B extends A {

                        public void show(){

                        }
                    }

            - Rule #6: The overriding method must not throw new or broader exceptions. 
                In other words, the overriding method may throw fewer or narrower checked exceptions, or any unchecked exceptions. 

            - Rule #7: Use the super keyword to invoke the overridden method from a sub class. 

            - Rule #8: Constructors cannot be overridden.

            - Rule #9: Abstract methods must be overridden by the first concrete (non-abstract) sub class. 

            - Rule #10: A static method in a sub class may hide another static one in a super class, and that’s  called method hiding. 
            
            - Rule #11: The synchronized modifier has no effect on the rules of overriding. 
                The synchronized modifier relates to the acquiring and releasing of a monitor object in multi-threaded context, therefore it has totally no effect on the rules of overriding. That means a synchronized method can override a nonsynchronized one and vice versa. 
            
            -Rule #12: The strictfp modifier has no effect on the rules of overriding. 
                That means the presence or absence of the strictfp modifier has absolutely no effect on the rules of overriding: it’s possible that a FP-strict method can override a non-FP-strict one and vice-versa. 



        - Interfaces
        -------------------
            - similar to class 
            - interface in java is a reference type
            - it is considered as a blueprint for a class that defines a contract or set of rules for a class
            - an interface define set of requirements a class has to implement
            - interface specifies what a class must do

            - interface contains only public abstract methods and public final variables (constants)
                **IMP: Java8 introduced concept of
                    - concrete 'default' and 'static' methods in interfaces
                    - functional interfaces

            - a class can implement an interface using 'implements' keyword and must override all the abstract methods
            - **IMP: a class can implement several interfaces at a time
           

                interface A {
                    public abstract void methodA();
                }

                interface X {
                    public abstract void methodX();
                }

                class B implements A, X {

                    public void methodA(){
                        //override the methodA
                    }
                    public void methodX(){
                        //override the methodX
                    }
                }

                -  **IMP: an interface can extend from several interfaces 

                        interface A {
                            //
                            //
                        }

                        interface B {
                            //
                            //
                        }

                        interface C extends B, A{

                        }

                        interface X extends A, B {
                            //inherits all the methods of interface A
                            //inherits all the methods of interface B
                        }

                -  **IMP: a variable of type interface can reference to an object of it's implementation class 

                    interface TalentedStudent {
                        public abstract void sing();
                    }

                    class Student implements TalentedStudent{

                        public void sing(){
                            //...
                            //...
                        }
                    }

                    Student sayali  = new Student();
                    TalentedStudent sayali = new Student();



                                abstract class Car {

                                    //brand, type, model, etc.

                                    public abstract void move();
                                }

                                class TataCar extends Car {

                                    @Override
                                    public void move(){
                                        //sysout("this car moves normally");
                                    }
                                }

                                class BMWCar extends Car{

                                    @Override
                                    public void move(){
                                        //sysout("this car moves smothly on rough off-roads");
                                    }
                                }

                                class MercedesCar extends Car{

                                    @Override
                                    public void move(){
                                        //sysout("this car moves smooth and safe on rough off-roads");
                                    }
                                }


                                Car car = null;
                                
                                car = new TataCar();
                                car.move(); //

                                car = new MercedesCar();
                                car.move();





                                        Shape
                                        |
                                        |-abstract calcArea();
                                        |
                                ---------------------
                                Rectangle           Circle



            - Difference between interface and abstract classes
            ------------------------------------------------------------
                        Interface                                       Abstract classes
                        can have only abstract, default or              can have abstract and concrete methods
                        static methods

                        supports multiple inheritance                   doesn't support multiple inheritance
                        interface A extends B, C

                        all fields are public static or final           fields can have any modifer

                        used to define set of requirements              used to define common base class for 
                        that a class has to implement                       multiple child classes

            
            - Object class in java 
            -----------------
                    - Object class is implicitely the supermost class in java, it is the root class of the java class hierarchy 

                                Object 
                                  |
                                  |
        -------------------------------------------------------------------------------------------------
        System              Scanner             Integer         String          Employee        Product


        - methods of the object class 
        -------------------------------------
            - boolean equals(Object obj)
            - String toString()
            - int hashCode()

            - Object clone()
            - void finalize()

            - final void wait()
            - final void notify()
            - final void notifyAll()
            - final Object getClass()


            class Employee{                                     class Product {

                    -we can override object class's methods 
                        - boolean equals(Object obj)
                        - String toString()
                        - int hashCode()

            }                                                    }


            - String toString()
                - returns a string representation of the object
                - by default, it returns the class name followed by the @ symbol and the object's 
                        hashcode in hexadecimal
                - we can override the Object class's toString() method in any custom class i.e. Employee, Product etc. to return a string representation of the object's state

            - boolean equals(Object obj)
                - compares two objects for equality
                - the default implementation checks if two references point to the same memory location
                - **IMP: we can override the Object class's equals() method to compare two objects

                - **IMP: the equals() contract 
                ---------------------------------
                    - The equals() contract in Java is a set of rules that the equals method must follow: 
                        - Reflexive: For any non-null reference value x, x.equals(x) must return true
                        
                        - Symmetric: For any non-null reference values x and y, x.equals(y) must return true if and only if y.equals(x) returns true
                        
                        - Transitive: For any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) must return true
                        
                        -Consistent: For any non-null reference values x and y, multiple invocations of x.equals(y) should consistently return the same result
                        
                        - Null handling: For any non-null reference value x, x.equals(null) should return false


            - Association, Composition and Aggregation
            -------------------------------------------------
                - the concept is used to represent relationship between classes 


                - Association - a relationship between classes, this represents a generic relationship

                    class Customer {                            class Address {
                                                                    String city;
                        Address[] addresses;                            String pinCode;
                                                                    String country;
                                                                    //
                                                                    //

                    }                                           }

                    class Supplier {

                        Address address;
                    }

                - Composition
                --------------------------  
                    - is a stronger relationship (stronger form of association) between classes, 
                        - where, one object owns other object/s
                        - the dependent object cannot exists without the owner

                        class Car {                     class Engine {

                            Engine engine;                  //..
                                                            .
                                                            .

                        }                               }

                        Car car = new Car();

                - Aggregation 
                -------------------------
                    - is a weak relationship, form of association where one object contains another object,
                        - but, both objects may exist independently 


                        class Employee {                                    class Project{

                                Project project;

                        }                                                   }


                Example:
                --------------------

                import java.util.ArrayList;
                import java.util.List;

                class University {

                    Department[] departments = new Department[10];
                    
                    void addDepartment(Department department) {
                        //code to add the given dept inthe departments array
                    }
                }

                class Department {
                    String name;
                    Professor[] professors = new Professor[10];
                    
                    Department(String name) {
                        this.name = name;
                    }
                    
                    void addProfessor(Professor professor) {
                        //logic to add the give prof in the professors array
                    }
                }

                class Professor {
                    String name;
                    
                    Professor(String name) {
                        this.name = name;
                    }
                }

                public class CombinedExample {
                    public static void main(String[] args) {
                        University university = new University();
                        
                        Department csDept = new Department("Computer Science");
                        Department eeDept = new Department("Electrical Engineering");
                        
                        Professor prof1 = new Professor("Dr. Smith");
                        Professor prof2 = new Professor("Dr. Johnson");
                        
                        csDept.addProfessor(prof1);
                        eeDept.addProfessor(prof2);
                        
                        university.addDepartment(csDept);
                        university.addDepartment(eeDept);
                        
                        System.out.println("Departments in the university:");
                        for (Department dept : university.departments) {
                            System.out.println(dept.name);
                            for (Professor prof : dept.professors) {
                                System.out.println("  Professor: " + prof.name);
                            }
                        }
                    }
                }
































            - Wrapper classes in java
            ----------------------------
                - for each primitive type i.e. int, short, byte etc. there is a corresponding reference type (class)
                    available which is called 'Wrapper' clas
                - wrapper classes are used to covert primitive data types (int, double) into objects
                - they are used to treat the primitive types as objects when required

                - wrapper classes are used
                    - privitive types cannot be used and only objects are required such as Collections i.e.ArrayList, LinkedList, HashSet etc.
                    - wrapper classes provide useful utility methods for operations like parsing and converting values

                            Integer.parseInt
                            Double.parseDouble

                - Autoboxing and unboxing - automatic conversion between primitives and their corresponding wrapper classes

                Pritive Data types                  Wrapper classes

                    byte                            Byte
                    short                           Short
                    int                             Integer
                    long                            Long
                    float                           Float
                    double                          Double
                    char                            Character
                    boolean                         Boolean


            **IMP: In Java, Arrays are objects and they are used to store group of elements/values
                    - Array of Strings, Array of Employees, Array of Products, etc.
                    - problems with array
                        - fixed size, doesn't have any built in algorighm



            - Java Collection Framework
            ------------------------------
                - java.util package provides a set of classes and interfaces to store and manipulate groups of  
                    objects and perform some operations in specific manner.
                - **IMP: We can create "dynamic collection of objects" and perform some operations 
                    in specific manner using the classes provided in collection
                    framework
                --**IMP: each collection class i.e ArrayList, HashSet, TreeSet, HashMap etc. uses a specific data structure 
                        internally

                - they are designed to make data handling efficient and flexible

                - Features:
                    - dynamic size: unlike arrays, collections can grow and shrink automatically
                    - built-in-algorithms: include methods for sorting, searching, shuffling etc.
                    - generics support : ensure type safety and avoid ClassCastException

                - Hierarchy of collection framework 

                        Iterable<E> interface
                            |- Iterator<E> interate()
                            |
                        Collection<E> interface
                            |
                            |- boolean add(E e)
                            |- boolean remove(Object o)
                            |- void clear()
                            |- boolean addAll(Collection c)
                            |- boolean	contains(Object o)
                            |- int	size()
        -----------------------------------------------------------------------------
        List<E> interface                   Set<E> interface                Queue<E> interface 
         |-void	add(int index, E element)        |                               |                   
         |-E remove(int index)                   |                               |-PriorityQueue<E>
         |                                       |                ---------------------------------
         |                                       |               Deque<E> interface      BlockingQueue<E> interface
         |                                       |                    |                     |
    ArrayList<E>                                 |              ArrayDeque<E>            ArrayBlockingQueue<E>
    LinkedList<E>                                |
    Vector<E>                               HashSet<E>
    Stack<E>                                LinkedHashSet<E>
                                            TreeSet<E>

            - **Collection<E> interface
                - it is the super interface for all the subinterfaces like List, Set and Queue
                - The root interface in the collection hierarchy.


            - **List<E> interface   
                - List interface models an "index based/ordered collection of objects", which allows duplicate elements     
                - Ordered collection allowing duplicates  

                - the List implementation classes are:
                     - ArrayList<E> - 
                     - LinkedList<E>
                     - Vector<E>
                     - Stack<E>  
            
            - **Set<E> interface   
                - Set interface models "unique collection of objects", which doesn't allow duplicate elements     
                - Unordered collection with unique elements   

                - The Set implementation classes 

                    - HashSet<E> 
                    - LinkedHashSet<E>   
                    - TreeSet<E>  
            
            - **Queue<E> interface 
                - Queue interface models a collection of objects based on FIFO approach
                - follows FIFO - first in first out approach

                - Queue implementation classes are:
                        - PriorityQueue<E>
                        - PriorityBlockingQueue<E>
                        - ArrayDeque
                        - ArrayBlockingQueue<E>
                        - ArrayBlockingDeque<E>
                        



            - **Map<K, V> interface
            --------------------------------
                - models a "collection of elements in the form of key-value pairs"

                            Map<K, V> interface
                                |
                                |
                                |
                            HashTable<k,V>
                            HashMap<k,V>
                            LinkedHashMap<k,V>
                            TreeMap<k,V>


            - ** Concurrent collection classes
            ----------------------------------------
                - ConurrentLinkedQueue
                - CopyOnWriteArrayList
                - CopyOnWriteArraySet



            **IMP: key fators to consider while choosing between collection classes
            ------------------------------------------------------------------
                1. Ordering - do you want to maintain the insertion order, natural order, or no specific order?
                2. Duplicates - do you need to allow duplicates or enforce uniqueness?
                3. Access pattern - how do you plan to access the elements? by index? by key or through iteration?
                4. Performance - do you prioritize fast access? insertion? or deletion?
                5. Memory usage - is memory overhead is concern, particularly for large collection?


        **General concepts about Data Structure?
        ----------------------
            - it defines how data is stored / arranged  in memory and how the operations like insert, remove, iterate etc. are performed 

            - Linear Data Structures - elements arranged in sequence
                - Array - collection of elements, it stores the elements in contigious memory locations 
                - LinkedList - a sequence of elements (nodes) where each node points to the next node
                - Stack - follows LIFO approach - last in first out
                - Queue - follows FIFO approach 

            - non-linear data structures 
                - tree - a hierachical structure with nodes and edge (Binary tree, balanced tree, binary search tree etc.)
                - graph - a collection of nodes connected by edges, which can be directed or unidirected
                - heap - a special tree based structure that uses the heap property 

            - hash-based data structure 
                - hash table / hash map - uses a hash function to map keys to values



        ----------------------------------------------------------

                


            - **List<E> interface  
            =========================== 
                - List interface models an "index based/ordered collection of objects", which allows duplicate elements     
                - Ordered collection allowing duplicates  

                - the List implementation classes are:
                     - ArrayList<E> - 
                     - LinkedList<E>
                     - Vector<E>
                     - Stack<E>  


                1. ArrayList<E> class 
                --------------------
                        - "Resizable Array" data structure internally 
                        - the initial capacity of Arraylist is 10 
                        - while inserting/removing elements in ArrayList it shifts all the elements 
                        - Dynamic Resizing:
                            - when the number of elements exeeds the current capacity, the size of arraylist is automatically increased 
                            - during resizing, a new array with larger capacity is created, all the exising elements are copied
                            - by default, the resizing increases the size by 1.5 times


                        - Create an ArrayList 

                            ArrayList list = new ArrayList();
                            List list = new ArrayList();

                            List<Integer> numsList = new ArrayList<>();

                        - add elements in the list 
                            - boolean add(E e)
                            - void add(int index, E e)

                        - remove elements from the list 
                            - E remove(int index) 
                            - boolean remove(Object o)
                                - the remove(Object o) method, it internally uses the 'equals()' method to compare the given object
                                    with all other objects, if found it gets removed

                        - retrieve the elements from the list 
                            - E get(int index);

                        - iterate over a list 

                                for(int i=0; i<list.size(); i++){
                                       sysout( list.get(i));
                                }

                                for(int value: numsList){
                                    sysout(value);
                                }

                                - using iterator also we can iterate over a list 

                                    Iterator<Integer> iterator = list.iterator();
                                    while(iterator.hasNext()){
                                        int value = iterator.next();
                                        sysout(value)
                                    }

                        - searching an element in the list 

                            - boolean contains(E obj) - internally uses 'equals()' to compare the given element/object with all other elements  in the list , returns true if the match is found, otherwise false;
                            - int indexOf(E obj) - returns the index number of the first matching occurence of the given object
                            - int lastIndexOf(E obj)

                        - Sorting a list 

                                Collections.sort(list) 
                                    - sorts the elements of the list based on the "natural ordering" of the elements 
                                    - **IMP: Collections.sort() method internally uses the "compareTo()" method to compare the elements 
                                        and sort it
                                   
                        --**IMP: Comparable<E> interface 
                                - describes the "compareTo()" method which can be overridden by any class to provide the logic 
                                    for natural ordering

                                    interface Comparable<E> {
                                       int compareTo(E e);
                                    }

                                    public class Employee implements Comparable<Employee> {

                                        //empId, name, city, salary;
                                        
                                        public int compareTo(Employee otherEmployee){
                                            if(this.salary > otherEmployee.getSalary()){
                                                return 1;
                                            }else if(this.salary == otherEmployee.getSalary()){
                                                return 0;
                                            }else{
                                                return -1;
                                            }
                                        }
                                    }

                                - the compareTo() method must return a "compare value" as int 
                                    0   - both objects are same
                                    >0  - the object is greater than the given object 
                                    <0  - the object is less than the given object


                                    e1      e2      e3      e4      e5
                                    |       |

                                    e1.compareTo(e2)



                        --**IMP: Comparator<E> interface 
                        --------------------------------------
                            - used to create multiple external comparators 

                                interface Comparator<E> {

                                    int compare(E e1, E e2);
                                }

                            public class Employee implements Comparable<Employee> {

                                    empid, name, city, salary; 


                                    public int compareTo(Employee other){
                                        //logic for the natural ordering
                                    }
                            }

                            public class EmployeeNameComparator implements Comparator<Employee>{

                                    public int compare(Employee e1, Employee e2){
                                            //sorting logic based on name
                                    }
                            }

                            public class EmployeeSalaryComparator implements Comparator<Employee> {

                                    public int compare(Employee e1, Employee e2){
                                            //sorting logic based on salary
                                    }
                            }

                            public class EmployeeCityComparator implements Comparator<Employee> {

                                    public int compare(Employee e1, Employee e2){
                                            //sorting logic based on city
                                    }
                            }


                 2. LinkedList<E> class 
                -------------------------
                    - implementation class of List<E> interface
                    - internally uses 'double linked list' data structure
                    - no initial capacity

                        - Create an LinkedList 

                            List<Integer> list = new LinkedList<>();

                        - add elements in the list 
                        - remove elements from the list 
                        - retrieve the elements from the list 
                        - searching an element in the list 

                3. Vector<E>

                4. Stack<E>


         - **Set<E> interface 
         ============================  
                - Set interface models "unique collection of objects", which doesn't allow duplicate elements     
                - Unordered collection with unique elements   

                - The Set implementation classes 

                    - HashSet<E> class
                        - doesn't allow duplicate elements 
                        - internally uses 'hashtable' datastructure 
                        - it doesn't guarantee the order of insertion

                    - LinkedHashSet<E>  class 
                        - doesn't allow duplicate elements 
                        - internally uses 'hashtable + double linked list' data structure 
                        - it maintains order of insertion

                    - TreeSet<E>  class
                        - doesn't allow duplicate elements 
                        - internally uses 'balanced tree' data structure 
                        - it maintains sorted order of elements 




                **IMP: what is natural ordering? what is natural ordering of integers, strings and dates?
                        how to define natrual ordering for custom objects i.e Employee / Customer / Product to be sorted?


                **IMP: int hashCode()
                ---------------------------
                    - returns an integer that represents the hashcode of an object 
                    - it provides a way to hash the object into a unique integer for efficient storage and retrieval in hash-based collection classes
                    - **IMP: whenever we use any hash-based collection, we must override both the hashCode() and equals() method

                    -  **IMP: the equals() and hashCode() contract
                    ------------------------------------------------------
                        - if two objects are equal, then - their hash codes must be same
                        - if two objects are not equal, their hashcode may or may not be equal
                        - if hashCode() is overridden, the equals() should also be overridden to ensure consistency
                      



                **IMP: how hash-based collections internally work i.e. how hashset internally works 

                    1. it computes the hashCode of the object, using the hashCode() method
                        - this hashcode determines the bucket in which the element will be stored or needs to be searched

                    2. it checks for the duplicates using it's equals() method, whether the bucket already contains the object or not
                        - if an equal element if found, the new element will be added 




                Movie Name          Pushpa          RRR         Marco       Smile       Mummy       Daddy       "Jigra"  
                ------------


                    hashCode
                     6              "pushpa"

                     3              "RRR"

                     5              "Marco"     "smile"     "Mummy"     "Daddy"     "Jigra"


            Queue<E> interface and it's implementation classes
            ------------------------------------------------------
                - it models a collection of objects stored with FIFO approach 

                                Collection<E> interface 
                                    |
                                Queue<E> interface
                                    |
                                    |
                                    |
                                    |
                    ------------------------------------------------------------------------------------------
                    Deque<E> interface              BlockingQueue<E> interface                  PriorityQueue<E> class 
                        |                                   |                                   LinkedList<E> class
                        |                                   |
                    ArrayDeque<E> class             ---------------------------------------------
                                                    BlockingDeque<E> interface              PriorityBlockingQueue<E> class
                                                            |                               ArrayBlockingQueue<E> class
                                                ArrayBlockingDeque<E> class                 DelayQueue class
                                                                                            LinkedBlockingQueue class
                                                                                            LinkedTransferQueue class


                - Implementation classes of Queue<E> interface 

                        a. General-Purpose Queue Implementations
                            - PriorityQueue<E> class 
                                - stores the elements based on the natural ordering, maintains sorted order of the elements 
                                 - no capacity restriction

                            - ArrayDeque<E> class
                                - double ended queue
                                - no capacity restriction  

                            - LinkedList<E> class
                                - no capacity restriction

                        b. Concurrent Queue Implementations
                            - DelayQueue
                                - * stores the elements until they become eligible for retrivel base on a delay time
                                - * elements stored in this queue must element "Delayed" interface 
                                - uses priority queue to order elements based on the delay time
                            - LinkedBlockingQueue 
                                - capacity based queue
                                - uses linked list data structure 

                            - ArrayBlockingQueue<E> class
                                - internally uses circular array datastructure 

                            - PriorityBlockingQueue 
                                - backed by a heap data structure for priority based ordering 

                            - LinkedTransferQueue
                                - waits for the consumer to take the elements 

                            - ArrayBlockingDeque

                - Queue<E> interface methods 
                ------------------------------------------

                        insert                  add(e)              offer(e)

                        remove                  remove()            poll()

                        examine                 peek()

                - Deque<E> interface methods
                  ------------------------------------------

                        insert                  add(e)              offer(e)
                                                addFirst(e)         offerFirst(e)
                                                addLast(e)          offerLast(e)

                        remove                  remove()            poll()
                                                removeFirst()       pollFirst()
                                                removeLast()        pollLast()

                        examine                 peek()              
                                                peekFirst()
                                                peekLast()

                - BlockingQueue<E> interface - models capacity based queue
                ------------------------------------------------------------------

                        insert                  add(e)              offer(e)        put(e)
              
                        remove                  remove()            poll()          take()
          
                        examine                 peek()              
                


                 - **Map<K, V> interface
                --------------------------------
                - models a "collection of elements in the form of key-value pairs"
                - represents a data structure that maps keys to values 
                - whenever you want to associate a unique  KEY with a corresponding VALUE


                    - **IMP: key value pair storage
                            - each key is unique, and exactly maps to one value 
                            - keys are used to access the elements 
                        - no duplicate keys allowed
                        - null keys and values 
                            -  HashTable<k,V>   : does not allow null keys and null value
                            -   HashMap<k,V>    : allows one null key, values can be null
                            -  LinkedHashMap<k,V> : allows one null key, values can be null
                            -  TreeMap<k,V>: doesn't allow null keys, values can be null


                            Map<K, V> interface
                                |
                                |-> V put(K key, V value)
                                |-> V get(Object key)
                                |-> V remove(Object key)
                                |-> boolean containsKey(Object key)
                                |-> Set keySet()
                                |-> Collection values() 
                                |-> Set entrySet()
                                |-> int size()
                                |-> boolean isEmpty()
                                |
                            HashTable<k,V>
                            HashMap<k,V>
                            LinkedHashMap<k,V>
                            TreeMap<k,V>


            **IMP: Implementation classes of Map interface 


                     1. HashTable<k,V>
                            - legacy implementation class
                            - synchronized (thread safe)
                            - does not allow null keys or null values 
                            - it uses "hash table" data structure 

                     2. HashMap<k,V>
                            - allows one null key, values can be null
                            - not synchronized (not thread safe)
                            - it uses "hash table" data structure 
                            - doesn't maintain the order of insertion
                     
                     3. LinkedHashMap<k,V>
                            - it uses "hash table + double linked list" data structure
                            - it maintains the order of insertion by "keys"
                     
                     4. TreeMap<k,V>
                            - maintains sorted order by "keys"
                            - it uses "red-black tree" data structure 

                    5. ConcurrentHashMap<K,V>
                        - it is a thread safe version of HashMap
                        - synchronized 



                Iterate over a map
                -------------------------------

                            1. Collection<V> values()


                            2. Set<K> keySet()


                            3. Set<Map.Entry<K,V>> entrySet()


            Functional Interfaces and Lambda Expressions
            -----------------------------------------------------

                - functional interfaces
                    - an interface having exactly one abstract method is called 'functional interface' 
                        **: Note: it may have 'default' or 'static' methods

                        @FunctionalInterface
                        interface Hello {
                            //
                            void sayHello();

                            //static method
                            //default method
                        }


                        //create a class that implements interface Hello
                        public class Greet implements Hello {

                            @Override
                            public void sayHello() {
                                // TODO Auto-generated method stub
                                System.out.println("Greeting : Saying Hello...");
                            }

                        }

                        //create anonymous object that implements the interface Hello 
                        Hello greeting = new Hello() {
			
                            @Override
                            public void sayHello() {
                                // TODO Auto-generated method stub
                                System.out.println("Saying Hello....");
                            }
                        };
		
		                greeting.sayHello();

                        //using lambda expression to implement the interface Hello 

                        Hello hello = () -> System.out.println("Saying Hello....");
                         
                        


                - pre-defined functional interface in java 

                        - interface Comparator<T>

                                    int compare(T t1, T t2)


                            Comparator<Product> comparator = (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice());


                        - interface Runnable<T>

                        - interface Callable<T>

                        - interface Predicate<T> 
                            - represents a boolean-valued function with one input

                                    interface Predicate<T> {
                                        boolean test(T t);
                                    }

                            - interface BiPredicate<T, U>

                                    interface BiPredicate<T> {
                                        boolean test(T t, U u);
                                    }


                        - interface Function<T, R>
                            - takes one input and produces a single output

                                    interface Function<T, R>{
                                        R apply(T t);
                                    }

                                    interface BiFunction<T, R, U>{
                                        R apply(T t, U u);
                                    }

                                    interface ToDoubleFunction<T>{
                                        double apply(T t);
                                    }

                        - interface Supplier<R>

                                interface Supplier<R>{
                                    R get();
                                }

                        - interface Consumer<T>

                                interface Consumer<T>{
                                    void accept(T t);
                                }

                                interface BiConsumer<T, U u>{
                                    void accept(T t, U u);
                                }


            - Lambda Expressions
            ------------------------------
                - it is used to implement a functional interface 
                - a lambda expression is a concise way to represent and anonymouse object.
                        



            Stream API in java
            ------------------------------
                - introducted in java 8
                - it is used to process the collections 

                - every stream has 
                    - 1 source i.e. any collection, any array, string
                    - 0 or more intermediate operations 
                    - 1 terminal operation



                    - intermediate operations 
                        - are used to transform the elements of the stream and return a new stream 
                            with the transformed elements 

                        - .filter(Predicate)
                            - creates a new stream consisting the values where the given predicate is true

                        - .map(Function) 
                            - returns a new stream consisting the values returned by the given function                  

                                - mapToInt()
                                    - returns an intStream object, containing int values 
                                        returned by the given function

                        - .flatMap(Function)
                        - .distinct()
                        - .sorted()
                        - .limit()
                        - .skip()
                        - ..
                        - ..

                    - terminal operations 
                        - consumes the stream and returns a result or perform side effects 
                        - each stream must end with a terminal operations

                        - .forEach(Consumer)
                        - .collect(collector)
                        - .reduce()
                        - .count()
                        - .toList()
                        - .toArray()
                        - .min()
                        - .max()

                        - .findfirst()
                        - .findAny()
                        - .anyMatch(Predicate)
                        - .allMatch(Predicate)
                        - .noneMatch(Predicate)


            - terminal operation using .collect() method 
            ---------------------------------------------------
            
                 R collect(Collector) 

                    - The collect() operation accumulates elements in a stream into a container such as a collection. 

                    Collectors  class
                    -----------------------
                        - provides pre-defined methods to perform reduction operation

                        - toList()

                        - toSet()

                        - toMap()

                        -  groupingBy
                                - Returns a Collector implementing a "group by" operation on input elements of type T, grouping elements according to a classification function, and returning the results in a Map.

                                groupingBy(Function)

                                Counting elements in each group:
                                
                                Map<String, Long> countByDepartment = people.stream()
                                        .collect(Collectors.groupingBy(Person::getDepartment,   .counting()));

                                Finding the highest-paid employee in each department:
                                    Map<String, Optional<Person>> highestPaidByDepartment = people.stream()
                                        .collect(Collectors.groupingBy(Person::getDepartment, 
                                                                    Collectors.maxBy(Comparator.comparing(Person::getSalary))));

                        - partitionBy
                                The partitioningBy collector is similar to groupingBy, but it divides elements into two groups based on a predicate. It produces a Map<Boolean, List<T>>, with keys true and false.

                            Suppose you want to partition people based on whether their salary is above 50,000:
                                    Map<Boolean, List<Person>> partitionedBySalary = people.stream()
                                        .collect(Collectors.partitioningBy(person -> person.getSalary() > 50000));
                                        

                        - counting 

                                long count = people.stream().collect(Collectors.counting());

                        - mapping 

                            - The mapping collector transforms the elements before collecting them, often used as a downstream collector for groupingBy.
                            - Suppose you want to group people by department and get a list of names in each department:

                            Map<String, List<String>> namesByDepartment = people.stream()
                                .collect(Collectors.groupingBy(Person::getDepartment, 
                                                            Collectors.mapping(Person::getName, Collectors.toList())));


                        - joining
                            - The joining collector concatenates strings. It is especially useful for joining values with delimiters.

                            String names = people.stream()
                                            .map(Person::getName)
                                            .collect(Collectors.joining(", "));

                        - comparing 

                        - maxBy(comparator)

                        - minBy(comparator)

                        - toMap
                            - The toMap collector collects elements into a Map and allows you to specify keys and values.

                                Map<String, Person> personMap = people.stream()
                                     .collect(Collectors.toMap(Person::getName, person -> person));

                        

            



            Requirements
            Create Employee Class:

                 Fields: id, name, department, salary, joiningDate
                Constructor, getters, setters, and toString() methods.
        
            
            Tasks:

            1. Filter: Find all employees in a specific department.
            2. Sorting:
                Sort employees by salary (ascending).
                Sort employees by joining date (descending).
            3. Mapping: Extract a list of employee names.
            4. Reduction:
                Calculate the total salary of all employees.
                Calculate the average salary of all employees
                show the employee having min salary
                show the employee having highest salary
                calculate the total salary of each department
                calculate the average salary of each department
            5. Grouping: Group employees by department.
            6. Partitioning: Partition employees by salary (above or below a threshold).



        Date Time API
        -----------------------

            1. LocalDate 
                - represents a date without time zone 

            2. LocalTime
                - represents a time without a date or time zone

            3. LocalDateTime
                - represents both date and time without time zone 

            4. ZonedDateTime 
                - represents a date and time with timezone information

            5. Duration
                - measure the time between two Localtime objects 

            6. Period 
                - measures the time betweeen two LocalDate objects 


            7. DateTimeFormatter


                REF: https://www.baeldung.com/java-temporal-adjuster





























            **Problem statement (Cycle Detection Logic)
            -----------------------------------------------------
                - find the minium number of swaps required to sort an array

                input:  [4, 3,  1,  2]          - 1 2 3 4
                        |   |
                        3   4               - [4,3]                 [true]
                        |       |
                        1       3
                        |           |
                            |   |
                            3   4           - [4,3]
                            |       |
                            2       3       - [2,3]


                REF:   https://www.geeksforgeeks.org/comparison-among-bubble-sort-selection-sort-and-insertion-sort/

                REF: https://prepinsta.com/hackerrank/coding-questions-and-answers/

                    similar logic like Cycle Detection 
                        1. Question 1 – Maximum Passengers
                        2. Question 4 : Network Stream
                        3. Question 6 – Disk Space Analysis - "sliding window logic" 


            **IMP: Logic Patterns
                1. Cycle Detection logic i.e. find the minium number of swaps required 
                    - concept: creating pairs of (value and index), sorting / sorting using collection

                2. Divide and conqure - i.e counting array inversions
                        - concepts - merge sort, counting inversions, recursive division

                3. Greedy algorithm - examine consecutive elements in the sorted array, find minium absolute difference 
                        - concepts : sorting, greedy algorithm, time complexity


            **IMP: Explore yourself
                - Sorting techniques i.e. selection sort, bubble sort, merge sort, cycle sort 



            **IMP: wherever you want to provide an implementation of any "functional interface", you can use lambda expression

            **IMP: "functional interface" - is any interface that has only 1 abstract method 

                    interface Comparator<T> {

                        int compare(T obj1, T obj2);
                    }

                    class EmpSalaryComparator implements Comparator<Employee>{

                        public int compare(Employee e1, Employee e2){
                            retur Double.compare(e1.getSalary(), e2.getSalary());
                        }
                    }

                    Collection.sort(empList, new EmpSalaryComparator());
        
                    Collection.sort(empList, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

            **IMP: Pre-defined functional interfaces
                    - Predicate 
                    - Consumer
                    - Supplier
                    - Function
                    - BiPredicate / BiConsumer / BiSupplier / BiFunction
                    - Callable 
                    - Runnable 
                    - Comparator 





            Exception Handling 
            ---------------------------
                - a mechanism that helps to manage runtime errors, ensing the application can recover 
                    or gracefully shuts down without crashing   
                - managing exceptions using try-catch block to ensure the programs runs gracefully/ensure the program stability 
                - exception is an error that occurs at runtime
                    - because of ..
                        - wrong input 
                        - wrong logic 
                        - failure in connection/resources


                - problem occurs / exception occurs 
                - inform that the error has occured / create / throw an object of exception
                - receive the error information / catching the exception
                - take corrective actions 

                


                - Exception class 
                    - The 'Exception' class is the super most class in the hierarchy 
                    - represents all the exceptions that might occur at run time
                    - represents the conditions that an application might want to catch

                - types of exceptions 
                     - 1. checked exceptions 
                            - exceptions that are checked during compile time 
                            - must be handled with try-catch block or 'declared to be thrown'

                     - 2. unchecked exceptions 
                            - not necessarily handled with try-catch block
                            - they are handled by the 'default expcetion handler' in case you don't 
                                handle with try-catch block
                            - all the 'RuntimeException' are unchecked exceptions 


                        Throwable 
                            |
                            |
        ------------------------------------------------------------
        Error                                                   Exception
          |                                                         |
    -------------------                         ---------------------------------------------------
    OutOfMemoryError                            RuntimeException                    IOException     SQLException
    StackOverflowError                              |                                   |
                                                InputMismatchException              FileNotFoundException
                                                ArrayIndexOutOfBoundsExeception
                                                ArithmeticException
                                                NullPointerException
                                                NumberFormatException
                                                



            **IMP: Default Expcetion Handler
            --------------------------------------------
                - whenever the error/exception occurs, the jvm creates object of that exception
                    and throws it to the default exception handler 
                - the default exception handler prints the stack trace and terminates the program


            - throw is used to explicitly throw an exception in a method or block of code.
            - throws is used in a method signature to declare the exceptions that the method might throw.


            **IMP: The try-with-resources Statement
                - The try-with-resources statement is a try statement that declares one or more 
                    resources. 
                - it can be used for only those resources (Objects) which are "Closable" or "AutoClosable"

                - A resource is an object that must be closed after the program is finished with it.
                - The try-with-resources statement ensures that each resource is closed at the end of the statement. 


            
        File Handling 
        ------------------------
            - java.io Package classes/interfaces to perform input/output operations

            - I/O stream - sequence of bytes
                - A stream is a sequential and contiguous one-way flow of data
                - A Stream presents a uniform, easy-to-use, object oriented interface between the program and input/output devices

                1. Byte stream classes 

                            InputStream                      OutputStream
                                |                               |
                                |- FileInputStream              |-FileOutputStream
                                |- BufferedInputStream          |-BufferedOutputStream
                                |- DataInputStream              |-DataOutputStream
                                |- ObjectInputStream            |-ObjectOutputStream

                2. Charater stream classes 

                            Reader                           Writer 
                             |                                  |
                             |-> InputStreamReader              |-OutputStreamWriter
                             |      |-FileReader                |   |-FileWriter
                             |-> BufferedReader                 |-BufferedWriter


            **IMP: Serialization and Deserialization ...
                - Serialization in Java is the process of converting an object's state into a byte stream
                    - This byte stream can be stored in a file, sent over a network, or saved in a database.

        Multithreading in java 
        ------------------------------
            - allows multiple sub-processes that can be executed at the same time 
            - every java program has by-default 1 thread i.e. Main thread 

            - each thread runs independently and can share same memory
            

            - Thread
            -----------------
                - smallest unit of process that can execute concurrently 

            - Main Thread 
                - every java program run inside a default main thread, created by JVM

            - Thread State

                    - NEW - when a thread object is creatd but not  yet started 

                    - RUNNABLE - when the thread is ready to run but waiting for CPU 
                        scheduling 

                    - RUNNING - when a thread is executing it's task

                    - BLOCKED / WAITING - when a thread is waiting for resources
                            or goes into timed waiting state or waits for another thread's signal

                    - TERMINATED  - when thread completes the execution 

            - Create your own thread 

                    1. extend the 'Thread' class and override the 'run()' method

                                class MyThread extends Thread {
                                    public void run(){
                                        //code / logic to be executed inside a thread
                                    }
                                }

                                MyThread t1 = new MyThread();
                                t1.start();

                    2. by implementing 'Runnable' interface
                            - this class represents logic/code that can be executed 
                                inside a thread 

                            class MyTask implements Runnable {
                                    
                                    public void run(){
                                        //code / logic to be executed inside a thread
                                    }                       
                            }
                            MyTask task = new MyTask();
                            Thread t1 = new Thread(task);
                            t1.start();

            JDBC - Java Database connectivity 
            ----------------------------------------
                - specification/standard for connecting programs written in Java to the  popular databases.

            - types of Drivers
                1. Type I – (JDBC-ODBC Bridge Driver)

                2. Type II – (Native-API, partly Java driver)

                3. Type III – (JDBC-Net, Pure Java driver)

                4. Type IV – (NATIVE-PROTOCOL, Pure Java driver)


            - Driver - interface handles the communications with the database server.

            - DriverManager - DriverManager class manages the drivers and connections

            - Connection - This interface with all methods for communicating to a database.

            - Statement - interface that represents methods to send sql commands to the database

            - ResultSet - represents the data fetched from the database





            - steps to communicate with the database 
                //(optional) 1. load database driver
			            
                        Class.forName("com.mysql.cj.jdbc.Driver");
			
                //2. create the connection

                 Connection  connection = DriverManager.getConnection("dburl","username","password");


                //3. create statement object 
                statement = connection.createStatement();
                        // Creates a Statement object for sending SQL statements to the database.


                //4. execute the sql statement / send the sql statement to the database 



            - RDBMS databases 
                            driver class                    URL PATTERN

            mysql           com.mysql.cj.jdbc.Driver        jdbc:mysql://localhost:3306/dbname

            postgreSQL      org.postgresql.Driver

            Oracle          oracle.jdbc.driver.OracleDriver

            H2 database

            MS SQL Server   com.microsoft.sqlserver.jdbc.SQLServerDriver

            DB2             com.ibm.db2.jcc.DB2Driver



            Statement Object 
            -----------------------
                - Statement object is used to send SQL statements to the database.
                - methods of the statement object 

                    - int executeUpdate(String query);
                        - used to perform INSERT, UPDATE AND DELETE operations
                        - returns an int value representing the number of rows of affected 

                    - ResultSet executeQuery(String query);
                        - used to perform SELECT operation

                    - boolean execute(String query);


            ResultSet Object
            ---------------------------
                - resultset object represents the table of data fetched from the db (based on the select query)
                - it has a cursor, which by default points to the row before first row 
                - using rs.next() advances the cursor to the row, return true if the row exists
                - using rs.getXXXX(columnNumber) or rs.getXXXX("colName") we can read the data from the row
                

                - ResultSetMetadata 
                    - provide information about the columns of a resultset

                - ResultSet types 

                        ResultSet.TYPE_FORWARD_ONLY
                        ResultSet.TYPE_SCROLL_INSENSITIVE
                        ResultSet.TYPE_SCROLL_SENSITIVE

			statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            PreparedStatement ps = connection.prepareStatement(inserQuery, ResultSet.TYPE_SCROLL_SENSITIVE,     
                                                                                    ResultSet.CONCUR_UPDATABLE);

                - ResultSet Concurrency 

                    ResultSet.CONCUR_READ_ONLY
                    ResultSet.CONCUR_UPDATABLE



            ORM Tools 
            -----------------
                - Object relation mapping 
                - ORM is a tool that maps java objects(entities) to database tables making it easier to perform CRUD operations without writing SQL queries manually
                - ORM tools - hibernate, iBatis, TopLink etc.


                    class Employee {
                        int id;
                        string name;
                        String city;
                        int salary;
                        

                        ..
                    }

                    employee_table
                    --------------------
                    id          name            city            salary


            JPA - Java Persistence API
            ----------------------------------------
                - specification/standard for the ORM tools, defineing how java objects should be mapped to a relational database table

                JPA Providers 
                -------------------
                    - Hibernate JPA
                    - EclipseLink
                    - MyBatis
                    - Open JPA


                JPA Terms
                --------------
                    - Entity - a java class to be persisted in the db

                    - EntityManager - interface used to perform db operations, it is reponsible to perform DDL, 
                                DQL, DCL etc. db operations
                        - EntityManager is reponsible to manage the entities 

                    - EntityManagerFactory - used to create EntityManager object

                    - Persistence Unit - configuration that defines the db connection properties

                    - JPQL - java persistence query language 

                            sql         - SELECT * FROM employee;

                            JPQL        - select from Employee e;

                            sql         - Select name, city from employee;

                            JPQL        - SELECT e.name, e.city FROM Employee e;

                            sql          - SELECT * FROM employee WHERE city='Pune';

                            JPQL        - SELECT e From Employee e where e.city='Pune';

                Entity
                ---------------
                    - objects managed by JPA Provider 
                    - create a Entity class 
                        - 1. the class has to be annotated with @Entity annotation
                        - 2. the Entity class must have an identifer field marked with @Id annotation
                        - 3. the Entity class must have a no-arg contructor 

                            @Entity
                            public class Employee {

                                @Id
                                private int empId;

                                private String name;
                                privaet String city;
                                ...
                                ..

                                public Employee(){}

                            }


        Spring Framework 
        ----------------------------
            - standardises the process of application development 
            - it is used to develop java-based applications 
            - The Spring Framework provides a comprehensive programming and configuration model for modern Java-based enterprise applications - on any kind of deployment platform.

            1. Spring Core 
                - provides fundamental features like DI, IoC container, Bean Life Cycle etc.


                - Inversion of Control (IOC)
                    - IoC is a design principle where the control over object creation / dependency management is tranferred from the programmer to the spring framework

                    - process of delegating the responsibility of creating / managing the objects to the "IOC Container"

                - IOC Container
                    - IoC container is the core of the spring framework, which initiazes and manages "objects", manages their dependencies, and their lifecycle
                    - it is responsible to manage the "objects"

                    - spring provides two types of IoC Containers 

                        1. BeanFactory - Basic IoC container 
                            - simplest, lightweight container, provides basic functionality 
                            - **IMP: lazily initializes beans (Beans are created only when requested)

                            - implementation classes of BeanFactoty 
                                - XmlBeanFactory (Note: it is deprecated from Spring verion 5.0)

                        2. ApplicationContext - Advanced IoC container 
                            - **IMP - eagarly loads all the beans at startup (better performance for web apps)

                            - Implementation classes of ApplicationContext 
                                - ClassPathXmlApplicationContext
                                - FileSystemXmlApplicationContext
                                - AnnotationConfigApplicationContext
                                - AnnotationConfigWebApplicationContext

                - Dependency Injection
                    - technique used by IoC container to inject dependencies into objects automatically

                        - constructor-injection
                        - setter-injection
                        - field-injection (Annotation based DI)

                - Spring Bean
                    - A Spring Bean is an object managed by Spring IOC Container 
                    - it is a reusable component that can be injected into other components 

                - Bean Definitions / Bean Configuration
                    - configuration of beans to specificy which objects should be created, how should they be initized, how many instances should be created etc etc.

                    - there are 3 ways to define the beans 

                        1. using XML Configuration 

                                <beans>
                                    <bean id="" name="" class="">
                                        //<constructor-arg name="" value="" / ref="">
                                        //<property name="" value="" / ref="">
                                    </bean>
                                </beans>


                        2. using Java Configuration 

                                @Configuration
                                public class ApplicationConfig {
                                    
                                    @Bean
                                    public EmployeeDAOImpl createEmployeeDAOImpl() {
                                        //logic to create an object
                                        //..
                                        return new EmployeeDAOImpl("url", "username", "password");
                                    }
                                    
                                    @Bean
                                    public EmployeeServiceImpl createEmployeeServiceImpl(EmployeeDAOImpl empDao) {
                                        
                                        return new EmployeeServiceImpl(empDao);
                                    
                                    }
                                }


                        3. using Annotation-based Configuration

                                @Component 
                                    - Indicates that an annotated class is a "component". Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning.


                                @Respository 
                                    - Indicates that an annotated class is a "component". Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning.


                                @Service 
                                    - Indicates that an annotated class is a "component". Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning.


                                @Controller 
                                    - Indicates that an annotated class is a "component". Such classes are considered as candidates for auto-detection when using annotation-based configuration and classpath scanning.

                - Bean Life cycle 

                        - Bean initialization 

                            - interface InitializingBean
                                - Interface to be implemented by beans that need to react once all their properties have been set by a container: for example, to perform custom initialization, or merely to check that all mandatory properties have been set.

                            - a class can implement "InitializingBean" interface and implement it's method 
                                public void afterPropertiesSet() throws Exception {
		                            // TODO Auto-generated method stub
                                    //logic for custom initialization or validation
	                            }

                        - Bean Disposal
                            - interface DisposableBean
                                - Interface to be implemented by beans that want to release resources on destruction

                                    public void destroy() throws Exception {
		                                // TODO Auto-generated method stub
                                        //logic to release the resources you might have used in the progream
	                                }

                - Bean Scopes 

                        - Singleton 
                                - default scope
                                - only one instance of that class is created

                        - Prototype 
                            - creates new instance everytime we call the getBean() method
                               

                        - Application 

                        - Session 

                        - Request

            2. Spring WEB 
                - supports web development, RESTful API Development 

                - Spring MVC
                - Spring WebFlux

            3. Spring AOP
                 - supports aspect oriented programming 

            4. Spring Data 
                - provides easy integration with databases using spring data jpa, JDBC, MongoDB etc
                - Spring Data JPA
                - Spring Data MongoDB
                - Spring Data Redis 
                - Spring Data Elasticsearch

            5. Spring REST 

            6. Spring Cloud 
                - helps to build microservices and cloud native applications 
                - Spring Cloud Config
                - Spring Cloud Gateway
                - Spring Cloud Netflix
                - ...

            7. Spring Security 
                - helps to implement authentication, authorization, protection against security threats 

            8. Spring Boot
                - simplifies the spring application with features like auto-configuration, embedded servers, production-ready features etc.



            Spring Boot 
            ------------------
                - simplifies the spring application with features like auto-configuration, embedded servers, production-ready features like Actuator etc.
            


            Spring Data JPA
            ----------------
                

                    - JPA 
                        - Java Persistence API 
                        - it is standard/specification for ORM tools 

                    - JPA Providers 
                        - ORM tools like Hibernate, OpenJPA, EclipseLink, MyBatis etc. who implements the JPA standards 

                    - Spring Data JPA
                        - it is a wrapper around JPA and JPA Provider
                        - it provides "Repository Pattern" which is higher level abstraction for working with the database 
                        - instead of managing entity persistence, query execution, transaction management at your own, you can simply use the "Repository Pattern" which simplifies the 
                        DB operations

                        - it reduces the boilerplate code for entity management, query execution and transactions
                        - it auto-generates query methods
                        - it supports "QueryDSL" 
                        - it comes with built-in support for pagination and sorting
                        - better Transaction management



                            interface Repository<T, ID>
                                |-> marker interface
                                |-> General purpose is to hold type information as well as being able to discover interfaces that extend this one during classpath scanning for easy Spring bean creation.
                                |
                                |
                            interface CrudRepository<T, ID>
                                |
                                |- long count()
                                |- void delete(T entity)
                                |- void deleteAll()
                                |- Iterable<T> findAll()
                                |- Optional<T> findById(ID id)
                                |- S save(S entity)
                                |
                            Interface ListCrudRepository<T,ID>
                                |
                                |-> List<T> findAll()
                                |
                            interface Interface PagingAndSortingRepository<T,ID>
                                |
                                |- Iterable<T> findAll(Sort sort)
                                |- Page<T> findAll(Pageable pageable)
                                |
                                |
                            Interface JpaRepository<T,ID>
                                |
                                |- S saveAndFlush(S entity)
                                |- ListT> findAll(Example<S> example)
                                |- List<T> findAll(Example<S> example, Sort sort)
                                |

            1.  Create custom queries using @Query anotation
                - @Query annotation is used to define custom JPQL queries/ custom sql query  directly inside your repository

                    interface UserRespository extends JpaRepository(User, Long){

                        	@Query("SELECT u FROM User u WHERE u.email = :email ")
                        	User fetchUserByEmail(@Param("email") String email);

                           @Query(name = "Select * from user where email =?", nativeQuery = true)
	                        User fetchUserByEmail1(@Param("email") String email);
                    } 


               2.  Using Query methods from spring data jpa 
                    - Query Methods in Spring data jpa, allows to generate db queries automatically based on "method names"

                                - the "method names" should start with 
                                    - findByXX
                                    - findAllByXX
                                    - readByXX
                                    - queryByXX
                                    - existsByXX
                                    - countByXX
                                    - deleteByX

                                - operators supported in the method naming 

                                    - equal (=)          - findByEmail(String email)
                                    - not equals(!=)     - findByEmailNot(String email)
                                    - Like (LIKE)        - findByEmailLike(String email)
                                    - LIKE prefix%      - findByEmailStartingWith(String email)
                                    - LIKE suffix%      - findByEmailEndingWith(String email) 
                                                                  findAllByEmailEndingWithIn(List<String> email)
                                    - >                 - findAllByAgeGreaterThan(int age)
                                    - <                 - findAllByAgeLessThan(int age)
                                    - between           - findAllByAgeBetween(int from, int to)
                                    - IN                - findAllByAgeIn(List<Integer> ages)
                                    - NOT IN            - findAllByAgeNotIn(List<Integer> ages)
                                    - order by          - findAllByAgeOrderAsc(int age)

                                - combine query methods using AND / OR 

                                    and  - findByNameAndEmail(String name, String email)

                                    or  - findByNameOrEmail(String name, String email)

                    3. using QueryDSL



                
            **IMP: Entity Relationship 
            -----------------------------------------------

                - entity relationship defines how objects in java are mapped with the relational tables
                - in jpa we use below annotations to define the relationships 

                    1. OneToOne (1:1)   - One Entity is associated with exactly one other entity
                    2. OneToMany (1:N)  - One entity is associated with multiple other entities 
                    3. ManyToOne (N:1)  - many entities are associated with one entity
                    4. ManyToMany (M:N) - multiple entities are associated with multiple other entities 


               


            *IMP: OneToOne (Unidirectional)
            --------------------------------------

                class User {  1---------------------->1 class Profile {

                    int id;                                     int id;
                    String name;                                String bio
                    Strint email;                               ...

                    @OneToOne
                    Profile profile;

                }                                       }


                user table        FK                                profile table
                id  name   email  profile_id                          id   bio    


                 - Default Strategies to represent the relationship in the database 

                    Annotation          table relationship          fetch policy            cascade
                    @OneToOne           - JoinColumn                FetchType.EAGER         none



            *IMP: OneToMany (Unidirectional) relationship 
            -------------------------------------------------------

            class Order {   1-------------------------->* class LineItem {

                    int orderId;                                    int id;
                    Date date;                                      String productName;
                    int orderNumber;                                int quantity;
                    String userName;                                double price;

                    @OneToMany
                    List<LineItem> items;

                    double totalCost;

            }                                                }

        order table                                                 lineitem table 
        ---------------                                             ----------------
         orderId  date  ordernumber   totalcost  userName            id  productName  quantity  price order_id   

            order_lineitem (jointable)
            -------------
            order_orderid       lineitem_id



                Default strategies  OneToMany (Unidirectional) relationship 
                ------------------------------------------------
                 Annotation          table relationship          fetch policy           Cascade 
                 @OneToManuy         @JoinTable                 FetchType.LAZY          none
                                (**by default is uses a join table if no @joincolumn is specified)



         *IMP: OneToMany - ManyToOne (BiDirectional) relationship 
            -------------------------------------------------------

            class Order {   1-------------------------->* class LineItem {

                    int orderId;                                    int id;
                    Date date;                                      String productName;
                    int orderNumber;                                int quantity;
                    String userName;                                double price;

                    @OneToMany(mappedBy="order")                    @ManyToOne
                    List<LineItem> items;                           Order order;

                    double totalCost;

            }                                                }

        order table                                                 lineitem table 
        ---------------                                             ----------------
         orderId  date  ordernumber   totalcost  userName            id  productName  quantity  price   order_id 

            order_lineitem (jointable)
            -------------
            order_orderid       lineitem_id



                Default strategies  OneToMany (Unidirectional) relationship 
                ------------------------------------------------
                 Annotation          table relationship          fetch policy           Cascade 
                 @OneToManuy         @JoinTable                 FetchType.LAZY          none
                                (**by default is uses a join table if no @joincolumn is specified)




            *IMP: OneToMany and ManyToOne (BiDirectional)
            ------------------------------------------
                class Department {                          class Employee {

                    id, name, ..                                id, name, salary, 

                    @OneToMany                                  @ManyToOne
                    List<Employee> employees;                   Department department;

                }                                           }


                - Unidirectional / BiDirectional




                @OneToMany 
                    - what strategy is being used to represent the relationship in the database
                    - you should define appropriate cascade behavior 


                - Fetch Policty 
                ----------------
                    1. FetchType.LAZY 
                        - the related resources/entities are not loaded fromt the database until it is actually accessed via getter methdos

                    2. FetchType.EAGER 
                        - loads the related resourecs/entities immediately when we fetch a resourse 

                - Cascade Effects 
                -----------------------
                    - Cascade.ALL

                    - Cascade.PERSIST 
                        - when you persist the main entity (parent) any "new" (child) / related entities will be automatically persisted which are associated with the main entity (parent)

                    - Cascade.REMOVE 

                    - Cascade.MERGE

                    - Cascade.REFRESH

                    - Cascade.DETACH


            - Spring Framework - spring core, spring data (spring data jpa), spring boot

                EXPLORE: spring data jdbc, spring data mongoDB

            
            - Spring Web
                - build web applciation s
                - build RESTful Web Services / RESTful APIs

            - Spring MVC (Model View Controller)
                - helps to build "web applications" /RESTful Web Services using MVC pattern

                    - Model - represents application data and business logic 

                    - View - represents the UI layer, it is responsible to render the "view"
                                along with the model data

                    - Controller - Handles incoming HTTP Requests, interacts with the model, and 
                            returns appropriate "view" along with the model "Data"


            **IMP: 
                - A web server is a system that stores and delivers web content to users over the internet.
                - REF: https://www.baeldung.com/spring-template-engines


            - Controller
                - handles HTTP requests and returns RESPONSE
                - Use @Controller annotation to define a controller class that returns a "view"

                        - request handler / handler method
                            - a method in the controller that receives a request and returns a response
                            - this method is called when you send a specific type of request to a specific URL
                            - to return a view: the request handler method must return name of the "view"

                        - Controllers in Spring MVC are responsible for processing incoming HTTP requests, interacting with business logic, and returning the appropriate responses.
                        - They are annotated with @Controller (for view-based responses) or @RestController (for REST APIs).
                        - Controllers use mapping annotations (@GetMapping, @PostMapping, etc.) to define which methods handle specific HTTP requests.
                        - Data binding is supported via annotations like @PathVariable, @RequestParam, and @ModelAttribute.
                        - Controllers can handle form submissions and exceptions to create robust web applications.

            - HTTP Request Types    
                - GET 
                - POST
                - PUT
                - PATCH 
                - DELTE
                - HEAD


            - DispatcherServlet:
                 DispatcherServlet is the front controller in the Spring MVC framework. It is responsible for intercepting incoming HTTP requests, routing them to the appropriate controllers, and returning the responses. In a Spring Boot application, much of the configuration of the DispatcherServlet and the overall Spring MVC infrastructure is handled automatically by the framework.

                 - Front Controller Pattern:
                    The DispatcherServlet acts as the central point that receives all incoming requests (according to its URL mapping in web.xml or via Spring Boot auto-configuration). It then dispatches these requests to the appropriate handlers (controllers).

                 - Processing Flow:
                    When a request arrives:
                        1. Interception: The DispatcherServlet intercepts the request.
                        2. Handler Mapping: It consults one or more HandlerMapping beans to determine which controller method should process the request.
                        3. Handler Adapter: It uses a HandlerAdapter to invoke the determined controller method.
                        4. Model and View: The controller returns a ModelAndView (or similar data in REST scenarios), which contains both the data (model) and the logical view name.
                        5. View Resolution: A ViewResolver translates the view name into an actual view (for example, a Thymeleaf template), and the view is rendered.
                        6. Response: The rendered view is sent back as the HTTP response.

            - Model:
                Data Carrier: Represents the data of the application. The model can be as simple as Java POJOs
                Data Binding: Controllers add data to the model, which is then used by the view to generate dynamic content.

            - Spring REST 
            --------------------

                    - Spring REST is the part of the Spring Framework that makes it easy to build "RESTful web services". Using Spring REST, you can expose your application's functionality via HTTP endpoints that "return data" (often in JSON or XML format) rather than rendering HTML pages. 
                    
                    - This is typically done using the @RestController annotation, which is a specialized version of @Controller that automatically adds the @ResponseBody behavior to all methods.


                - RESTful Web Services
                    - REST (Representational State Transfer) is a set of architectural principles defined by Roy Fielding in his doctoral dissertation. REST emphasizes a stateless, client-server communication model.

                       **IMP - RESTful web services expose resources through URLs and allow clients to perform operations using standard HTTP methods.
                        - They are stateless, ensuring that each request is self-contained.
                        - They support multiple representations (JSON, XML, etc.) and are built on a client-server model, ensuring separation of concerns.
                        - This architecture leads to simplicity, scalability, flexibility, and interoperability, making REST a popular choice for designing web services.

                    - @RestController
                        - @RestController annotation is used to create a controller that returns "data" 

                    - RESTful Services:
                        REST (Representational State Transfer) is an architectural style that uses HTTP methods explicitly (such as GET, POST, PUT, DELETE) to perform CRUD (Create, Read, Update, Delete) operations on resources. Resources are typically represented as JSON or XML data.

                    - @RestController:
                        This annotation is used to mark a class as a REST controller. It combines the functionality of @Controller and @ResponseBody, meaning that every method in the class returns data directly rather than rendering a view.

                    - HTTP Method Mappings:
                        Spring provides convenient annotations like:

                        @GetMapping: Handles HTTP GET requests.
                        @PostMapping: Handles HTTP POST requests.
                        @PutMapping: Handles HTTP PUT requests.
                        @DeleteMapping: Handles HTTP DELETE requests.
                        
                    - Data Binding:
                        Spring REST uses annotations such as @RequestBody to bind incoming request JSON (or XML) data to Java objects, and @PathVariable or @RequestParam to extract values from the URL.

                    - Response Handling:
                        You can use ResponseEntity to have fine-grained control over HTTP response headers and status codes.






    **Imp Terms / Concepts 
    -----------------------

        - POJO 

        - Java Beans 

        - BO / Model - Business Objects - classes which represent a business entity

        - DAO - Data Access Objects - classes which represent logic to communicate with the database

        - Services - classes used to write all the business logic 

        - JPA Entities

        - Spring Beans 



Udemy Course link
------------------------
        https://capgemini.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/






    Web Basics
    ------------------------------

        - HTML 
            - "what" contents you want to show on a webpage 
            - define the structure of the web page

        - CSS - Cascading style sheet 
            - "how" content should appear on the webpage
            - define 'style rules' for the webpages 

        - Bootstrap 
            - html+css+javascript library 
            - it helps to develop responsive UI, provides customizable components like accordion, buttons, navbar

        - JavaScript 
            - scripting language for web browsers 
            - javascript is an 'interpreted language'
            - provides programming capabiltiies 
                - form validation
                - business logic
                - ajax calls / http requests 
                - show/hide elements programmatically
                - control user interaction

            - every browser has 'JS Engine' which is responsible to execute the JS code inside the browser

                - chrome        - V8
                - firefox       - spider monkey 
                - IE            - chakra

            - 1997, javascript was introduced 
            - 1997, it was submitted to ECMA for standardization, ECMA then kept publishing various 'specifications' / 'standards' which every browser has to implement 

            - when the browser implements these 'specifications' it is called 'ECMAScript' 

            - 1997 - ES1

            - 1998  - ES2

            - 1999  - ES3

            - 2009  - ES5

            - 2015  - ES6 - introduced several modern featuers 
                        - classes & objects 
                        - arrow functions 
                        - module system 
                        - object destructuing 
                        - promise API
                        - ..
                        - ..

            - ES.....

        - Javascript tools

                - Babel
                    - js pre-processor
                    - it converts modern js code into legacy js 

                - Webpack
                    - js pre-processor
                    - it converts modern js code into legacy js 
                    - it is also a build tool, it can bundle several js files together 


            var age = 12;           //Number

            age = "twelve"          //String


            function arithAdd(number1, number2){

            }

            arithAdd("one", "two");

            **IMP: in javascript the datatypes are automatically determined based on the value stored in a variable


        - TypeScript 
            - it is a superset of javascript 
            - it is an oject oriented as well as compiled language
            - typescript code is compiled into javascript code before it executes in the browser
            - typescript is typesafe language 

                var age :number = 10;

                let age :number = 34;

                let name :string  = "vishal"

                 function arithAdd(a :number, b :number){

                 }

            arithAdd("one", "two");


        - JQuery 


        - Angular / React / Vue




        ReactJS
        --------------
            - ReactJs a javascript library that helps to develop UI for web applications 
            - it uses component based architecture 


            1. reactjs library 
                - reactjs helps to build 'components'

            2. react-dom library 
                - react-dom library is responsible to render components on the browser

                ReactDOM.render()

            3. Component 
                - a component is a basic building block, which "decribes the UI using JSX" for a particular part of the webpage
                
                - can encapsulate data and view together 

                - in reactjs there are two ways to create a component 

                    a. create a component using "javascript function"
                        -  Function Based component 
                        - 'stateless component'   --->before v16.3
                            *IMP: after React v16.3 - we can store 'state' in functional components as well using the concept of 'hooks'

                        - a component in react is a javascript function that returns JSX code to describe the UI

                        function Course(){
                            return (
                                <div className='course-box'>
                                    <h1>Core Java</h1>
                                    <p>This is some course description</p>
                                    <p>Instructor: Vishal Shah</p>
                                    <p>Start Date: March 17, 2024</p>
                                    <button>Enroll</button>
                                </div>
                            );
                        }

                        function App(){
                            return (
                                <div>
                                    <Course />
                                    <Course />
                                </div>
                            )
                        }

                    b. create a component using 'javascript class'
                        - Class based component 
                        - stateful component 
                        - we can store the 'state' of a component or update the component's 'state' as required
                        - class based components can have 'life cycle methods' which can be used to hook some code logic that executes during diff phases of the component 

                        class MainContent extends React.Component {

                            render(){
                                return (
                                    //jsx code to decribe the UI
                                )
                            }
                        }

            4. JSX 
                - javascript xml
                - it is used to describe the UI in react
                - it is very similar to HTML

            5. Babel  
                - javascript pre-processor
                - it converts the JSX code into it's equivalent JS Code

                    <div>Helloworld</div>           //JSX Code

                    React.createElement("div", null , "Helloworld")     //javascript code


        - ReactJS Features 
            - it uses the concept of "VirualDOM" to efficiently render the UI
            - component reusability 
            - reactjs is highly opiniated 
                - form handling 
                - state handling 
                - aysnc communication / ajax calls / http requests 
                - material design 
                - ...

        - how to create a react applications 
             1. using CRA - 'create-react-app' 

                    - 'create-react-app' is a CLI tool used to build a react application


                    > npm install create-react-app --global

                    > npx create-react-app my-first-project


             2. using react frameworks 

                    a. Next.js 
                        - Next.js is a framework for building web applications using React

                    b. Gatsby 

                    c. TanStack Start (Beta): 

                    d. RedwoodJS:


        **IMP: How the VDOM works
            - React creates an initial VDOM that's a copy of the real DOM. 
            - When a component's state changes, React updates the VDOM. 
            - React compares the updated VDOM to the previous version. This process is called "diffing". 
            - React updates only the changed components in the actual DOM. This process is called "reconciliation". 

        **IMP: Benefits of the VDOM
            - Faster re-rendering: Because the VDOM is in memory, updates are faster than updating the real DOM directly. 
            - Efficient updates: The actual DOM is updated with minimal changes. 
            - Declarative API: You tell React what state you want the UI to be in, and it makes sure the DOM matches that state. 

        State
        ---------
            - a component can have 'state' 
            - 'state' is a way to manage dynamic data within the component 
            - 'state' can be used to store data that you might want to render on the page
            - whenever the 'state' changes, React will re-render the component to reflect the updated values


        **IMP: Type Inference in typescript 
            - process in which it automatically determines the type of a variable, function, or expression based on its value or context.

        **IMP: Object destructuring assignment 

        **IMP: Array destructuring assignment 

        **IMP: in javascript, functions are 'first-class objects'
            - in javascript, 
                - a function can be stored in a variable

                        let arithAdd = () => {

                        }
                - a function can be passed as an argument to another function 

                        someFunction(()=>{})

                        someFunction(arithAdd)

                - a function can also be returned as a value from another function


        useState Hook
        --------------------
            - 'useState' is a hook, which lets you create 'state' in functional components 

               const [stateVariable, setStateFunction] =   useState(initialValue);

            - whenver the component is loaded, it calls the 'useState(initialValue)' which sets up the 'state' for this components with the initial value

        useEffect Hook
        ----------------------
            - used to perform 'Side Effects' - any operation that affects something outside the scope of the function being executed 
                - it is used to fetch data from API
                - perform some actions during the lifecycle of the component 

                useEffect(callback, [dependencies]?);

                useEffect(()=>{

                    //logic to perform the side effects, i.e. fetching data from api

                    return ()=>{
                        //optional
                        //logic to perform some cleaup activities
                    }
                }, [dependencies])


        - routing in React 
        -------------------------
            - install the react router library 

                > npm install react-router-dom


        - form handling in react 
        -------------------------------
            - there are several form handling libraries available, you can use any library or implement the form handling logic yourself 

                - you should be able to validate the inputs in the forms
                - you should be able to capture the form data in the form of a JS object

            - react-hook-form

                    > npm install react-hook-form

            - formik 
            - React Final Form:
            - Redux-form:




        Microservices 
        ---------------------------
            - it is an architectural style where large applications are built as a suite of several small / independent/loosely coupled  applciations (services)
            - each service runs in it's own process and can communicate with other services through http requests 

           Below is an explanation of microservices along with their key features, architecture, and the challenges of monolithic architectures. We then discuss how Spring Boot and Spring Cloud help address these challenges, followed by a brief description of the most commonly used Spring Cloud modules.

            Microservices Overview
            ----------------------------------
            Microservices is an architectural style where a large application is built as a suite of small, independent, and loosely coupled services. Each service runs in its own process and communicates over lightweight protocols (often HTTP/REST).

        Features:
        -------------
            •	Independent Deployment: Each service can be deployed, scaled, and updated without impacting others.
            •	Decoupled Services: Services are designed around business capabilities, allowing for different technologies and databases per service.
            •	Resilience & Scalability: Fault isolation, independent scaling, and distributed architecture increase overall system resilience and flexibility.
            •	Easier Maintenance: Smaller, focused codebases simplify development, testing, and maintenance.



        Architecture of Microservices
            •	Service Decomposition: The application is split into multiple services, each handling a distinct business function.
            •	Communication: Services interact over network protocols (typically RESTful APIs or messaging systems).
            •	Data Management: Each service usually manages its own database, promoting loose coupling.
            •	Infrastructure Components: Common functionalities like authentication, configuration, logging, and monitoring are externalized and shared across services.


        Problems with Monoliths
            •	Tight Coupling: In a monolithic architecture, all components are tightly integrated, making changes in one area risk affecting the entire application.
            •	Scalability Challenges: Scaling a monolith means scaling the entire application, even if only one component requires additional resources.
            •	Deployment Issues: A small change in the codebase requires rebuilding and redeploying the whole application.
            •	Complexity: As the application grows, the codebase becomes harder to understand, maintain, and test.


Spring Boot and Microservices

Spring Boot simplifies the creation of production-ready microservices by providing:
	•	Opinionated Defaults: Auto-configuration and embedded servers allow rapid development.
	•	Standalone Applications: Create self-contained applications with minimal setup.

Spring Cloud builds on Spring Boot to address microservices challenges by offering a suite of tools for:
	•	Service Discovery: Automatically locating services, registers the services in a distributed environment.
	•	Load Balancing: Distributing requests evenly across instances.
	•	Centralized Configuration: Managing configuration properties for multiple services.
	•	Fault Tolerance: Implementing circuit breakers and fallback strategies.
	•	API Gateway: Routing requests to appropriate services and handling cross-cutting concerns.

        Spring Cloud Modules (Most Used)
            •	Spring Cloud Netflix / Eureka Server:
                    A service discovery module that enables microservices to find and communicate with each other without hard-coded IP addresses or hostnames.
            •	Ribbon:
                    A client-side load balancing module that distributes requests among service instances for improved resilience and scalability.
            •	Open Feign:
                    it helps to communicate between services 
                    A declarative REST client that simplifies calling remote services by abstracting the HTTP client layer.
            •	Hystrix / Resilience4j
                    A circuit breaker module that helps control the interactions between services, providing fallback logic and preventing cascading failures.
            •	Zuul / Spring Cloud Gateway
                    An API Gateway that routes incoming requests to the appropriate microservice and handles cross-cutting concerns such as authentication and logging.
            •	Spring Cloud Config:
                    Centralized configuration management that allows you to manage external properties for applications across all environments.
            •	Sleuth:
                    Distributed tracing for microservices that helps in logging and debugging by tracking requests across service boundaries.

        Summary

        Microservices offer significant advantages over monolithic architectures, such as independent deployment, scalability, and resilience. However, they also introduce new challenges like service discovery, load balancing, and centralized configuration. Spring Boot provides a solid foundation for building microservices, and Spring Cloud offers specialized modules (like Eureka, Ribbon, Feign, Hystrix, Zuul, Config, and Sleuth) to address these challenges effectively. Each module is designed to solve a specific problem in a microservices architecture, making it easier to build robust, scalable, and maintainable distributed systems.