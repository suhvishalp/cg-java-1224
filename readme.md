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















    Imp Terms / Concepts 
    -----------------------

        - POJO 

        - Java Beans 

        - JPA Entities

        - Spring Beans 



Udemy Course link
------------------------
        https://capgemini.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/



