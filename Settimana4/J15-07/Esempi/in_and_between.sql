SELECT *
FROM library.sales;

SELECT *
FROM library.sales
WHERE product NOT IN('To Kill a Mockingbird', '1984');

SELECT *
FROM library.sales
WHERE product IN('To Kill a Mockingbird', '1984', "Harry Potter and the Sorcerer\'s Stone");

SELECT *
FROM library.sales
WHERE sale_date BETWEEN '2025-06-26' AND '2025-07-14';