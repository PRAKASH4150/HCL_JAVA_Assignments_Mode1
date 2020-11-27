CREATE DATABASE assignment;
use assignment;
/*** Question-1**
Write a query to display account number, customer’s number, customer’s firstname,lastname,account opening date.
Display the records sorted in ascending order based on account number.
*/
CREATE TABLE IF NOT EXISTS customer_details(cust_number INT AUTO_INCREMENT PRIMARY KEY,cust_firstname VARCHAR(25) NOT NULL,cust_lastname VARCHAR(25) NOT NULL);
DESC customer_details;

CREATE TABLE IF NOT EXISTS account_details(acc_number INT AUTO_INCREMENT PRIMARY KEY,acc_opening_date DATE NOT NULL,cust_number int,FOREIGN KEY(cust_number) REFERENCES 
customer_details(cust_number));
DESC account_details;

INSERT INTO customer_details VALUES(4150,'Prakash','Moka'),(4151,'John','Abraham'),(4152,'Walter','White'),(4153,'Gus','Fring'),(4154,'Venkat','Chitturi');
SELECT * FROM customer_details;

INSERT INTO account_details VALUES(003456789,'2018-05-18',4150),(003456723,'2001-02-19',4151),(003578124,'1998-08-25',4152),(00357822011,'1999-03-15',4153),(003456756,
'2016-06-29',4154);
SELECT * FROM account_details;

SELECT cust.cust_number,cust.cust_firstname,cust.cust_lastname,acc.acc_number,acc.acc_opening_date FROM customer_details cust INNER JOIN account_details acc 
ON  cust.cust_number=acc.cust_number ORDER BY acc.acc_number;

/***********************************************************************/
/**Question-2**
Write a query to display the number of customer’s from Chennai. Give the count an alias name of Cust_Count.
*/
CREATE TABLE IF NOT EXISTS customer_details_tab2(cust_id INT AUTO_INCREMENT PRIMARY KEY,cust_Name VARCHAR(30) NOT NULL,cust_number VARCHAR(12) NOT NULL,
cust_city VARCHAR(20) NOT NULL);
DESC customer_details_tab2;

INSERT INTO customer_details_tab2 VALUES (1371,'Prakash Moka','8179399924','Chennai'),(1789,'Venkat Kishore','8822455751','Hyderabad'),(3245,'John Wick','9847563214','Madurai'),
(1567,'Vineet Chadalavada','9874561230','Chennai');

SELECT * FROM customer_details_tab2;
SELECT COUNT(cust_id) AS cust_count FROM customer_details_tab2 WHERE cust_city='Chennai';

/***********************************************************************/

/***Question 3**
Write a query to display  the customer number, customer firstname,account number for the customer’s whose accounts were created after 15th of any month.
Display the records sorted in ascending order based on customer number and then by account number.
*/

SELECT cust.cust_number,CONCAT(cust_firstname,' ',cust_lastname) AS cust_name,acc.acc_number,acc.acc_opening_date FROM customer_details cust INNER JOIN account_details acc
 ON cust.cust_number=acc.cust_number WHERE EXTRACT(DAY FROM acc.acc_opening_date)>15 ORDER BY cust.cust_number,acc.acc_number;
 
/***********************************************************************/

/**Question 4**
Write a query to display the number of customers who have registration but no account in the bank.
Give the alias name as Count_Customer for number of customers.
*/

INSERT INTO customer_details values(4155,'Mike','Ehramentraut'),(4156,'Venkata','Subramanyan'),(4157,'Rambabu','Moka');
SELECT * FROM customer_details;

SELECT COUNT(cust_number) as cust_count FROM customer_details WHERE cust_number NOT IN(select cust_number FROM account_details);
SELECT * FROM customer_details WHERE cust_number NOT IN(select cust_number FROM account_details);

/***********************************************************************/

/**Question 5*
Write  a query to display the firstname of the customers who have more than 1 account. Display the records in sorted order based on firstname.
*/

INSERT INTO account_details VALUES(324816462,'2003-08-15',4151);
INSERT INTO account_details VALUES(22561205,'2005-07-16',4153);
INSERT INTO account_details VALUES(56918622,'2006-09-27',4150);

SELECT cust.cust_firstname FROM customer_details cust INNER JOIN account_details acc ON cust.cust_number=acc.cust_number GROUP BY cust.cust_firstname 
HAVING COUNT(acc.cust_number)>1 ORDER BY cust.cust_firstname;
/***********************************************************************/

/**Question 6*
Write a query to display the number of clients who have asked for loans but they don’t have any account in the bank though they are registered customers.
 Give the count an alias name of Count.
*/

SELECT * FROM customer_details cust WHERE cust_number NOT IN (SELECT cust_number FROM account_details);

/***********************************************************************/

/**Question 7 *
Write a query to display the customer’s firstname who have multiple accounts (atleast  2 accounts).  
Display the records sorted in ascending order based on customer's firstname.
*/

SELECT cust.cust_firstname FROM customer_details cust INNER JOIN account_details acc ON cust.cust_number=acc.cust_number GROUP BY cust.cust_firstname 
HAVING COUNT(acc.cust_number)>=2;
/***********************************************************************/