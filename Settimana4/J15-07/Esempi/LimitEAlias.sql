-- selects the first 10 books from the db library 
SELECT * FROM library.books
LIMIT 10;

-- applies an alias (AS) to the selected fields
SELECT title AS book_title, author AS book_author
FROM library.books;

-- selects the lowest and highest book price
-- rounding the decimal digits to 2
SELECT ROUND(MIN(price), 2) AS lowest_book_price, ROUND(MAX(price), 2) AS highest_book_price
FROM library.books