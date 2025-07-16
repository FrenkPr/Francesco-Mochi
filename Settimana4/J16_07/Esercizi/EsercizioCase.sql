SELECT Name,
CASE
	WHEN CountryCode = 'AFG' THEN 'Country code not available'
    ELSE CountryCode
END AS CountryCodesAvailable
FROM city
ORDER BY
(CASE
	WHEN CountryCodesAvailable = 'NLD' THEN Name
    ELSE CountryCodesAvailable
END);