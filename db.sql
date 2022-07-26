create table Book(
book_id int primary key,
book_title varchar(50) NOT NULL,
author varchar(50),
isbn_no varchar(10),
category varchar(50),
price decimal);

create table Student(
student_id int primary key,
student_name varchar(50) NOT NULL,
roll_no int,
class int,
section char(1),
student_address text);

insert into Book values
(101, '





Category: int id, int book_id, varchar category_name  
Student: int id, varchar name, int roll_no, int class, char section, text address
Teacher: int id, varchar name, text address, int mob_no
Librarian: int id, varchar name
Transaction: int id, int book_id, int issuer_id, issuer_type, datetime due_date