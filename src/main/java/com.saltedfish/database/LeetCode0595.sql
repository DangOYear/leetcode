SELECT name,
    population,
    area
FROM
    World
WHERE
    area > 3000000
    OR population > 25000000;


# Write your MySQL query statement below
SELECT
    FirstName, LastName, City, State
FROM
    Person, Address

where
    Person.PersonId = Address.PersonId;