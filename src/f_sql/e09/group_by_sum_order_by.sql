/* SQL e09 — GROUP BY + SUM + ORDER BY
   Mostre o total de episódios por gênero, ordenado do gênero com mais episódios pro com menos.
*/

SELECT genero, SUM(episodios) AS total FROM animes GROUP BY genero ORDER BY total DESC;
