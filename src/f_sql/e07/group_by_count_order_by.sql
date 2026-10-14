/* SQL e07 — GROUP BY + COUNT + ORDER BY
   Conte quantos animes existem em cada gênero, ordenados do gênero com mais animes pro com menos.
*/

SELECT genero, COUNT(*) AS quantidade FROM animes GROUP BY genero ORDER BY quantidade desc;
