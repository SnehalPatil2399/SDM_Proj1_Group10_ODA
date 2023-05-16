create table Patient (
 pid int primary key,
 pname varchar(20) not null,
 pmno varchar(10) not null unique,
 pemail varchar(30) not null unique,
 ppass varchar(30) not null	
 );
	
create table Doctor (
 did int primary key,
 dname varchar(20) not null,
 demail varchar(30)  not null unique,   
 dpass varchar(30) not null,
 dmno varchar(10) not null unique,	
 specialization varchar(20) not null
 );
	
	
create table Appointment (
 Aptid int primary key,
 pid int,
 did int,
 testid int,
 atpdate date,
 atptime int,
 constraint fkk_pid foreign key(pid) references Patient(pid),
 constraint fk_did foreign key(did) references Doctor(did),
constarint fkkk_testid foreign key(testid) references Test(testid)
 );
	
	
	
create table Test (
 testid int primary key,
 tname varchar(80) not null,
 );
	
	
