# Write your MySQL query statement below

SELECT name, bonus
FROM Employee AS E
LEFT JOIN Bonus AS B
ON E.empID = B.empID
HAVING B.bonus < 1000 OR B.bonus IS NULL;