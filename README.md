# Java

## Task 1 Marks 30
1. Create a package of your name.
2. Inside the package creates three classes. The name of the classes will be Main, Info,
Hobby.
3. Info class will have two variables titled name(String) and id(integer).
4. Place only one variable inside the Hobby class. The name of the variable will be
hobbyName(String).
5. Inside the main method of the Main class creates a variable section(String). Take the
input of the section variable from the user.
6. Create the object of both the Info & Hobby class.
7. Print the section, name, id, and hobbyName of the user.
8. Apply camel coding.
9. Must follow the rules of naming convention.
10. Inside every class write your name, id, section, email, and date using multiline comments.

Submission Process

1. Import whole project into google drive. The name of the folder will be Task 1. Then share
the link with me through the classroom assignment section.
2. Use the google drive of your official student mail.
3. Late submission means no marking. Be careful.

## Task 2 Marks 30
1. Create a package of your name.
2. Inside the package creates two classes. The name of the classes will be Main, Student.
3. Student class will have two instance variables titled name(String) and id(integer) and
one class variable universityName(String).
4. The student class will have a default constructor and two parameterize constructors to
implement the constructor overloading.
5. Apply this keyword to avoid variable hiding.
6. Create a method display(void) to print the university name.
7. Create three objects of the Student class. Each object will be initialized using a different
constructor.
8. Apply camel coding.
9. Must follow the rules of naming convention.
10. Inside every class write your name, id, section, email, and date using multiline comments.

Submission Process

1. Import whole project into google drive. The name of the folder will be Task 2. Then share
the link with me through the classroom assignment section.
2. Use the google drive of your official student mail.
3. Late submission means no marking. Be careful.


## Task 3 Marks 30

1. Create a package of your name.
2. Inside the package create five classes. The name of the classes will be Main, Sports,
Cricket, Football, Player.
3. Sports is a parent class here. It will have a default constructor printing “Sports class
called”.
4. Cricket class will inherit Sports class. It will have two instance variables:
matchType(String), over(int), and reference type of Player class. Create a parameterized
constructor to initialize them.
5. The Player class will have two instances variables: playerName(String),
jerseyNumber(int). Create a parameterized constructor to initialize them too.
6. Create a method display(void) to print the match type, over of the match, name of a
player, and jersey number of a player.
7. Football class will inherit Sports class as well. Construct a default constructor and print
"Football class called". Also, call the superclass constructor explicitly.
8. Main class will act as a driver class. Create an object of Cricket class and pass the
values: International match, 20, Shakib, 75 in the constructor. Create an object of
Football class as well.
9. Apply camel coding.
10. Must follow the rules of naming convention.
11. Inside every class write your name, id, section, email, and date using multiline comments.

Topics here: Inheritance, Aggregation, Super Keyword

Submission Process

1. Import whole project into google drive. The name of the folder will be Task 3. Then share
the link with me through the classroom assignment section.
2. Use the google drive of your official student mail.
3. Late submission means no marking. Be careful.

## UML Class Diagram

![2012020072](https://user-images.githubusercontent.com/56092072/134782449-220ecb98-d6f1-40e0-87ea-ba594ae3621e.png)
Create a class Gadget that has two instance variable name (String-public), price (int-public), and
a constructor to initialize them. Write a method aboutGadget() that prints a welcome message.
Create another class Laptop that inherits from Gadget. Write a constructor Laptop() that sets the
price as 50,000 by calling a superclass constructor. Create another class of your name, i.e AAC.
It will extend the Laptop class. AAC() will set the name of the laptop as MSi. Override
aboutGadget() method to provide a full description of the gadget.
Topics here: Inheritance
Submission Process

1. Write your ID below the diagram
2. Extract pdf of the diagram from draw.io
3. Attach the pdf file on the classroom
4. Pdf name will be your ID
5. Late submission means no marking. Be careful.


## Task 4 Marks 30
You are given an interface AdvancedArithmetic which contains two methods: int divisorSum(int
n) and int findFactorial(int n). You need to write a class called MyCalculator which implements
the interface.
'''
● divisorSum method just takes an integer as input and returns the sum of all its divisors.
For example divisors of 6 are 1, 2, 3, and 6, so divisorSum should return 12. The value of
n will be at most 100.
● findFactorial method takes an integer as input and returns its factorial value. Use
bigInteger library to perform this. (n<=50)
'''
