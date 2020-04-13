grammar DSL;

@header {
package dbdia.antlr;
}

root: entRelModel | relationalSchema;

// ENTITY-RELATIONSHIP MODEL

entRelModel: entRelModelItem*;

entRelModelItem: ent=entity | rel=relation | we=weakEntity;

entity: name=ID '(' (entityField (',' entityField)*)? ')';

weakEntity: parent_entity=ID 
            parent_entity_part=parentEntityPart
            '<<' idrel=ID '>>'
            dependent_entity=entity ; 
            
parentEntityPart:
    part='-' '-'*
  | part='=' '='*;
  
relation: entityA=ID constrA=relationConstraints
          '<' name=ID ('(' nonKeyField (',' nonKeyField)* ')')? '>' 
          constrB=relationConstraints entityB=ID ;

relationConstraints: 
    part='-' '-'* card=('1' | 'M' | 'N') '-'+
  | part='=' '='* card=('1' | 'M' | 'N') '='+;

entityField : 
     keyField
  |  nonKeyField;
  
nonKeyField:
    simpleField
  | optionalField
  | derivedField
  | compositeField
  | multivalueField;

keyField: 
  '_' name=ID '_' ;  
simpleField: 
  name=ID; 
optionalField: 
  name=ID '?';
derivedField:
  '.' name=ID '.';
compositeField : 
  name=ID '(' nonKeyField (',' nonKeyField )*  ')'  ; 
multivalueField: 
  '{' (simpleField | compositeField) '}' ;

// RELATIONAL MODEL

relationalSchema: relationalSchemaItem*;

relationalSchemaItem: tableDefinition;

tableDefinition: 
  'table' name=ID '(' tableField (',' tableField)* ')';

tableField: 
  field=tableFieldBaseDef
  type=tableFieldTypeInfo?  
  ref=tableForeignKeyReference?;
  
tableFieldBaseDef returns [ String nameOfField ]:
    kf=tableKeyField { $nameOfField = $kf.nameOfField; }
  | of=tablePlainField { $nameOfField = $of.nameOfField; }
  | pf=tableOptionalField { $nameOfField = $pf.nameOfField; }
;
  
tableKeyField returns [ String nameOfField ] :
  '_' name=ID '_' { $nameOfField = $name.getText();} ;
   
tableOptionalField returns [ String nameOfField ]:
  name=ID '?' { $nameOfField = $name.getText();};
  
tablePlainField returns [ String nameOfField ]: 
  name=ID { $nameOfField = $name.getText();} ; 
  
tableFieldTypeInfo:
  (':' type=ID)?;
tableForeignKeyReference: 
  '-->' table=ID '.' field=ID;

// TOKENS

ID: [\p{Alpha}\p{General_Category=Other_Letter}_] [\p{Alnum}\p{General_Category=Other_Letter}_]*  ;


// COMMENTS
BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;
    
// WHITE SPACE
UNICODE_WS : [\p{White_Space}] -> skip;

