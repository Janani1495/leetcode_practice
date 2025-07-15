# Write your MySQL query statement below
select u.name,coalesce(sum(r.distance),0) as travelled_distance from users u 
left join rides r on r.user_id=u.id
group by u.id,name
order by travelled_distance desc ,name asc;