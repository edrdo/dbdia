
table A
(
  _ primaryKey _,
  plainField, 
  optionalField ?, 
  foreignKey1 --> A.primaryKey,
  foreignKey2 --> B.primaryKey
)

table B
(
  _ primaryKey _,
  plainField
) 
  
