# Write your MySQL query statement below
#select *(select u.user_id,u.join_date,count(o.order_id) as 'orders_in_2019' from users u left join 
#orders o on u.user_id=o.buyer_id and YEAR(o.order_date) = 2019
#join items i on i.item_id=o.item_id group by u.user_id order by o.buyer_id );
SELECT 
    u.user_id as buyer_id, 
    u.join_date, 
    COUNT(o.order_id) AS orders_in_2019
FROM 
    users u
LEFT JOIN 
    orders o 
    ON u.user_id = o.buyer_id AND YEAR(o.order_date) = 2019
GROUP BY 
    u.user_id
ORDER BY 
    u.user_id;
