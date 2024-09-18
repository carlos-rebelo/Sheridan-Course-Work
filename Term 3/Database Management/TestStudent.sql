SET SERVEROUTPUT ON;

DECLARE
    cust_name CUSTOMERS1.NAME%TYPE;
    cust_address CUSTOMERS1.ADDRESS%TYPE;
    CURSOR cust_cr IS 
    SELECT NAME, ADDRESS
    FROM CUSTOMERS1
    WHERE customer_id = 2;
BEGIN
    OPEN cust_cr;
    LOOP
    FETCH cust_cr INTO cust_name, cust_address;
    EXIT WHEN cust_cr%NOTFOUND;
    end loop;
    DBMS_OUTPUT.PUT_LINE('Customer ID: 1 | Customer Name: '|| cust_name ||' | Customer Address: '|| cust_address);

END;
