-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
SELECT * FROM actor
ORDER BY last_name

BEGIN TRANSACTION;

INSERT INTO actor(first_name,last_name)
VALUES ('HAMPTON','AVENUE'),('LISA','BYWAY')

COMMIT;

ROLLBACK;
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
SELECT * FROM film
ORDER BY title

BEGIN TRANSACTION;

INSERT INTO film(title, description, release_year, language_id,length)
VALUES ('EUCLIDEAN PI','The epic story of Euclid as a pizza delivery boy in ancient Greece','2008','1','198')

COMMIT;

ROLLBACK;
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
SELECT * FROM film_actor
ORDER BY film_actor DESC

BEGIN TRANSACTION;

INSERT INTO film_actor(actor_id,film_id)
VALUES (201,1003)

INSERT INTO film_actor(actor_id,film_id)
VALUES (202, 1003)

COMMIT;

ROLLBACK;
-- 4. Add Mathmagical to the category table.
SELECT * FROM category

BEGIN TRANSACTION;

INSERT INTO category (name) VALUES ('Mathmagical')

COMMIT;

ROLLBACK;
-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
SELECT f.title, c.name 
FROM film f 
JOIN film_category fc ON fc.film_id = f.film_id
JOIN category c ON c.category_id = fc.category_id
WHERE c.name = 'Mathmagical'


BEGIN TRANSACTION

INSERT INTO film_category(film_id,category_id)
VALUES ((SELECT film_id FROM film WHERE  title = 'EUCLIDEAN PI'),(SELECT category_id FROM category WHERE name = 'Mathmagical'))

UPDATE film_category
SET category_id = (SELECT category_id FROM category WHERE category.name = 'Mathmagical')
FROM film
WHERE film.title in ('EGG IGBY','RANDOM GO','YOUNG LANGUAGE','KARATE MOON') AND film_category.film_id = film.film_id;

COMMIT

ROLLBACK;
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
SELECT title, rating FROM film
WHERE film_id IN (SELECT film_id FROM film_category WHERE category_id = (SELECT category_id FROM category WHERE name = 'Mathmagical'))

BEGIN TRANSACTION;

UPDATE film SET rating = 'G'
WHERE film_id IN
(SELECT film_id FROM film_category WHERE category_id =
(SELECT category_id FROM category WHERE name = 'Mathmagical'))

COMMIT;

ROLLBACK;

-- 7. Add a copy of "Euclidean PI" to all the stores.
SELECT * FROM inventory
WHERE film_id = 1003
ORDER BY film_id DESC

BEGIN TRANSACTION;

INSERT INTO inventory(film_id,store_id)
VALUES((SELECT film_id FROM film WHERE title = 'EUCLIDEAN PI'),1)


INSERT INTO inventory(film_id,store_id)
VALUES((SELECT film_id FROM film WHERE title = 'EUCLIDEAN PI'),2)

COMMIT;

ROLLBACK;


-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)

-- <I did not succedd because the primary key for 'EUCLIDEAN PI' is being used in another table as a foreign key  which violates foreign key constrant>  
SELECT * FROM film
WHERE title = 'EUCLIDEAN PI'
ORDER BY title


BEGIN TRANSACTION;

DELETE FROM film WHERE title = 'EUCLIDEAN PI'

COMMIT;

ROLLBACK;
-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)

-- <I did not succedd because the primary key for 'EUCLIDEAN PI' is being used in another table as a foreign key which violates foreign key constrant>

SELECT c.name FROM category c



BEGIN TRANSACTION;

DELETE FROM category WHERE name = 'Mathmagical'

COMMIT;

ROLLBACK;
-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)

-- <Yes, Because the primary key for category 'Mathmagical' was not used in any other table as a foreign key>
SELECT *, c.name 
FROM film_category fc
JOIN category c ON c.category_id = fc.category_id
ORDER BY fc.category_id DESC, c.name DESC

BEGIN TRANSACTION;

DELETE FROM film_category WHERE category_id = 17

COMMIT;

ROLLBACK;

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)

-- <Deleting 'Mathmagical' succeeds because it is not used in any otehr table but deleting 'EUCLIDEAN PI'fails because it is still being used in another table as a foreign key >

BEGIN TRANSACTION;

DELETE FROM category WHERE name = 'Mathmagical'

DELETE FROM film WHERE title = 'EUCLIDEAN PI'

COMMIT;

ROLLBACK;
-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

--<The foreign key for 'EUCLIDEAN PI' that is used in other tables sucjh as the film_actor table should be deleted first before it is removed as a primary key from the film table.>
BEGIN TRANSACTION;

COMMIT;

ROLLBACK;