create table special_shipper_table 
(
    shipper_number    varchar(10) not null,
    insert_timeStamp  varchar(26) not null,
    user_login_id     varchar(50) not null,
    retention_period  smallint    not null,
    primary key (shipper_number)
);
