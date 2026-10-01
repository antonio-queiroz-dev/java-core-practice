/* SQL e01 — SELECT + WHERE + ORDER BY
   Liste o titulo e a nota de todos os animes com nota maior que 8.5, ordenados do melhor pro pior.
*/

SELECT titulo, nota FROM animes where nota > 8.5 order by nota DESC;
