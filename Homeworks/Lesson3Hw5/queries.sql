SELECT * FROM Customers;

SELECT ContactName Adi, City Sehir FROM Customers;

Select * from Customers where City = 'Berlin';

Select * from Products where CategoryID = 1 or CategoryID = 3;

Select * from Products where CategoryID = 1 and Price >= 10;

Select * from Products where CategoryID = 1 order by Price desc;

Select count (*) Adet from Products where CategoryID = 2;

Select CategoryID, count() from Products where Price > 20 group by CategoryID having count() < 10;

Select Products.ProductID, Products.ProductName, Products.Price, Categories.CategoryName 
from Products inner join Categories on Products.CategoryID = Categories.CategoryID where Products.Price > 10;

Select * from Products p left join OrderDetails od on p.ProductID = od.ProductID;

Select * from Customers c left join Orders o on c.CustomerID = o.CustomerID where o.CustomerID is null;

Select * from Products p left join OrderDetails od on p.ProductID = od.ProductID inner join Orders o on o.OrderID = od.OrderID;