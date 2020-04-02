create table customer_basis
(
	customer_id varchar(10),
	name varchar(30),
	birth_day varchar(8),
	height numeric(3,2),
	weight numeric(5,2),
	bmi    numeric(4,2),
	primary key (customer_id)
);