/* SQL e14 — WHERE com LIKE + ORDER BY
   Liste o titulo e genero de todos os animes cujo título começa com a letra 'S', ordenados por titulo em ordem alfabética.
*/

SELECT titulo, genero FROM animes WHERE titulo LIKE 'S%' ORDER BY titulo ASC;
