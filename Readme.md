[![Build Status](https://travis-ci.com/StratfordHS-CS2/lab-09-strings-review-username.svg)](https://travis-ci.com/StratfordHS-CS2/lab-09-strings-review-username)

# Lab 09 - Strings Review

## Lab Goal
This lab was designed to give you more practice working with many aspects of Strings.

## Instructions
* Complete the following methods.
  * `countUpString()`
  * `countDownString()`
  * `cheerName()`
  * `firstLast()`
  * `firstFive()`
  * `middleString()`
  * `spaceLocations()`
  * `main()` - Edit this to add tests of your own for each method.
  * Complete a javadoc comment with the proper tags (`@param` and `@return`) for each method.

## Sample Output
```
// output from countUpString( 10 )
We're number 0
We're number 1
We're number 2
We're number 3
We're number 4
We're number 5
We're number 6
We're number 7
We're number 8
We're number 9
We're number 10

// output from countDownString( 10 )
We're number 10
We're number 9
We're number 8
We're number 7
We're number 6
We're number 5
We're number 4
We're number 3
We're number 2
We're number 1
We're number 0

// output from cheerName( "Avis" )
Way to go Avis!

// output from firstLast( "Mr.", "Avis" )
Mr. Avis

// output from firstFive( "A long random string." )
A lon

// output from firstFive( "abc" )
ERROR

// output from middleString( "Computer Science", 2, 5 )
mput

// output from spaceLocations( "A long string of text." )
1 6 13 16 
```
  
## Relevant ThinkJava Section
* [Strings](http://greenteapress.com/thinkjava6/html/thinkjava6010.html)

## Potentially Helpful Methods
* `String.substring()`
* `String.length()`
* `String.equals()`
* `String.charAt()`
* `String.indexOf()`
* `Character.toString()`
* [All String methods](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
* [All Character methods](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html)

## Notes
* The Checkstyle config url is http://www.daveavis.com/cs/checkstyle_SHS.xml
* Make sure you modify the link at the top of your **Readme.md** to reflect your username if you want the badge at the top to represent the status of your code.

## Grading
* 12 - `countUpString()`
* 12 - `countDownString()`
* 10 - `cheerName()`
* 10 - `firstLast()`
* 12 - `firstFive()`
* 12 - `middleString()`
* 12 - `spaceLocations()`
* 10 - `main()`
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
