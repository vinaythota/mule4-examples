DROP PROCEDURE IF EXISTS insertAccounts;
DELIMITER #
CREATE PROCEDURE insertAccounts(IN noOfAccounts INT, IN startAccountId INT)
BEGIN
	DECLARE accountid INT;
	DECLARE name VARCHAR(255);
	DECLARE address VARCHAR(255);

	DECLARE count INT;

	SET count = 1;
	SET accountId  = startAccountId;

	drop table if exists account;
	create table account ( id int, name varchar(45), address varchar(45));

	WHILE count <= noOfAccounts DO
   		SET name = CONCAT('name-',accountId);
   		SET address = CONCAT('address-',accountId);
		insert into account values (accountId, name, address);
   		SET accountId  = accountId + 1;
   		SET count = count + 1;
	END WHILE;
END#
DELIMITER ;
