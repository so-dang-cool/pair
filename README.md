[![Maven Central](https://img.shields.io/maven-central/v/so.dang.cool/pair.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22so.dang.cool%22%20AND%20a:%22pair%22)
[![Javadoc](https://javadoc.io/badge2/so.dang.cool/pair/javadoc.svg)](https://javadoc.io/doc/so.dang.cool/pair)
![License](https://img.shields.io/github/license/hiljusti/pair)

![GitHub repo size](https://img.shields.io/github/repo-size/hiljusti/pair)
![jar size](https://img.shields.io/badge/jar_size-5.2_kB-blue)
![dependency count](https://img.shields.io/badge/dependencies-0-blue)

# Pair

A simple pair and drop-in shim for the beloved `javafx.util.Pair` that was
included in JDK 8. (And is still available in the [JavaFX project](https://openjfx.io/))

- [`so.dang.cool.Pair<L, R>`](https://javadoc.io/doc/so.dang.cool/pair/2.2/so/dang/cool/Pair.html)
- [`javafx.util.Pair<L, R>`](https://javadoc.io/doc/so.dang.cool/pair/2.2/javafx/util/Pair.html)

Note: The shim provided here is not exactly-equal (e.g. the hashCode() is not
hand-written), but _is_ equivalent in the sense that it has the same package
path, class, method names, and behavior as the prior class. For reference,
[javadocs for the original](https://docs.oracle.com/javase/8/javafx/api/javafx/util/Pair.html).

---

2022, MIT License

J.R. "hiljusti" Hill
