-- DB creation
CREATE DATABASE library;

-- "books" table creation
CREATE TABLE books
(
    id INT PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(100),
    genre VARCHAR(50),
    price DECIMAL(5, 2),
    year_of_publication INT
);

-- Insert data into "books" table
INSERT INTO books (id, title, author, genre, price, year_of_publication) VALUES
(1, 'L’ombra del vento', 'Carlos Ruiz Zafón', 'Narrativa', 15.90, 2001),
(2, 'Il nome della rosa', 'Umberto Eco', 'Storico', 12.50, 1980),
(3, '1984', 'George Orwell', 'Distopico', 9.90, 1949),
(4, 'Il grande Gatsby', 'F. Scott Fitzgerald', 'Classico', 10.00, 1925),
(5, 'Moby Dick', 'Herman Melville', 'Avventura', 14.75, 1851),
(6, 'Orgoglio e pregiudizio', 'Jane Austen', 'Romanzo', 11.20, 1813),
(7, 'Il signore degli anelli', 'J.R.R. Tolkien', 'Fantasy', 25.00, 1954),
(8, 'Harry Potter e la pietra filosofale', 'J.K. Rowling', 'Fantasy', 20.00, 1997),
(9, 'Il codice da Vinci', 'Dan Brown', 'Thriller', 18.50, 2003),
(10, 'Il piccolo principe', 'Antoine de Saint-Exupéry', 'Fiaba', 8.60, 1943),
(11, 'Fahrenheit 451', 'Ray Bradbury', 'Distopico', 9.50, 1953),
(12, 'Il diario di Anna Frank', 'Anna Frank', 'Biografia', 7.80, 1947),
(13, 'La coscienza di Zeno', 'Italo Svevo', 'Romanzo', 10.90, 1923),
(14, 'Il gattopardo', 'Giuseppe Tomasi di Lampedusa', 'Storico', 14.00, 1958),
(15, 'Dracula', 'Bram Stoker', 'Horror', 12.00, 1897),
(16, 'Frankenstein', 'Mary Shelley', 'Horror', 11.00, 1818),
(17, 'Il vecchio e il mare', 'Ernest Hemingway', 'Romanzo', 9.99, 1952),
(18, 'Il buio oltre la siepe', 'Harper Lee', 'Romanzo', 13.50, 1960),
(19, 'Il cacciatore di aquiloni', 'Khaled Hosseini', 'Narrativa', 16.80, 2003),
(20, 'Il conte di Montecristo', 'Alexandre Dumas', 'Avventura', 17.00, 1844),
(21, 'Guerra e pace', 'Lev Tolstoj', 'Storico', 19.90, 1869),
(22, 'Anna Karenina', 'Lev Tolstoj', 'Romanzo', 18.20, 1877),
(23, 'Lolita', 'Vladimir Nabokov', 'Romanzo', 14.70, 1955),
(24, 'Il Maestro e Margherita', 'Michail Bulgakov', 'Fantastico', 16.00, 1966),
(25, 'Cime tempestose', 'Emily Brontë', 'Romanzo', 13.90, 1847),
(26, 'Il ritratto di Dorian Gray', 'Oscar Wilde', 'Romanzo', 12.30, 1890),
(27, 'La metamorfosi', 'Franz Kafka', 'Fantastico', 8.90, 1915),
(28, 'Cuore', 'Edmondo De Amicis', 'Narrativa', 10.50, 1886),
(29, 'La divina commedia', 'Dante Alighieri', 'Classico', 20.00, 1320),
(30, 'La fattoria degli animali', 'George Orwell', 'Satira', 9.80, 1945),
(31, 'Il barone rampante', 'Italo Calvino', 'Fantastico', 14.10, 1957),
(32, 'Cent’anni di solitudine', 'Gabriel García Márquez', 'Magico', 18.00, 1967),
(33, 'La strada', 'Cormac McCarthy', 'Post-apocalittico', 15.60, 2006),
(34, 'Il nome del vento', 'Patrick Rothfuss', 'Fantasy', 22.50, 2007),
(35, 'La ragazza con l’orecchino di perla', 'Tracy Chevalier', 'Storico', 13.60, 1999),
(36, 'Il silenzio degli innocenti', 'Thomas Harris', 'Thriller', 17.20, 1988),
(37, 'Shining', 'Stephen King', 'Horror', 14.50, 1977),
(38, 'Misery', 'Stephen King', 'Horror', 13.40, 1987),
(39, 'Il trono di spade', 'George R.R. Martin', 'Fantasy', 24.00, 1996),
(40, 'La casa degli spiriti', 'Isabel Allende', 'Romanzo', 16.30, 1982),
(41, 'Il giovane Holden', 'J.D. Salinger', 'Romanzo', 11.90, 1951),
(42, 'Norwegian Wood', 'Haruki Murakami', 'Narrativa', 14.80, 1987),
(43, 'Kafka sulla spiaggia', 'Haruki Murakami', 'Fantastico', 16.50, 2002),
(44, 'Siddhartha', 'Hermann Hesse', 'Filosofico', 10.20, 1922),
(45, 'L’alchimista', 'Paulo Coelho', 'Fantastico', 13.00, 1988),
(46, 'Il barone di Münchhausen', 'Rudolf Erich Raspe', 'Avventura', 12.70, 1785),
(47, 'Il piccolo lord', 'Frances Hodgson Burnett', 'Romanzo', 9.60, 1886),
(48, 'I promessi sposi', 'Alessandro Manzoni', 'Storico', 15.00, 1827),
(49, 'La ragazza del treno', 'Paula Hawkins', 'Thriller', 14.90, 2015),
(50, 'Il cavaliere d’inverno', 'Paullina Simons', 'Romantico', 17.50, 2000);

SELECT genre, COUNT(title) AS 'Total number of titles per genre', ROUND(AVG(price), 2) AS 'Average price per genre'
FROM library.books
GROUP BY genre
ORDER BY genre;

SELECT *
FROM library.books
WHERE year_of_publication > 2010
ORDER BY year_of_publication DESC, price;