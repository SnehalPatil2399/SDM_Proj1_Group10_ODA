create table Patient (
 pid int primary key,
 pname varchar(20) not null,
 pmno int not null,
 pdesc varchar(80) 
 );
	
create table Doctor (
 did int primary key,
 dname varchar(20) not null,
 demail varchar(20)  not null,   
 specialization varchar(20) not null
 );
	
	
create table Appointment (
 Aptid int primary key,
 pid int,
 did int,
 atpdate date,
 atptime int,
 constraint fkk_pid foreign key(pid) references Patient(pid),
 constraint fk_did foreign key(did) references Doctor(did)
 );
	
	
	
create table Test (
 testid int primary key,
 pid int,
 tname varchar(20) not null,
 constraint fk_pid foreign key(pid) references Patient(pid)
 );
	
	