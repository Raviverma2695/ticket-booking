start transaction;
create table IF NOT EXISTS properties_store(
prop_key varchar(100),
prop_value varchar(100),
prop_type varchar(20) NULL,
created_by varchar(50),
created_at timestamp DEFAULT CURRENT_TIMESTAMP,
updated_by varchar(50),
updated_at timestamp default current_timestamp on update current_timestamp,
primary key(prop_key)
);
commit;