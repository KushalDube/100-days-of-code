# Write your MySQL query statement below
select unique_id, name
from Employees AS E1
left JOIN EmployeeUNI AS E2
ON E1.id = E2.id;