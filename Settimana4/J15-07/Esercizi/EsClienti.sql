-- 'clients' table creation
CREATE TABLE clients
(
    id INT PRIMARY KEY,
    name VARCHAR(100),
    surname VARCHAR(100),
    email VARCHAR(100),
    age INT,
    city VARCHAR(100)
);

SELECT *
FROM library.clients;

-- query 1
SELECT *
FROM library.clients
WHERE email IN('@gmail.com');

-- query 2
SELECT *
FROM library.clients
WHERE email LIKE '%@gmail.com';

-- query 4
SELECT *
FROM library.clients
WHERE name <= 'A';

-- query 5
-- selects all clients with a surname equal to 5 letters
SELECT *
FROM library.clients
WHERE surname LIKE '_____';

-- query 6
SELECT *
FROM library.clients
WHERE age >= 30 AND age <= 40;

-- query 7
SELECT *
FROM library.clients
WHERE age BETWEEN 30 AND 40;

-- query 8
SELECT *
FROM library.clients
WHERE REGEXP_LIKE(city, '%[R-r]oma%');

-- query 9
SELECT *
FROM library.clients
WHERE city IN('roma');