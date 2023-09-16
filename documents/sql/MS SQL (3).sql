=============Stored Procedures ===========
CREATE TABLE Customers (
  id int,
  first_name VARCHAR(40),
  last_name VARCHAR(40),
  address varchar(200),
  age int,
  country VARCHAR(10),
  CONSTRAINT CustomersPK PRIMARY KEY (id)
);

DROP TABLE Customers2;

CREATE TABLE Customers2 (
  id int,
  first_name VARCHAR(40),
  last_name VARCHAR(40),
  address varchar(200),
  age int,
  country VARCHAR(10),
  state VARCHAR(40),
  CONSTRAINT CustomersPK2 PRIMARY KEY (id)
);


 insert into Customers values(1, 'Agra', 'bad', 'Agra' , 57, 'India');
 insert into Customers values(2, 'Hydra One1' , 'bad', 'Hydrabad' , 29, 'India');
 insert into Customers values(3, 'Adi2', 'Singh', 'Bangalore' , 25, 'India');
 insert into Customers values(4, 'Adi3', 'Singh', 'Bangalore' , 25, 'India');
 
 insert into Customers2 values(1, 'Agra', 'bad', 'Agra' , 57, 'India','UP');
 insert into Customers2 values(2, 'Hydra One1' , 'bad', 'Hydrabad' , 29, 'India','Telengana');
 insert into Customers2 values(3, 'Adi2', 'Singh', 'Bangalore' , 25, 'India' , 'Karnataka');
 insert into Customers2 values(4, 'Adi3', 'Singh', 'Bangalore' , 25, 'India1','Karnataka');
 
 SELECT country FROM Customers2
 MINUS
 SELECT country FROM Customers;
 
 SELECT cust.id,cust.first_name,cust.last_name,cust.address,cust.age,cust.country,cust2.country
 FROM Customers cust
 INNER JOIN 
 Customers2 cust2
 ON cust.id = cust2.id
 AND cust.first_name =  cust2.first_name
 AND cust.last_name = cust2.last_name ;
 
 DROP TABLE SALARY;
 
 CREATE TABLE SALARY (
   emp_id int primary key,
   salary int,
   department varchar(10)   
   )
   
   insert INTO salary values (1,10000,'IT');
   insert intO salary values (2,20000,'IT');
   insert intO salary values (3,30000,'IT');
   insert intO salary values (4,40000,'IT');
   insert intO salary values (5,50000,'IT');
   
   insert INTO salary values (11,5000,'ADMIN');
   insert intO salary values (12,7000,'ADMIN');
   insert intO salary values (13,9000,'ADMIN');
   insert intO salary values (14,13000,'ADMIN');
   insert intO salary values (15,15000,'ADMIN');
 
 === FIND EMP who earn less than Depn Median ========
 
 SELECT AVG(salary) from SALARY GROUP BY department;
 
 ==== Co related subquery=======
 SELECT * from SALARY outer1
 where SALARY < ( SELECT AVG(salary) 
                  from SALARY inner1
                 where inner1.department = outer1.department
                 GROUP BY department) ;
 
 ==== Nested Subquery =========
 Select * from SALARY
 WHERE SALARY > ( SELECT AVG(Salary) from  SALARY );
 
 
   
 
 
 
 
 
 
 
===== Simple SP =========== 
DROP PROCEDURE SelectAllCustomers;

CREATE PROCEDURE SelectAllCustomers
AS
SELECT * FROM Customers
GO;

EXEC SelectAllCustomers ;

====== SP with Params I/P and O/P =======
DROP PROCEDURE specificCustomer;
CREATE PROCEDURE specificCustomer
(    @custId int ,  
     @empName varchar(100) OUTPUT
)
 AS
BEGIN
    PRINT('TEST');
    SELECT @empName =  CONCAT (first_name , last_name) from Customers  
    WHERE id = @custId
END;

DECLARE @empNameValue varchar(100);
EXEC specificCustomer @custId = 2 , @empName = @empNameValue OUTPUT;
PRINT @empNameValue ;
SELECT CONCAT (first_name , last_name) from Customers  
    WHERE id = 2;
====== Complex SP Example ===========

DROP PROCEDURE updateDuplicateCustomer;

CREATE PROCEDURE updateDuplicateCustomer
AS
BEGIN
    SELECT first_name , last_name, count(*) 
    INTO #TEMPTABLE(first_name  , last_name , countVAL)
    from Customers  
    GROUP BY first_name , last_name;
END;

EXEC updateDuplicateCustomer;

