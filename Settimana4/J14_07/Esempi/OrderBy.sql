-- selects "Name", "Continent" and "Region" data ordered by
-- "Name" and "Continent" as a consequence both with default order type (ASC)
SELECT Name, Continent, Region
FROM world.country
ORDER BY Name, Continent;

-- selects all data from the country table ordered by
-- "Region" in ASC order and "SurfaceArea" as a consequence in DESC order
SELECT *
FROM world.country
ORDER BY Region, SurfaceArea DESC;

-- selects all data from the country table ordered by
-- "Region" in DESC order and "SurfaceArea" as a consequence in DESC order
SELECT *
FROM world.country
ORDER BY Region DESC, SurfaceArea DESC;