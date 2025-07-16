-- adding records to the view with italian cities
CREATE OR REPLACE VIEW italian_cities AS
SELECT Name, Population
FROM city
WHERE CountryCode = 'ITA';

SELECT *
FROM italian_cities
WHERE Population < 100000;