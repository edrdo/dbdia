
table MOVIE 
( 
  _ MovieId _, 
  Title, 
  Duration, 
  Year 
)

table ACTOR 
( 
   _ ActorId _, 
   Name 
)

table GENRE 
( 
  _ GenreId _, 
  Label 
)

table MOVIE_ACTOR 
( 
  _ MovieId _ --> MOVIE.MovieId, 
  _ ActorId _ --> ACTOR.ActorId
)

table MOVIE_GENRE 
( 
   _ MovieId _ --> MOVIE.MovieId, 
   _ GenreId _ --> GENRE.GenreId
)

table STREAM 
(
  _ StreamId _, 
  MovieId    --> MOVIE.MovieId, 
  CustomerId --> CUSTOMER.CustomerId,
  StreamDate,
  Charge
)

table CUSTOMER
(
  _ CustomerId _, 
  Name,
  Address, 
  City, 
  PostalCode, 
  Country --> COUNTRY.Name,
  Email, 
  Phone ?, 
  Active
)

table COUNTRY
(  
  _ Name _,
  RegionId --> REGION.RegionId
)

table REGION
(  
  _ RegionId _, 
  Name,
  RegionManager --> STAFF.StaffId
)

table STAFF 
(
  _ StaffId _,
  Job,
  Supervisor --> STAFF.StaffId,
  Name
)

table DEPARTMENT
(
   _ DepId _,
   Name,
   Manager --> STAFF.StaffId
)
