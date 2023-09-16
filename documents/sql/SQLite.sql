SELECT * FROM demo;

CREATE TABLE Customers (
  first_name VARCHAR(40),
  last_name VARCHAR(40),
  address varchar(200),
  age int,
  country VARCHAR(10),
  CONSTRAINT CustomersPK PRIMARY KEY (first_name,last_name,address,age)
);

CREATE TABLE Customers2 (
  first_name VARCHAR(40) NOT NULL,
  last_name VARCHAR(40),
  address varchar(200),
  age int,
  country VARCHAR(10)  
);
 insert into Customers2 values( 'Agra', 'bad', 'Agra' , 57, 'India');
  insert into Customers2 values( 'Hydra One1' , 'bad', 'Hydrabad' , 29, 'India');
  insert into Customers values( 'Adi2', 'Singh', 'Bangalore' , 25, 'India');
   insert into Customers values( 'Adi3', 'Singh', 'Bangalore' , 25, 'India');
 
 Select * from Customers2;
  Select * from Customers1;
  
 INSERT INTO Customers2 (first_name,last_name,address,age,country) 
 Select first_name,last_name,address,age,country from Customers1 ;
 
  INSERT INTO Customers2 Select * from Customers1 ;

delete from Customers2 where first_name Like '%Adi%';

Select * from Customers2 where first_name IN('Aditya','Adi1');

Select * from Customers2 where age BETWEEN 27 and 29;


UPDATE Customers2 SET last_name = "PAUL12" WHERE first_name LIke '?ditya%' ;


Select * from Customers2 where first_name != 'Adi' ;

SELECT AVG(age) ageAVG, address FROM Customers2 where country =  'India' GROUP BY 
address HAVING  ageAVG > 22 ORDER BY ageAVG ASC LIMIT (
   Select COUNT(*) from (
    SELECT AVG(age) ageAVG, address FROM Customers2 where country =  'India' GROUP BY 
address HAVING  ageAVG > 22 ORDER BY ageAVG
   ) 
) ; 

Start PageNo * Offset Last PageNo*Offset+Offset