show databases;
use codefurryteam12;
show tables;
desc customer;
create table myOrder (
uniqOrderId int primary key,
orderDate varchar(20),
shippingCost int,
shippingAgency varchar(20),
status int,
uniqCustomerId int,
foreign key(uniqCustomerId) references Customer(uniqcustomerid)
);

create table GST(
uniqueGstId int unique ,
typeOfGst varchar(25),
percentOfGst int,
primary key(uniqueGstId)
);
show tables;
create table Invoice(

uniqInvoiceId int unique,
invoiceDate varchar(20),
totalGSTamount int,

uniqOrderId int,
uniqCustomerId int ,
primary key (uniqInvoiceId),
foreign key(uniqCustomerId) references Customer(uniqCustomerID),
foreign key(uniqOrderId) references myOrder(uniqOrderId)
);

create table Product(
uniqProductId int unique,

productName varchar(50),
productPrice int,

productCategory varchar(50),

uniqueGstId int,
uniqOrderId int,

primary key(uniqProductId),

foreign key(uniqueGstId) references GST(uniqueGstId),
foreign key(uniqOrderId) references myOrder(uniqOrderId)

);
show tables;
desc gst;
insert into customer values(12,"anupam","sajay park","pune","tanupm695@gmail.com",780);

insert into customer values(13,"alok","subas","patna","talok5@gmail.com",781);


insert into customer values(14,"aaysuh","gandhi road","jaipur","taayus599@gmail.com",782);

insert into GST values(780,"low",5);
insert into GST values(781,"medium",12);
insert into GST values(782,"high",18);


insert into myOrder values(8553,"12/09/2021",85,"swiggy",0,12);


insert into myOrder values(8554,"13/09/2021",89,"zomoto",0,13);


insert into myOrder values(8555,"14/09/2021",825,"uber",0,14);

insert into myOrder values(8556,"18/09/2021",829,"uber",0,13);


insert into myOrder values(8557,"19/09/2021",25,"swiggy",0,14);


insert into product values(8492,
"bottle",30,"food",781,8553);

insert into product values(8493,"sjs",844,"food",780,8554);



insert into product values(8494,"rice",84,"food",781,8554);


insert into product values(8495,"chair",9332,"wood",782,8555);


insert into product values(8496,"cement",9543,"construction",780,8555);



insert into product values(8497,"laptop",345621,"electronics",782,8556);


insert into product values(8498,"H C Verma",932,"book",782,8556);


insert into product values(8499,"R s Agrawal",912,"book",780,8557);


insert into product values(8500,"mouse",322,"electronics",782,8557);

show tables;
select * from customer;
select * from gst;

select * from myOrder;

select * from product;
create table Employee(
uniqEmployeeId int,
userName varchar(25),
password varchar(25),
primary key(uniqEmployeeId)
);

insert into Employee values(77483,"anupam","99595");
insert into Employee values(77484,"alok","909392");

Desc Product;
Create table ProductCount(
prdouctCountId int primary key,
uniqProductId integer,
countOfProduct integer,
foreign key(uniqProductId) references Product(uniqProductId)); 

insert into invoice values(194093,"23/08/2021",9492,8554,13);
select * from invoice;

select * from myOrder;
select * from customer;
select * from product;









