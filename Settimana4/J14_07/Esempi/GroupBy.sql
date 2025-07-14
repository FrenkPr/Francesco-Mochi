-- selects all data from the country table 
SELECT *
FROM country;

-- returns the "Continent" name and the count of its regions
SELECT Continent, COUNT(Region) AS "Regions count per continent"
FROM country
GROUP BY Continent;

-- returns "Region" names and the number of times it's present
-- in various records
SELECT Region, COUNT(Region) AS "Regions count"
FROM country
GROUP BY Region;