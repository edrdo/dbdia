/*
 dbdia example - simple "social network" - relational schema
 Eduardo Marques
 https://github.com/edrdo/dbdia
*/
table USER
(
  _ Login _,
  Name,
  Email
)

table FOLLOWS
(
  _ Followed _ --> USER.Login,
  _ Follower _ --> USER.Login
)

table POST 
(
  _ Id _,
  Author --> USER.Login,
  Text
)

table HASHTAG
( 
  _ Post _ --> POST.Id,
  _ HashTag _
)

table LIKES 
(
  _ User _ --> USER.Login,
  _ Post _ --> POST.Id
)

table COMMENT
(
  _ Post _ --> POST.Id,
  _ Order _ ,
  Author --> USER.Login,
  Text 
)

