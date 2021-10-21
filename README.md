
[![License: Apache 2.0](https://img.shields.io/github/license/edrdo/dbdia)](https://github.com/edrdo/dbdia/blob/master/LICENSE.txt)
[![GitHub release](https://img.shields.io/github/v/release/edrdo/dbdia)](https://github.com/edrdo/dbdia/releases)
[![Travis build Status](https://api.travis-ci.org/edrdo/dbdia.png?branch=master)](https://travis-ci.org/edrdo/dbdia)

# dbdia

__Author: [Eduardo R. B. Marques](https://github.com/edrdo)__

__dbdia__ is open-source software under the terms of the __[Apache License 2.0](https://github.com/edrdo/dbdia/blob/master/LICENSE.txt)__.

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

### Entity definitions

```
EntityName 
(
  _ KeyField _,
  OptionalField ?,
  . DerivedField ., 
  { MultiValueField },
  CompositeField ( SubField1, { SubField2 }, SubField3 ?, . SubField4 .),
  { ComplexField(SubField1, SubField2(SubField21, SubField22)) } 
)
```
![Entity example](/examples/Entity.svg)

### Relationship definitions

```
EntityA ( ) // with no attributes (just for convenience)
EntityB ( ) // you can in any case ommit attributes in diagrams
EntityC ( ) // using the 'rel' diagram type generation

// Relationship: Rel1 
// Entities involved: EntityA and EntityB
// Cardinality: 1 to N
// Participation: partial for EntityA, total for EntityB
// Relationship attributes: none

EntityA --- 1 --- < Rel1 > === N === EntityB

// Relationship: Rel2
// Entities involved: EntityA and EntityB
// Cardinality: M to N
// Participation: partial for both entities
// Relationship attributes: none

EntityA --- M --- < Rel2 > --- N --- EntityB

// Relationship: Rel3
// Entities involved: EntityA and EntityC
// Cardinality: 1 to 1
// Participation: total for EntityA, partial for EntityC
// Relationship attributes: Rattr1, { RAttr2 } as shown.

EntityA === 1 === < Rel3( RAttr1, { RAttr2 } )> --- 1 --- EntityC
```
![Relationship example](/examples/Relationships.svg)

### Relational schema definitions

```
table A
(
  _ PrimaryKey _,
  PlainField, 
  OptionalField ?, 
  ForeignKey1 --> A.PrimaryKey,
  ForeignKey2 --> B.PrimaryKey
)

// Type info is optional - this table has type annotations per each field
// Any identifier is accepted for the type designation.
table B
(
  _ PrimaryKey _ int, 
  PlainField varchar
) 
```
![Schema example](/examples/Schema.svg)


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

- Download the ZIP of the latest release [here](https://github.com/edrdo/dbdia/releases).
- Unzip the release archive to some folder __<DBDIA_PATH>__
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