===========
Find all students who have scored more than 90 in Data Structures in first Sem. 
   a) Student (S_ID	, S_NAME,S_AGE)
   b) Courses (C_ID,C_NAME)
   c) Student_Courses (ID, S_ID	, C_ID)
   d) MARKS ( ID , SEMESTER , MARKS) 
   
   
   CREATE TABLE STUDENT (
     S_ID int,
     S_NAME varchar(100),
     S_AGE int
    ) ;
    
    INSERT INTO STUDENT VALUES(1,'VIKRAM1', 18);
    INSERT INTO STUDENT VALUES(2,'VIKRAM2', 18);
    INSERT INTO STUDENT VALUES(3,'VIKRAM3', 18);
    INSERT INTO STUDENT VALUES(4,'VIKRAM4', 18);
    INSERT INTO STUDENT VALUES(5,'VIKRAM5', 18);
    INSERT INTO STUDENT VALUES(6,'VIKRAM6', 18);
    INSERT INTO STUDENT VALUES(7,'VIKRAM7', 18);
    INSERT INTO STUDENT VALUES(8,'VIKRAM8', 18);
    INSERT INTO STUDENT VALUES(9,'VIKRAM9', 18);
    INSERT INTO STUDENT VALUES(10,'VIKRAM10', 18);
    
    CREATE TABLE Courses (
     C_ID int,
     C_NAME varchar(100)
    ) ;
    
    INSERT INTO COURSES VALUES(1,'DATA STRUCTURES');
    INSERT INTO COURSES VALUES(2,'NUMERICAL METHODS');
    INSERT INTO COURSES VALUES(3,'MATHS');
   
     
    CREATE TABLE Student_Courses (
     id int,
     S_ID int,
     C_ID int,
    ) ;
    
    INSERT INTO Student_Courses VALUES( 1, 1 , 1);
    INSERT INTO Student_Courses VALUES( 2, 2 , 1);
    INSERT INTO Student_Courses VALUES( 3, 3 , 1);
    INSERT INTO Student_Courses VALUES( 4, 4 , 1);
    INSERT INTO Student_Courses VALUES( 5, 5 , 1);
    INSERT INTO Student_Courses VALUES( 6, 6 , 1);
    INSERT INTO Student_Courses VALUES( 7, 7 , 1);
    INSERT INTO Student_Courses VALUES( 8, 8 , 1);
    INSERT INTO Student_Courses VALUES( 9, 9 , 1);
    INSERT INTO Student_Courses VALUES( 10, 10 , 1);
    
    INSERT INTO Student_Courses VALUES( 11, 1 , 2);
    INSERT INTO Student_Courses VALUES( 12, 2 , 2);
    INSERT INTO Student_Courses VALUES( 13, 3 , 2);
    INSERT INTO Student_Courses VALUES( 14, 4 , 2);
    INSERT INTO Student_Courses VALUES( 15, 5 , 2);
    
    INSERT INTO Student_Courses VALUES( 17, 6 , 3);
    INSERT INTO Student_Courses VALUES( 18, 7 , 3);
    INSERT INTO Student_Courses VALUES( 19, 8 , 3);
    INSERT INTO Student_Courses VALUES( 20, 9 , 3);
    INSERT INTO Student_Courses VALUES( 21, 10 , 3);
    
    DROP TABLE MARKS;
    CREATE TABLE MARKS (
      STUDENT_COURSE_ID int, 
      SEMESTER varchar(10), 
      MARKS int
      );
      
     INSERT INTO MARKS VALUES ( 1 , 'FIRST' , 96);
     INSERT INTO MARKS VALUES ( 2 , 'FIRST' , 86);
     INSERT INTO MARKS VALUES ( 3 , 'FIRST' , 56);
     INSERT INTO MARKS VALUES ( 4 , 'FIRST' , 99);
      INSERT INTO MARKS VALUES ( 5 , 'FIRST' , 96);
     INSERT INTO MARKS VALUES ( 6 , 'FIRST' , 86);
     INSERT INTO MARKS VALUES ( 7 , 'FIRST' , 56);
     INSERT INTO MARKS VALUES ( 8 , 'FIRST' , 99);
      INSERT INTO MARKS VALUES ( 9 , 'FIRST' , 96);
     INSERT INTO MARKS VALUES ( 10 , 'FIRST' , 86);
     INSERT INTO MARKS VALUES ( 11 , 'FIRST' , 56);
     INSERT INTO MARKS VALUES ( 12 , 'FIRST' , 99);
      INSERT INTO MARKS VALUES ( 13 , 'FIRST' , 96);
     INSERT INTO MARKS VALUES ( 14 , 'FIRST' , 86);
     INSERT INTO MARKS VALUES ( 15 , 'FIRST' , 56);
     INSERT INTO MARKS VALUES ( 16 , 'FIRST' , 99);
      INSERT INTO MARKS VALUES ( 17 , 'FIRST' , 96);
     INSERT INTO MARKS VALUES ( 18 , 'SECOND' , 86);
     INSERT INTO MARKS VALUES ( 19, 'SECOND' , 56);
     INSERT INTO MARKS VALUES ( 20 , 'SECOND' , 99);
      INSERT INTO MARKS VALUES ( 21 , 'SECOND' , 99);
      
      
      
select DISTINCT *
       from Student s 
       join Student_Courses sc on s.s_id = sc.s_id 
	   join COURSES c on c.C_id = sc.C_id
	   join marks m on m.STUDENT_COURSE_ID = sc.id 
       WHERE  	 m.marks>90 
                 and c.c_name = 'DATA STRUCTURES' 
                 and m.semester = 'FIRST' ;
                 
select s.s_id,
       s.s_name 
       from Student s 
       INNER join Student_Courses sc on s.s_id = sc.s_id ;
	   
       
       
       LEFT join COURSES c on c.C_id = sc.C_id
	   LEFT join marks m on m.STUDENT_COURSE_ID = sc.id 
       WHERE  	 m.marks>90 
                 and c.c_name = 'DATA STRUCTURES' 
                 and m.semester = 'FIRST';








Select DISTINCT * from STUDENT WHERE s_id 
IN
(SELECT S_id FROM Student_Courses stuCr WHERE id 
IN ( SELECT student_course_id FROM MARKS WHERE MARKS > 90 and semester = 'FIRST')
AND stuCr.c_id IN ( SELECT C_ID FROM Courses WHERE c_name = 'DATA STRUCTURES')) ;




SELECT C_ID FROM Courses WHERE c_name = 'DATA STRUCTURES'; 



