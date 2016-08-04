/**
 * Defining loose / ad-hoc closures and functions in a script and then importing
 * them in another.
 */


import test

//Doesn't Work
//test.printit("Hello")

//Doesn't Work
//print new test().printit("Hello")

//Works
test.printthat("Hello")

//Doesn't Work
//print new test().printit("Hello")
