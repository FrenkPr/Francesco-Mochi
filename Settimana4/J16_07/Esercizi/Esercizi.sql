-- query 1
SELECT country.Name, countrylanguage.Language, countrylanguage.Percentage
FROM country
INNER JOIN countrylanguage ON country.Code = countrylanguage.CountryCode;

-- query 2
-- returns country names with the highest relative spoken language percentage
SELECT country.Name, MAX(countrylanguage.Percentage)
FROM country
INNER JOIN countrylanguage ON country.Code = countrylanguage.CountryCode
GROUP BY country.Name;

-- query 3
SELECT country.Name, countrylanguage.Language, countrylanguage.Percentage
FROM country
INNER JOIN countrylanguage ON country.Code = countrylanguage.CountryCode
WHERE countrylanguage.Language = ANY
(
	SELECT MAX(countrylanguage.Language) FROM countrylanguage
    INNER JOIN country ON country.Code = countrylanguage.CountryCode
    GROUP BY country.Name
);