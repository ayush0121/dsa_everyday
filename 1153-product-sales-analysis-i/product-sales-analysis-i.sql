# Write your MySQL query statement below
select Product.product_name as product_name,
s.year as year, s.price as price from Sales s
inner join product
using (product_id);
