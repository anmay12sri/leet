# Write your MySQL query statement below
select Employee.name,Bonus.bonus 
from Employee 
left join Bonus on Employee.empID=Bonus.empID
 WHERE bonus < 1000 OR Bonus IS NULL;