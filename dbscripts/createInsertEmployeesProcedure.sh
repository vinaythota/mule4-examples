DROP PROCEDURE IF EXISTS insertEmployees;
DELIMITER #
CREATE PROCEDURE insertEmployees(IN noOfEmployees INT, IN startEmpNo INT)
BEGIN
	DECLARE empNo INT;
	DECLARE id INT;
	DECLARE depId INT;
	DECLARE fname VARCHAR(255);
	DECLARE lname VARCHAR(255);
	DECLARE phNo VARCHAR(255);
	DECLARE department VARCHAR(255);

	DECLARE count INT;

	SET count = 1;
	SET empNo = startEmpNo;

	drop table employee;
	create table employee ( id int, depId int, fname varchar(45), lname varchar(45), phone varchar(45), department varchar(45), DOB datetime);

	WHILE count <= noOfEmployees DO
   		SET id = empNo;
   		SET depId = empNo;
   		SET fname = CONCAT('fname-',empNo);
   		SET lname = CONCAT('lname-',empNo);
   		SET phNo = CONCAT('phone-',empNo);
   		SET department = CONCAT('dep-',empNo);
		insert into employee values (id, depId, fname, lname, phNo, department,sysdate());
   		SET empNo = empNo + 1;
   		SET count = count + 1;
	END WHILE;
END#
DELIMITER ;
