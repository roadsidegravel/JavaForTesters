public class Notes {
    //pg 94
}
//single comment
/*
block comment
 */
/**
 *  JavaDoc comment
 *  is what shows when you press ctrl q (ctrl j) on a method
 */
// alt Enter op dingen voor importeren context menu
// bij assertEquals message, dan expected value dan de getestte value
// assertEquals("2+2=4", 4, answer );
/* to run the @test methods
    rightclick MyFirstTest.java then select run
        in either project hierarchy or code editor
    ctrl shift F10

    afh van waar ge op rightclickt of select en dan ctrl shift F10
    kunt ge alle tests runnen, één class runnen, één method runnen,...

    kunt ook vanaf de command line
    command prompt openen, naar de juiste folder gaan (project root (pom.xml locatie))
    mvn test
 */
/*                  windows             mac
Create New          alt + insert        ctrl + n
Intention Actions   alt + enter         alt + enter
Intention Actions   alt + return        alt + return
Run JUnit Test      ctrl + shift + F10  ctrl + shift + F10
 */
//JUnit heeft geen Test vanvoor of vanachter nodig in de naam
//maven wel, maven wilt dat hebben en waarom ook niet he

// ctrl p (win) of cmd p (mac) in de class parameters bv Integer( hiere )
// toont alle contructors die ge kunt doen, voor Integer int of String
// kunt vandaar dan bv alle constructors nekeer testen

// classnaam. en dan ff wachten, geeft de IDE u alle static methods
//    op een dag uitzoeken hoe ge dat met code doet om een list van alle methods te hebben
// ctrl q (win) ctrl j (mac) voor de help file per method
// kunt natuurlijk ook in de documentatie kijken voor de class

// ctrl click on the method to read the source

/*
When writing the @Test methods you need to keep the following in mind:
write just enough code to trigger the functionality
ensure you write assertion statements that cover the functionality well and are
readable
experiment with ‘odd’ circumstances
 */

/*
So the assertEquals is actually equivalent to:
assertTrue(firstItem.equals(secondItem));
is not the same as ==
different objects can have the same value but be different instances
equals() compares the values
== checks if they're the same instance
 */

// you can access the static methods on a class without instantiating it
// Integer.equals(...)

/*
We have a number of possible object groupings when writing automation code, the
following is one I use a lot:
Physical
    Application
        e.g. login page, navigation menu
    Environmental
        e.g. installed URI, port
Logical
    Domain Entities
        e.g. user, account
 */

// recommends book 'Domain Driven Design' (Eric Evans)
// https://www.domainlanguage.com/ddd/
// https://en.wikipedia.org/wiki/Domain-driven_design

// this keyword refers to the current object

/*
public            accessible to any class that imports the parent class
protected         accessible to any class in the same package, or any subclass
private           accessible to methods in the class
package-private   when no modifier is used then the field or method is accessible to
the class and any class in the same package (this is the default)
 */

/*
static - the field or method exists at the class level, not the instance level, so is
shared by all instances and can be accessed without needing to have an instantiated
class variable.
final - once the field has a value it cannot be changed
 */

//public static final   often how constants are done

/*
Names tend to use camel case and start with a lowercase letter. Constants tend to be all
uppercase, with ‘_’ to delimit words.
has to tart with unicode character representing a letter (kinda? ook andere)
    a-z,A-Z,_,$,...
daarna mogen er cijfers in
 */

// you can use the package path instead of importing
// org.junit.Assert.assertEquals(...)
// wordt snel lang en gedoe, maar kan nuttig zijn om ze uiteen te houden
// * voor import all classes from package
// import ...*
// import org.junit.Assert; (de class)
// import static org.junit.Assert.assertEquals; (de method)

// BigDecimal if you want precision, for use with currency and such
// float (32 bit) en double (64 bit) kan rounding errors hebben

// % integer remainder calculations
// +,-,/,*,%
// +=,-=,/=,*=,%=
// ++,-- increment or decrement the variable
// ++variable increment first, then use (prefix)
// variable++ use first, then increment (postfix)

// && logical and
// || logical or
// both shortcut, only check the second one when necessary

// check, if true return first, if false return second
// condition ? operand1 : operand2;
// a >= b ? true : false;

// can do binary bitwise operations on Integer
// & and, | or, ^ xor, ~ invert the bits
// &=, |=, ^=, ~=
// bit shift
// <<3 shift 3 to the left
// >> shift to the right
// >>> shift a zero into leftmost position

// volgorde bewerkingen (operator precedence)
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
// nested are executed first (...(...))

// Strings are immutable, stuff that looks like it changes a String,
// actually returns a new String

// arrays have a fixed size
// the [] can be in various places, but just use after the name
// int[] integers = new int[10];
// int []moreInts = new int[10];
// int evenMore[] = new int[10];
// int[] ints1to10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

/*
for ( initialize statement executed once; loop condition; executed after each loop){
// do something
}
 */


