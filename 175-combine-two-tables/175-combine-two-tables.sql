# Write your MySQL query statement below
SELECT person.firstname,person.lastname,address.city,address.state FROM Person left join Address on Address.personId=Person.personId;