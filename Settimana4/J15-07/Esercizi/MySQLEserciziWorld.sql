-- Es 1
SELECT DISTINCT Region
FROM world.country
WHERE Continent = 'Europe';

-- Es2
SELECT Name, Population
FROM world.country
WHERE Code = 'USA' AND Population > 1000000
ORDER BY Population DESC;

-- Es 3
SELECT COUNT(Name) AS 'Total names per continent', SUM(Population) AS 'Total population per continent'
FROM world.country
GROUP BY Continent
ORDER BY 'Total population per continent' DESC;