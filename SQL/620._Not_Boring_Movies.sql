# Write your MySQL query statement below.
 
SELECT * from Cinema
WHERE mod(id,2) != 0 AND description != "boring"
ORDER BY rating DESC;