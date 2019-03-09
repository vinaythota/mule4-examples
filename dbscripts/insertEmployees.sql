DROP PROCEDURE IF EXISTS insertEmployees;
DELIMITER #
CREATE PROCEDURE insertEmployees(IN noOfEmployees INT, IN startEmpNo INT)
BEGIN
	DECLARE empNo INT;
	DECLARE id INT;
	DECLARE fname VARCHAR(255);
	DECLARE lname VARCHAR(255);
	DECLARE phNo VARCHAR(255);
	DECLARE department VARCHAR(255);

	DECLARE count INT;

	SET count = 1;
	SET empNo = startEmpNo;

	truncate table employee; 

	WHILE count <= noOfEmployees DO
   		SET id = empNo;
   		SET fname = CONCAT('fname-',empNo);
   		SET lname = CONCAT('lname-',empNo);
   		SET phNo = CONCAT('phone-',empNo);
   		SET department = CONCAT('dep-',empNo);
		insert into employee values (id, fname, lname, phNo, department,sysdate());
   		SET empNo = empNo + 1;
   		SET count = count + 1;
	END WHILE;
END#
DELIMITER ;
