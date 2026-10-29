/* SQL e10 — GROUP BY + HAVING + ORDER BY
   Mostre os gêneros que têm mais de 1 anime, com a quantidade de animes de cada. Ordene por quantidade decrescente.
*/

SELECT genero, COUNT(*) AS quantidade_animes FROM animes GROUP BY genero HAVING COUNT(*) > 1 ORDER BY quantidade_animes DESC;
