start transaction;
create table if not exists users (
id bigint UNSIGNED AUTO_INCREMENT NOT NULL,
name varchar(45),
age int,
primary key (id),
key(age),
key(name)
);

insert into users (name,age) values ('ravi',23);
insert into users (name,age) values ('akash',23);
insert into users (name,age) values ('dhruv',23);
insert into users (name,age) values ('rahul',24);

commit;
