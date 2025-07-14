--Selecting "Continent" field from the country table
SELECT Continent
FROM world.country;

/*
In alcune versioni di MySQL, il software vuole
che specifichi per forza il nome di una tabella
(quindi non funziona in tutte le versioni l'estrapolazione
dei dati dell'intero DB)
*/
SELECT *
FROM world;

-- returns the count of the countries in the country table
SELECT COUNT(DISTINCT Name) AS "Countries count"
FROM world.country;