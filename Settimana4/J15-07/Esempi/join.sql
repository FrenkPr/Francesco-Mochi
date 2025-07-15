-- selects all country and city records
SELECT *
FROM world.country
INNER JOIN world.city
ON country.Code = city.CountryCode;

-- selects city records that have a country population
-- greater than or equal to 2000000
SELECT city.*
FROM world.country
INNER JOIN world.city
ON country.Code = city.CountryCode
WHERE country.Population >= 2000000;