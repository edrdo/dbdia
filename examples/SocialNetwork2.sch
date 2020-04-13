/*
 dbdia example - more elaborated "social network" - relational schema
 Eduardo Marques
 https://github.com/edrdo/dbdia
*/
table USER
(
  _ Num _ int, 
  Login varchar,
  Name varchar,
  Joined date, 
  BirthDate date,
  Sex enum,
  Phone ? int,
  Email varchar
)

table FOLLOWS
(
  _ Followed _ --> USER.Num,
  _ Follower _ --> USER.Num
)

table POST 
(
  _ Num _ int,
  Author int --> USER.Num,
  Creation datetime,
  Content text
)

table HASHTAG
( 
  _ Post _ int --> POST.Num,
  _ Tag _ varchar
)

table POST_LIKED
(
  _ User _ int --> USER.Num,
  _ Post _ int --> POST.Num
)

table COMMENT
(
  _ Post _ int --> POST.Num,
  _ Order _ int ,
  Author int --> USER.Num,
  Creation datetime, 
  Content text
)

