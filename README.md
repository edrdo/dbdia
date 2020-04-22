# dbdia

__Author: [Eduardo R. B. Marques](https://github.com/edrdo)__

__dbdia__ is open-source software under the terms of the __Apache License 2.0__.

## Summary

__dbdia__ is a diagram generator for database __Entity-Relationship (ER)__ models
and __relational schemas__. 

Diagrams are expressed using a domain-specific language
that is translated to image format (PNG, PDF, SVG, ...) using the __dot__ tool from __[Graphviz](https://graphviz.org)__ . 

The visual syntax employed by __dbdia__ in ER and relational diagrams  mostly follows the conventions of the __[Fundamentals of Database Systems, 7th edition](https://www.pearson.com/us/higher-education/program/Elmasri-Fundamentals-of-Database-Systems-7th-Edition/PGM189052.html)__  textbook by Ramez Elmasri and Shamkant B. Navathe.

## Run dbdia online using a Colab notebook

[![Open In Colab](https://colab.research.google.com/assets/colab-badge.svg)](https://colab.research.google.com/github/edrdo/dbdia/blob/master/src/main/colab/dbdia.ipynb)

## DSL used for ER models and relational schemas

Check [__here__](/DSL.md) for a description of the DSL used by dbdia.

## Examples

Check the __examples__ directory in this repository or in the dbdia release archive.
The examples can be also be tested directly in the Colab notebook. 

![Example ER model](/examples/SocialNetwork2_er.svg)
![Example Schema](/examples/SocialNetwork2_sch.svg)

## Download, install, and use

### Dependencies

- A Java runtime environment, version 8 or higher.
- [Graphviz](https://graphviz.org)

The following should work with recent versions of Ubuntu:

```
sudo apt install default-jre
sudo apt intall graphviz
```

### Install

- Download the ZIP of the latest release [here](https://github.com/edrdo/dbdia/releases/download/0.3/dbdia-0.3-release.zip).
- Unzip it to some folder __<DBDIA_PATH>__
- The __dbdia__ script (for Linux/MacOS/POSIX) and the __dbdia.bat__
variant for Windows can be found in __<DBDIA_PATH>/bin__. 
It may be convenient to add __<DBDIA_PATH>/bin__ to your __PATH__ environment.

### Usage

```
dbdia [-option1=value1 ... -optionk=valuek] <typeOfDiagram> inputFile outputFile
```

__Diagram types__

- `er`: full ER diagram including entities, entity attributes, and relationships;
- `ent`: ER diagram including entities and their attributes only;
- `rel`: ER diagram excluding entity attributes;
- `sch`: relational schema diagram.

__Options__

- Type `dbdia help` for a list of options.

## Compiling from scratch

Requirements:

- Java JDK (OracleJDK or OpenJDK) for Java 8 or higher
- Maven 3.x 

Commands:

```
git clone git@github.com:edrdo/dbdia.git
cd dbdia
mvn package 
```
