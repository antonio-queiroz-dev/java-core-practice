/* SQL e08 — GROUP BY + AVG + ROUND
   Mostre a nota média dos animes por gênero, ordenada da maior média pra menor. Use ROUND pra arredondar pra 1 casa decimal.
*/

SELECT genero, ROUND(AVG(nota),1) as media FROM animes GROUP BY genero ORDER BY media DESC;
