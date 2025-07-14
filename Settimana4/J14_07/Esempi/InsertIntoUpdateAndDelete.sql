-- selects all data from the city table 
SELECT *
FROM city;

-- selects all data from the city table
-- with ID range between 4080 and 4081
SELECT *
FROM city
WHERE ID >= 4080 AND ID <= 4081;

-- inserts two records with the following values
INSERT INTO city VALUES
(4080, 'Hammla', 'AFG', 'Arabic', 500000),
(4081, 'Abdul', 'AFG', 'Arabic', 550000);

-- updates "Name" and "District" fields of the record
-- with ID = 4080
UPDATE city
SET Name = 'Fish And Chips', District = 'English'
WHERE ID = 4080;

-- updates "Name" and "District" fields of the record
-- with ID = 4081
UPDATE city
SET Name = 'Macaroni and cheese', District = 'English'
WHERE ID = 4081;

-- deletes all data from the city table
-- with ID range between 4080 and 4081
DELETE FROM city
WHERE ID >= 4080 AND ID <= 4081;