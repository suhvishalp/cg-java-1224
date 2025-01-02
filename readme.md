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


        - Interfaces




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














    Imp Terms / Concepts 
    -----------------------

        - POJO 

        - Java Beans 

        - JPA Entities

        - Spring Beans 



Udemy Course link
------------------------
        https://capgemini.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/




        56 3 5 23 5 23 107 23 10 120 20 20 403 30 10 43 20 15 10 5 12 16 21 12


        40 target

