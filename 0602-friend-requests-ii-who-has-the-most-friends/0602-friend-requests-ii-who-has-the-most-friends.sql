# Write your MySQL query statement below
with ans as (select requester_id id from RequestAccepted 
union all
select accepter_id id from RequestAccepted)
select id,count(*)num from ans group by 1 order by 2 desc limit 1;