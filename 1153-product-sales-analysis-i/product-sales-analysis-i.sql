# Write your MySQL query statement below
select Product.product_name, Sales.year, Sales.price from Sales
inner join product 
using (product_id);
