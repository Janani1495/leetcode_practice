# Write your MySQL query statement below
select user_id,concat(upper(substring(name,1,1)),lower(substr(name,2)))as name from users order by user_id asc;