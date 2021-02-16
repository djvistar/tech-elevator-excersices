

DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS art;
DROP TABLE IF EXISTS artist;
DROP TABLE IF EXISTS customer;




CREATE TABLE customer (

  customerId serial,
  firstName varchar(50) not null,
  lastName varchar(50) not null,
  phone varchar(11),

  constraint pk_customer primary key (customerid)


  );


CREATE TABLE artist (

 artistid serial,
 firstname varchar(50) not null,
 lastname varchar(50) not null,
 
  constraint pk_artist primary key (artistid)
 

);

CREATE TABLE art (
 artid serial,
 title varchar(64) not null,
 artistid int not null,
 
 constraint pk_art primary key (artid),
 constraint fk_art_artist foreign key (artistid) references artist (artistid)

);

CREATE TABLE orders (
  
 orderid serial,
 orderdate timestamp not null,
 price money not null,
 customerid int not null,
 artid int not null,
 
 constraint pk_orders primary key (orderid),
  constraint fk_orders_customer foreign key (customerid) references customer (customerid),
  constraint fk_orders_art foreign key (artid) references art (artid)

);

--load sample data


