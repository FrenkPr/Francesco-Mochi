SELECT CountryCode, COUNT(*) AS NumeroLingue
FROM CountryLanguage
WHERE IsOfficial = 'T'
GROUP BY CountryCode
HAVING COUNT(*) > 1;