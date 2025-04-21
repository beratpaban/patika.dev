SELECT DISTINCT replacement_cost FROM film;

SELECT COUNT(DISTINCT replacement_cost) FROM film;

SELECT COUNT(*) FROM film
WHERE (title LIKE  'T%' AND rating = 'G');

SELECT COUNT(*) FROM country
WHERE LENGTH(country) = 5;

SELECT COUNT(*) FROM city
WHERE city LIKE '%R' OR  city LIKE '%r';

SELECT title,length FROM film
ORDER BY length DESC; -- Azalan Sıralama

SELECT title,length FROM film
ORDER BY length ASC; -- Artan Sıralama

SELECT title,length FROM film
ORDER BY length; -- Artan Sıralama

SELECT title,length FROM film
ORDER BY length LIMIT 10; -- Artan Sıralama ve ilk 10 tane

SELECT title, length FROM film
ORDER BY length
OFFSET 5 LIMIT 10;


