-- "sales" table creation
CREATE TABLE sales
(
    id INT PRIMARY KEY,
    product VARCHAR(100),
    category VARCHAR(50),
    quantity INT,
    price_per_unit DECIMAL(6, 2),
    sale_date DATE
);

-- Insert 50 records into "sales" table
INSERT INTO sales (id, product, category, quantity, price_per_unit, sale_date) VALUES
(1, 'The Great Gatsby', 'Fiction', 10, 12.99, '2025-07-15'),
(2, 'To Kill a Mockingbird', 'Classic', 8, 9.99, '2025-07-14'),
(3, "Harry Potter and the Sorcerer\'s Stone", 'Fantasy', 15, 14.99, '2025-07-13'),
(4, '1984', 'Dystopian', 5, 11.99, '2025-07-12'),
(5, 'The Alchemist', 'Adventure', 12, 10.99, '2025-07-11'),
(6, 'Pride and Prejudice', 'Romance', 7, 8.99, '2025-07-10'),
(7, 'The Hobbit', 'Fantasy', 9, 13.99, '2025-07-09'),
(8, 'The Catcher in the Rye', 'Literary', 11, 9.49, '2025-07-08'),
(9, 'Lord of the Flies', 'Fiction', 6, 10.49, '2025-07-07'),
(10, 'Brave New World', 'Science Fiction', 4, 12.49, '2025-07-06'),
(11, 'Gone with the Wind', 'Historical Fiction', 8, 11.99, '2025-07-05'),
(12, 'The Da Vinci Code', 'Mystery', 10, 14.49, '2025-07-04'),
(13, 'The Lord of the Rings', 'Fantasy', 15, 19.99, '2025-07-03'),
(14, 'Jane Eyre', 'Classic', 7, 8.99, '2025-07-02'),
(15, 'Moby Dick', 'Adventure', 5, 13.99, '2025-07-01'),
(16, 'Wuthering Heights', 'Romance', 9, 7.99, '2025-06-30'),
(17, 'Crime and Punishment', 'Psychological Fiction', 6, 10.99, '2025-06-29'),
(18, 'The Picture of Dorian Gray', 'Gothic', 12, 11.49, '2025-06-28'),
(19, 'The Road', 'Post-Apocalyptic', 8, 12.99, '2025-06-27'),
(20, 'The Hunger Games', 'Young Adult', 10, 9.99, '2025-06-26'),
(21, 'The Girl on the Train', 'Thriller', 7, 13.49, '2025-06-25'),
(22, 'Little Women', 'Family Drama', 9, 8.49, '2025-06-24'),
(23, 'The Kite Runner', 'Contemporary Fiction', 13, 11.99, '2025-06-23'),
(24, 'The Nightingale', 'Historical Fiction', 6, 14.99, '2025-06-22'),
(25, 'One Hundred Years of Solitude', 'Magical Realism', 11, 12.49, '2025-06-21'),
(26, 'Anna Karenina', 'Classic', 8, 9.99, '2025-06-20'),
(27, 'The Goldfinch', 'Literary Fiction', 10, 15.99, '2025-06-19'),
(28, 'The Help', 'Historical Fiction', 7, 11.49, '2025-06-18'),
(29, 'The Fault in Our Stars', 'Young Adult', 9, 10.49, '2025-06-17'),
(30, 'A Game of Thrones', 'Fantasy', 12, 16.99, '2025-06-16'),
(31, 'The Silent Patient', 'Psychological Thriller', 6, 13.99, '2025-06-15'),
(32, 'The Night Circus', 'Fantasy', 11, 14.49, '2025-06-14'),
(33, 'Educated', 'Memoir', 8, 12.99, '2025-06-13'),
(34, 'Where the Crawdads Sing', 'Mystery', 10, 13.49, '2025-06-12'),
(35, 'Circe', 'Mythological Fiction', 7, 15.99, '2025-06-11'),
(36, 'The Dutch House', 'Family Saga', 9, 11.99, '2025-06-10'),
(37, 'The Water Dancer', 'Historical Fiction', 5, 14.99, '2025-06-09'),
(38, 'The Giver of Stars', 'Historical Fiction', 11, 12.49, '2025-06-08'),
(39, 'The Great Alone', 'Domestic Fiction', 8, 13.49, '2025-06-07'),
(40, 'Before We Were Yours', 'Historical Fiction', 12, 14.99, '2025-06-06'),
(41, 'The Tattooist of Auschwitz', 'Historical Fiction', 6, 15.49, '2025-06-05'),
(42, 'The Woman in the Window', 'Thriller', 9, 10.99, '2025-06-04'),
(43, 'The Silent Wife', 'Psychological Thriller', 7, 11.99, '2025-06-03'),
(44, 'The Night Stalker', 'Crime', 10, 12.49, '2025-06-02'),
(45, 'The Girl with the Dragon Tattoo', 'Mystery', 8, 13.99, '2025-06-01'),
(46, 'Big Little Lies', 'Mystery', 12, 14.99, '2025-05-31'),
(47, 'The Alice Network', 'Historical Fiction', 9, 15.49, '2025-05-30'),
(48, 'Eleanor Oliphant Is Completely Fine', 'Contemporary Fiction', 6, 11.99, '2025-05-29'),
(49, 'Before I Go to Sleep', 'Thriller', 10, 12.99, '2025-05-28'),
(50, 'The Night Circus', 'Fantasy', 7, 13.49, '2025-05-27');

-- selects the total number of sold products per category
SELECT COUNT(*) AS total_sold_products_per_category
FROM library.sales
GROUP BY category;

-- selects the price per unit average for each category
SELECT ROUND(AVG(price_per_unit), 2) AS sold_products_per_category_average
FROM library.sales
GROUP BY category;

-- selects the quantity of sold products per product
SELECT SUM(quantity) AS sold_products_quantity_per_product
FROM library.sales
GROUP BY product;

-- selects the min and max price of all sold products
SELECT MIN(price_per_unit) AS min_sold_product_price, MAX(price_per_unit) AS max_sold_product_price
FROM library.sales;

-- selects the total number of sold products
SELECT COUNT(*) AS sold_products_count
FROM library.sales;

-- selects the first 5 products with the highest price per unit
SELECT *
FROM library.sales
ORDER BY price_per_unit DESC
LIMIT 5;

-- selects the first 3 products with the lowest sold quantity
SELECT product, SUM(quantity) AS lowest_sold_quantity_per_product
FROM library.sales
GROUP BY product
ORDER BY lowest_sold_quantity_per_product
LIMIT 3;