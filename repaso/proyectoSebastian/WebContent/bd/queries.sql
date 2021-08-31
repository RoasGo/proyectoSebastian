use library;

call createUser('Gonzalo Roa', 'roasgo@hotmail.com', 'contrasena');

select * from roles;
select * from users;

call authenticate('roasgo@hotmail.com', 'contrasena');