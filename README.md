kawa-spark
==========

Clojure is de facto the best lispy JVM language but that doesn't mean there aren't other  projects worth exploring, right…? One of them is an old but actively developed (AFAIK) implementation of Scheme called [Kawa](http://www.gnu.org/software/kawa/index.html). 

There is also a lovely small microframework for writing RESTful web apps using Java called [Spark](http://www.sparkjava.com/) (not to be confused with the big data analytics engine …which is also cool, btw).

So how about we put them together to allow ourselves to quickly write REST endpoints while enjoying the zen of Scheme? Well, that's what this small proof-of-concept project is all about.

Howto
-----
Put the Kawa JAR to your local Maven repo (or deploy it somewhere - it's not in any of the public repos AFAIK), run `mvn clean install exec:java` and browse to [http://localhost:4567/test](http://localhost:4567/test)
