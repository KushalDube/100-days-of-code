# Write your MySQL query statement below
 
SELECT customer_id, count(customer_id) as count_no_trans
from Visits as v
LEFT JOIN Transactions as t
ON v.visit_id = t.visit_id
WHERE t.visit_id is NULL
GROUP BY v.customer_id;