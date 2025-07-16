-- DB creation
CREATE DATABASE pizzeria_zi_peppe;

-- "pizza" table creation
CREATE TABLE pizza
(
    name VARCHAR(50) PRIMARY KEY,
    description VARCHAR(100),
    allergens BOOL,
    price DECIMAL(5, 2)
);

-- "locations" table creation
CREATE TABLE locations
(
    SELECT city.Name AS 'City', city.CountryCode
    FROM world.city
);

-- inserts records into 'pizza' table
INSERT INTO pizza VALUES
('Zi Peppe', 'Good pizza', 0, 8.00),
('Albertone', 'Good pizza', 0, 9.00),
('Funghi Porcini', 'Optimum pizza', 0, 11.00),
('Margherita', 'Nice pizza', 0, 7.00),
('Alberto Sordi', 'Not bad pizza', 1, 9.00),
('Principe Bis', 'Best pizza ever', 1, 12.00);

-- deletes all 'pizza' table records
TRUNCATE TABLE pizza;

-- deleting tables created
DROP TABLE pizza;
DROP TABLE locations;

-- deleting db created
DROP DATABASE pizzeria_zi_peppe;

-- adding the first 5 pizza records to the view
CREATE OR REPLACE VIEW ordered_pizzas AS
SELECT *
FROM pizza
ORDER BY name DESC
LIMIT 5;

-- selects 'pizza' table records
SELECT *
FROM pizza;

-- selects 'ordered_pizzas' view records
SELECT *
FROM ordered_pizzas;