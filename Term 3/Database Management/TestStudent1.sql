SET SERVEROUTPUT ON;

DECLARE
    TYPE rec_cust IS RECORD (
            l_id    NUMBER,
            l_fname VARCHAR2(20),
            l_lname VARCHAR2(40)
    );
    TYPE arr_cust IS TABLE OF rec_cust;
    l_cust arr_cust;
    CURSOR cr IS
    SELECT
        cust_id,
        cust_first_name,
        cust_last_name
    FROM
        sh.customers
    WHERE
        cust_id < 100;

BEGIN
    OPEN cr;
    FETCH cr
    BULK COLLECT INTO l_cust;
    CLOSE cr;
    FOR i IN 1..l_cust.last LOOP
        dbms_output.put_line(l_cust(i).l_id
                             || ' '
                             || l_cust(i).l_fname
                             || ' '
                             || l_cust(i).l_lname);
    END LOOP;

END;

CREATE TABLE MyCustomer AS
SELECT * FROM sh.Customers WHERE ROWNUM< 0;
DECLARE
Type arr_cust IS TABLE OF sh.Customers%ROWTYPE;
l_cust arr_cust;
CURSOR cr IS SELECT *
FROM sh.Customers
WHERE Cust_ID < 100;
BEGIN
OPEN cr;
FETCH cr BULK COLLECT INTO l_cust;
CLOSE cr;
FORALL i IN 1..l_cust.LAST
INSERT INTO MyCustomer VALUES l_cust(i);
END;

CREATE TABLE PCustomer (
Cust_ID NUMBER,
CustFirstname VARCHAR2(12),
CustLastname VARCHAR2(12),
CustCity VARCHAR2(18)
);
INSERT INTO PCustomer (Cust_ID, CustFirstname, CustLastname, CustCity)
VALUES (1, 'Roger', 'Waters', 'Toronto');
INSERT INTO PCustomer (Cust_ID, CustFirstname, CustLastname, CustCity)
VALUES(2, 'Max', 'Williams', 'Vancouver');
INSERT INTO PCustomer (Cust_ID, CustFirstname, CustLastname, CustCity)
VALUES(3, 'Alice', 'John', 'Montreal');
INSERT INTO PCustomer (Cust_ID, CustFirstname, CustLastname, CustCity)
VALUES (4, 'Bob', 'Smith', 'Toronto');
INSERT INTO PCustomer (Cust_ID, CustFirstname, CustLastname, CustCity)
VALUES (5, 'Charlie', 'Brown', 'Vancouver');
INSERT INTO PCustomer (Cust_ID, CustFirstname, CustLastname, CustCity)
VALUES (6, 'Emma', 'Davis', 'Calgary');
CREATE TABLE PCustomerWest (
Cust_ID VARCHAR2(4),
CustName VARCHAR2(24),
CustCity VARCHAR2(18)
);
CREATE TABLE PCustomerEast (
Cust_ID VARCHAR2(4),
CustName VARCHAR2(24),
CustCity VARCHAR2(18)
);


DECLARE
TYPE Cust_Rec IS RECORD (
    cust_ID PCustomerWest.Cust_ID%TYPE,
    cust_fname PCustomerWest.CustName%TYPE,
    cust_lname PCustomerWest.CustName%TYPE,
    cust_city PCustomerWest.CustCity%TYPE
    
);
Cust Cust_Rec;
CURSOR cr IS SELECT Cust_ID, CustFirstname, CustLastname, CustCity
    FROM PCustomer;

BEGIN
    OPEN cr;
    LOOP
        FETCH cr INTO Cust;
        EXIT WHEN cr%NOTFOUND;
    END LOOP;
    CLOSE cr;
    IF Cust.cust_city = 'Montreal' THEN
        INSERT INTO PCustomerWest (Cust_ID, CustName, CustCity) 
        VALUES ('C' || TO_CHAR(Cust.cust_ID), Cust.cust_fname || ' ' || Cust.cust_lname, Cust.cust_city);
    ELSIF Cust.cust_city = 'Vancouver' THEN
        INSERT INTO PCustomerWest (Cust_ID, CustName, CustCity) 
        VALUES ('C' || TO_CHAR(Cust.cust_ID), Cust.cust_fname || ' ' || Cust.cust_lname, Cust.cust_city);
    END IF;
END;
