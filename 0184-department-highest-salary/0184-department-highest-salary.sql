# Write your MySQL query statement below
select d.name as Department , e.name as Employee , e.salary
from Employee e 
join Department d on e.departmentid = d.id 
WHERE (e.departmentId, e.salary) IN (
    SELECT departmentId, MAX(salary)
    FROM Employee
    GROUP BY departmentId
);
