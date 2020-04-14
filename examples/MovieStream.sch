
/*
 dbdia example - MovieStream database (https://www.dcc.fc.up.pt/~edrdo/aulas/bd/teoricas/bd_movie_stream.pdf)
 Eduardo Marques
 https://github.com/edrdo/dbdia
*/
table MOVIE 
( 
  _ MovieId _ int, 
  Title varchar, 
  Duration int,  
  Year year
)

table ACTOR 
( 
   _ ActorId _ int, 
   Name varchar
)

table GENRE 
( 
  _ GenreId _ int, 
  Label varchar
)

table MOVIE_ACTOR 
( 
  _ MovieId _ int --> MOVIE.MovieId, 
  _ ActorId _ int --> ACTOR.ActorId
)

table MOVIE_GENRE 
( 
   _ MovieId _ int --> MOVIE.MovieId, 
   _ GenreId _ int --> GENRE.GenreId
)

table STREAM 
(
  _ StreamId _ int, 
  MovieId int   --> MOVIE.MovieId, 
  CustomerId int --> CUSTOMER.CustomerId,
  StreamDate datetime,
  Charge float
)

table CUSTOMER
(
  _ CustomerId _ int, 
  Name varchar,
  Address varchar, 
  City varchar, 
  PostalCode varchar, 
  Country varchar --> COUNTRY.Name,
  Email varchar, 
  Phone ? int, 
  Active bool
)

table COUNTRY
(  
  _ Name _ varchar,
  RegionId int --> REGION.RegionId
)

table REGION
(  
  _ RegionId _ int, 
  Name varchar,
  RegionManager int --> STAFF.StaffId
)

table STAFF 
(
  _ StaffId _ int,
  Job varchar,
  Supervisor int --> STAFF.StaffId,
  Name varchar
)

table DEPARTMENT
(
   _ DepId _ int,
   Name varchar,
   Manager int --> STAFF.StaffId 
)
