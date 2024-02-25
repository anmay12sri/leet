# Write your MySQL query statement below
Select max(num) as num
from MYNumbers
where num not in(select num from MYNumbers group by num having count(num)>1);

