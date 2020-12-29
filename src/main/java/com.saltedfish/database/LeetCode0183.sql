SELECT customers.name AS 'Customers' FROM customers
WHERE customers.id NOT IN
(
    SELECT distinct customerId FROM orders
);