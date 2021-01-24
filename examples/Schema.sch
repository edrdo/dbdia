/*
 dbdia example - basic aspects of relational schema definition
 Eduardo Marques
 https://github.com/edrdo/dbdia
*/

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
