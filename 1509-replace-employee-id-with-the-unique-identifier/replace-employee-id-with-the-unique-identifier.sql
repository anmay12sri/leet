# Write your MySQL query statement below
 Select Employees.name,EmployeeUNI.unique_id 
 from Employees
  left join EmployeeUNI
--  order by Employees.id desc
 on Employees.id=EmployeeUNI.id 
 order by Employees.id ;