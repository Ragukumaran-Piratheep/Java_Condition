create table department(dep_no int,
dept_name varchar(50),
no_of_staffs int,
locaton varchar(100),
primary key(dep_no));

create table students(std_id varchar(30), 
stud_name varchar(100),
age int,
address varchar(100),
dept_no int,
primary key(std_id),
foreign key(dep_no)references department(dep_no));

insert into department values(1,"Computer Science",30,"Jaffna");
insert into department values(2,"Physical Science",40,"Jaffna");
insert into department values(3,"Zoology",35,"Jaffna");



insert into students values("2022/csc/001","Kamal",24,"Main street,jaffna",1);
insert into students values("2022/csc/002","John",25,"School road,Trincomalee",1);
insert into students values("2022/sp/005","sahana",25,"Trinco road,Batticaloa",2);
insert into students values("2022/sp/008","Vimal",24,"Thirunelveli,jaffna",2);
insert into students values("2022/zo/001","Kamal",24,"Hospital road,Kilinochchi",3);