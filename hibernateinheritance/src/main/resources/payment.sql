use springdatajpa;

create table payment(
id int PRIMARY KEY,
payment_mode varchar(10),
amount decimal(8,3) ,
card_number varchar(20),
cheque_number varchar(20)
);

select * from payment
