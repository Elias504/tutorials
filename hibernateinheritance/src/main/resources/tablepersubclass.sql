use springdatajpa;

create table payment(
id int PRIMARY KEY,
amount decimal(8,3)
);

create table card(
payment_id int ,
card_number varchar(20),
 FOREIGN KEY (payment_id)
REFERENCES payment(id)
)

create table cheque(
payment_id int,
cheque_number varchar(20),
FOREIGN KEY (payment_id)
REFERENCES payment(id)
)
