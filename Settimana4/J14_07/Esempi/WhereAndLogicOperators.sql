-- Where clause and logic operators

SELECT *
FROM world.country
WHERE Region='Caribbean';

SELECT *
FROM world.country;

SELECT *
FROM world.country
WHERE Region = 'Caribbean' AND SurfaceArea = 193.00;

SELECT *
FROM world.country
WHERE Continent = 'North America' OR NOT Region = "Southern Europe";

SELECT Name, Continent, Region
FROM world.country
ORDER BY Name, Continent;

SELECT *
FROM world.country
ORDER BY Region, SurfaceArea DESC;

SELECT *
FROM world.country
ORDER BY Region DESC, SurfaceArea DESC;