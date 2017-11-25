[![Build Status](https://travis-ci.org/sanskrit-coders/indic-transliteration.svg?branch=master)](https://travis-ci.org/sanskrit-coders/indic-transliteration)

Table of content generated using [this app](https://tableofcontents.herokuapp.com/):

- [Introduction](#introduction)
- [Users](#users)
  - [Library users](#library-users)
    - [Built output](#built-output)
    - [Some known users](#some-known-users)
- [Contributors](#contributors)
  - [Setup](#setup)
  - [Deployment](#deployment)
    - [Regarding **maven targets** in intellij](#regarding-**maven-targets**-in-intellij)
    - [Releasing to maven.](#releasing-to-maven.)
    - [Building a jar.](#building-a-jar.)
  - [Technical choices](#technical-choices)
    - [Scala](#scala)

# Introduction
A collection of scala and java classes for some basic character level processing for the Sanskrit and other Indic (kannada, telugu, etc..) languages, contributed by the open source sanskrit-coders projects and friends.
Some notable facilities:
* Transliterate text from one script or encoding scheme to another.

# Users
## Library users
* Maven repository [here](http://search.maven.org/#search%7Cga%7C1%7Ca%3A%22indic%22) .
* Last update : 2017-05-??

### Built output
* Final jar files
  * out/*.jar [all modules in intellij project]
  * target/*.jar [includes sources and javadocs in separate jars. indic-transliteration module only]
* Classes
  * out/production/*/ [Modules other than indic-transliteration.]
  * target/ [sanskritnlp module output.]

### Some known users
* [stardict-sanskrit]() and sister stardict-.* projects.

## Libraries in other languages
- For python: [indic-transliteration pip](https://pypi.python.org/pypi/indic-transliteration) .
- For Java / Scala: [indic-transliteration](https://search.maven.org/#search%7Cga%7C1%7Ca%3A%22indic-transliteration%22) maven.
- For JS:
  - [sanscript](https://github.com/sanskrit/sanscript.js/blob/3e109b09d0e69de1afb166ebd4d1ffb4e340a0c3/sanscript/sanscript.js) .
  - [salita](https://github.com/mbykov/salita) - limited to a few Roman transliterations and devanAgarI.
- PHP: [Dicrunch ](https://github.com/nareshv/aksharamukha/tree/master/diCrunch) and its use by [akSharamukhA](https://github.com/nareshv/aksharamukha/blob/master/transliterate.php) .

# Contributors
## Setup
* Strongly recomment Intellij Idea IDE.
  * Just point it to the IML file files.
  * If it complains about missing maven dependencies:
     * just open the *Maven projects* widget, refresh and do a full build.
     * Also try Maven -> reimport and *synchronoze* actions in the context menu.
* There may also be eclipse files which haven't been used in a long time.

## Deployment
### SBT:
- Use sbt command `release` to publish to maven repos.
- You should be able to use it roughly immediately; and after many hours you should see at maven repo listings [here](https://mvnrepository.com/artifact/com.github.sanskrit-coders). 

### Building a jar.
* Simplest way is to set up a build artifact in intellij IDea.

## Technical choices
### Scala
* One can write much more concise code (1/4th to 1/3rd relative to Java and 3/4ths to 5/6ths relative to Python, according to [this](http://bcomposes.com/2012/03/01/student-questions-about-scala-part-2/) )
  * For example, the ease with which one can iterate in scala using higher order functions (the maps, filters and zips above) available with scala's excellent collections library.
* while not sacrificing the ability to use java libraries, and readability/ speed of java.
* It is increasing in popularity relative to competitors : scala vs clojure ( [Google trends](https://trends.google.com/trends/explore?date=all&q=Scala%20tutorial,Clojure%20tutorial) ), scala vs julia ( [Google trends](https://trends.google.com/trends/explore?date=all&q=Scala%20tutorial,Julia%20tutorial) ).
* [Here](http://bcomposes.com/2011/08/22/first-steps-in-scala-for-first-time-programmers-part-1/) is a good series of blog posts which provide an introduction to Scala.
