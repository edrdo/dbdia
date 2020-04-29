# dbdia DSL reference

This document provides a summary of the domain-specific language recognized by __dbdia__ to define relational schemas and ER models (you may also have a look at the actual [ANTLR grammar](/src/main/antlr/DSL.g4) in use).

## General aspects

### Comments

C-style comments can be used.

```
... // single-line comment 

/*
 multi-line 
 comment 
*/
```

### Identifiers

```
ID: 
    [Alpha|\_] (Alpha|Digit|\_)* 
```

__Notes:__ 

- You can use Unicode letters with accents. 
- Primary key fields in relationship schemas or key fields in an ER model (see below) have the form __`_ fieldName _`__. In these cases, the __`_`__ (underscore) characters at the beggining and the end must be separated from the identifier by white space, given that __`_`__ may also be part of an identifier. This is a deliberate feature for now (though obviously not very elegant in grammatical terms).  

### Semantic checks

dbdia performs a few semantic checks:

- You can not define the same symbol twice at the same level of scoping. An error is issued if you try to define two entities/relationships with the same name in an ER model, and similary for tables in relational schemas, fields in tables or entities, etc.
- You can not make a reference to an undefined symbol. Forward references are allowed though.

## Relational schemas

```
relationalSchema: 
    tableDefinition*

tableDefinition: 
    'table' name_of_table=ID '(' tableField (',' tableField)* ')'

tableField: 
    (primaryKeyFieldDef | optionalFieldDef | plainFieldDef)  
    type_identifier=ID?              // optional identifier for field type
    ('-->' table=ID '.' field=ID)?   // optional foreign key reference 
  
primaryKeyFieldDef:
    '_' name=ID '_' 

optionalFieldDef: // for optional (i.e. nullable) fields
    name=ID '?'     

plainFieldDef: 
    name=ID        
```

[__Basic example__](/examples/Schema.sch)


## ER models

```
entRelModel: 
  entRelModelItem*
  
entRelModelItem: 
    entity          // Entity type
  | relationship    // Relationship
  | weakEntity      // Weak entity type
```

### Entitity types

```
entity: 
  name=ID '(' fields=(entityField (',' entityField)*)? ')'
  
entityField : 
    keyField
  | nonKeyField
  
nonKeyField:
    simpleField
  | optionalField
  | derivedField
  | compositeField
  | multivalueField
  
keyField: 
    '_' name=ID '_' 
    
simpleField: 
    name=ID
    
optionalField: 
    name=ID '?'
  
derivedField:
    '.' name=ID '.'
  
compositeField : 
    name=ID '(' subfields=(nonKeyField (',' nonKeyField )*) ')'  
  
multivalueField: 
    '{' (simpleField | compositeField) '}' 
  
```

[__Basic example__](/examples/Entity.er)

### Relationships

```
relation: 
  entityA=ID 
  constrA=relationshipConstraints
  '<' name=ID ('(' nonKeyField (',' nonKeyField)* ')')? '>' 
  constrB=relationConstraints 
  entityB=ID
  
relationshipConstraints:
    '-'+ ('1' | 'M' | 'N') '-'+  // '-' indicates partial participation
  | '='+ ('1' | 'M' | 'N') '='+  // '=' indicates total participation   
  
```

[__Basic example__](/examples/Relationships.er)

### Weak entitity types

```
weakEntity: 
    name_of_identifying_entity=ID 
    ('-'+ | '='+)      // parcial or total participation by identifying entity 
    '<<' name_of_identifying_relationship=ID '>>'    
    weak_entity=entity // the actual weak entity type (defined like an entity type)
```

[__Basic example__](/examples/WeakEntities.er)


