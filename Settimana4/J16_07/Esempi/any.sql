SELECT ProductName
FROM Products
WHERE ProductID = ANY
(
    SELECT ProductID
    FROM OrderDetails
    WHERE Quantity > 90
);