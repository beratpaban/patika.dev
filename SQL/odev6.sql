SELECT ROUND(AVG(rental_rate),3) FROM film;

SELECT COUNT(title) FROM film
WHERE title LIKE 'C%';

SELECT MAX(length) FROM film
WHERE rental_rate = 0.99;

SELECT DISTINCT(replacement_cost) FROM film
WHERE length > 150;