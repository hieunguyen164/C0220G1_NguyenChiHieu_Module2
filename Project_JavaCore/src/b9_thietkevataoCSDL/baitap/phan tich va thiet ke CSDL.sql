create database carshowroom;
create table custumers(
customerNumber int not null auto_increment primary key,
customerName varchar(50) not null,
contactLastName varchar(50),
contactFirstName varchar(50),
phone varchar(50) not null,
addressLine1 varchar(50) not null,
addressLine2 varchar(50),
city varchar(50) not null,
state varchar(50) not null,
postalCode varchar(50) not null,
country varchar(50) not null,
credirLimit double,
salesRepEmployeeNumber int not null references employees(employeeNumber));

create table orders(
orderNumber int not null auto_increment primary key,
orderDate date not null,
requireDate date not null,
shippedDate date,
status varchar(50) not null,
comments text,
quantityOrdered int not null,
priceEach double not null,
customerNumber int references customers(customerName)
);

create table payments(
checkNumber varchar(50) not null primary key,
paymentDate date  not null,
amount double not null,
customerNumber int references customers(customerNumber));


create table products(
productCode int not null auto_increment primary key,
productName varchar(70) not null,
productScale varchar(10) not null,
productVendor varchar(50) not null,
productDescription text not null,
quantityInStock int not null,
buyPrice double not null,
MSRP double not null,
productLine varchar(50) not null references productLines(productLine));

create table productlines(
productLine varchar(50) not null primary key,
textDescription text,
hrmlDescription text,
image varchar(50));

create table employees(
employeeNumber int not null auto_increment primary key,
lastName varchar(50) not null,
firstName varchar(50) not null,
email varchar(100) not null,
jobTitle varchar(50) not null,
reportTo int not null references employees(employeeNumber),
officeCode varchar(10) not null references offices(officeCode));

create table offices(
officeCode varchar(10) not null primary key,
city varchar(50) not null,
phone varchar(50) not null,
addressLine1 varchar(50) not null,
addressLine2 varchar(50),
state varchar(50),
country varchar(50) not null,
poostalCode varchar(15) not null);

create table orderdetails(
productCode int not null references products(productCode),
orderNumber int not null references orders(orderNumber),
primary key(productCode, orderNumber),
quantityOrdered int not null,
priceEach double not null,
orderLineNumber int not null);

