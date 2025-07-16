-- query 3
SELECT country.Region, countrylanguage.Language
FROM country
INNER JOIN countrylanguage ON country.Code = countrylanguage.CountryCode
WHERE country.GovernmentForm = 'Republic' AND country.LifeExpectancy > 70;