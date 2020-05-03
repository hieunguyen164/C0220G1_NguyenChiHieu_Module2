
create table customers(
customer_number int not null auto_increment primary key,
fullname varchar(255) not null,
address varchar(255) not null,
email varchar(255),
phone int not null);
create table accounts(
account_number int not null auto_increment primary key,
account_type varchar(20) not null,
date date not null,
balance double);
create table transactions(
tran_number int not null auto_increment primary key,
account_number int,
date date,
amounts double,
descriptions varchar(255));
alter table accounts
add column customer_number int;
alter table accounts
add constraint accounts_fk foreign key (customer_number) references customers(customer_number);
alter table transactions
add column account_number int;
alter table transactions
add constraint transactions_fk foreign key (account_number) references accounts(account_number);
