public class Notes {
    //pg 60
}
//single comment
/*
block comment
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