/**
 * Defining loose / ad-hoc closures and functions in a script and then importing
 * them in another.
 */

//Doesn't work when called from another class!
def printit = { a ->
  println "Printing: " + a
}

//Works when called from another class!
static def printthat(a){
  println "Printing: " + a
}

//These commands aren't run when importing.
printit("Hello!!!")
printthat("Hello :D")
