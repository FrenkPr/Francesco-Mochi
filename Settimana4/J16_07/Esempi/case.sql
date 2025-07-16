SELECT Name AS Città, Population AS Popolazione,
CASE
    WHEN Population > 5000000 THEN 'Megalopoli'
    WHEN Population > 1000000 THEN 'Grande città'
    WHEN Population > 500000 THEN 'Media città'
    ELSE 'Piccola città'
END AS Categoria
FROM City
ORDER BY Population DESC;