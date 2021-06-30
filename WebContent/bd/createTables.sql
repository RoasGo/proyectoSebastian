create database if not exists library;

use library;

create table if not exists roles(
	id		int auto_increment	primary key,
    name 	varchar(20)			not null
);

create table if not exists users(
	id			int primary key	auto_increment,
    name 		varchar(50)		not null,
    email		varchar(70)		not null,
    password	varchar(250)	not null,
    phone 		char(9)			null,
    rolId		int				not null
);

alter table users
add constraint fk_users_roles
foreign key (rolId) references roles(id);

insert into roles values(null, 'STANDARD');
insert into roles values(null, 'SUPERVISOR');
insert into roles values(null, 'ADMIN');
select * from roles;

DELIMITER $$
create procedure authenticate(IN email varchar(70), IN password varchar(250))
begin
	select 
		u.*, 
        r.name as rolName 
	from 
		users u
	inner join 
		roles r
        on 
			r.id = u.rolId
	where
		u.email = email and u.password = password;

end$$
DELIMITER ;

DELIMITER $$
create procedure createUser(IN name varchar(50), IN email varchar(70), IN password varchar(50))
begin

	insert into users(id, name, email, password) values(null, name, email, password);

end$$
DELIMITER ;