-- selects the total number of books in the library db,
-- the price average and the total amount of books
SELECT COUNT(*) AS number_of_books, AVG(price) as price_average, SUM(price) total_amount_of_books
FROM library.books