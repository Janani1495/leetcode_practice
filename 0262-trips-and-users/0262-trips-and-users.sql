# Write your MySQL query statement below
select request_at as Day,round(sum(status<>'completed')/count(*),2)as 'Cancellation Rate'
from Trips t 
JOIN Users c ON t.Client_Id = c.Users_Id AND c.Banned = 'No'
JOIN Users d ON t.Driver_Id = d.Users_Id AND d.Banned = 'No'
where request_at between  '2013-10-01' AND '2013-10-03'
GROUP BY Request_at
ORDER BY Request_at;