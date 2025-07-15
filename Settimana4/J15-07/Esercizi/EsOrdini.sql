CREATE DATABASE restaurant_orders;

-- "clients" table creation
CREATE TABLE clients
(
    id INT PRIMARY KEY,
    name VARCHAR(100),
    city VARCHAR(100)
);

-- "orders" table creation
CREATE TABLE orders
(
    id INT PRIMARY KEY,
    client_id INT,
    order_date DATE,
    import DECIMAL(7, 2)
);

-- 'clients' data insert
INSERT INTO clients (id, name, city) VALUES
(1, 'Luca Rossi', 'Roma'),
(2, 'Maria Bianchi', 'Milano'),
(3, 'Giovanni Verdi', 'Napoli'),
(4, 'Anna Neri', 'Torino'),
(5, 'Marco Ferrara', 'Firenze'),
(6, 'Elena Galli', 'Bologna'),
(7, 'Paolo Mancini', 'Palermo'),
(8, 'Francesca Ricci', 'Genova'),
(9, 'Stefano Russo', 'Venezia'),
(10, 'Carla Moretti', 'Catania');

-- 'orders' data insert
INSERT INTO orders (id, client_id, order_date, import) VALUES
(1, 2, '2025-08-08', 10.00),
(2, 2, '2025-08-08', 10.00),
(3, 3, '2025-08-08', 10.00),
(4, 0, '2025-08-08', 10.00),
(5, -1, '2025-08-08', 10.00);

-- query 1
SELECT clients.name, orders.order_date, orders.import
FROM clients
INNER JOIN orders
ON clients.id = orders.client_id;

-- query 2
SELECT clients.name, orders.order_date, orders.import
FROM clients
LEFT JOIN orders
ON clients.id = orders.client_id;

-- query 3
SELECT clients.name, orders.order_date, orders.import
FROM clients
RIGHT JOIN orders
ON clients.id = orders.client_id;