Create database test;

use test;

CREATE TABLE Variants
(
    code INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    color VARCHAR(10) NOT NULL,
    size INT DEFAULT 10 NOT NULL,
    product INT
);
CREATE TABLE pricerows
(
    code INT PRIMARY KEY NOT NULL,
    startdate DATETIME NOT NULL,
    enddate DATETIME,
    currency CHAR(1) NOT NULL,
    amount DOUBLE NOT NULL,
    productcode INT NOT NULL
);
CREATE TABLE products
(
    code INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    description VARCHAR(100)
);
CREATE TABLE sample
(
    sno INT,
    fname VARCHAR(30),
    lname VARCHAR(30),
    dob DATE
);
CREATE TABLE stock
(
    productcode INT NOT NULL,
    warehousenumber INT NOT NULL,
    reserved INT NOT NULL,
    stock INT DEFAULT 10 NOT NULL,
    PRIMARY KEY (productcode, warehousenumber)
);
ALTER TABLE Variants ADD FOREIGN KEY (product) REFERENCES products (code);
CREATE INDEX fk_productid ON Variants (product);
ALTER TABLE pricerows ADD FOREIGN KEY (productcode) REFERENCES products (code);
CREATE UNIQUE INDEX unique_name ON products (name);
ALTER TABLE stock ADD FOREIGN KEY (productcode) REFERENCES products (code);

insert into products ( name, description) VALUES (
    'nike air pagasus','nike running shoes'

);

insert into products ( name, description) VALUES (
'adizero','adidas running shoes'

)
