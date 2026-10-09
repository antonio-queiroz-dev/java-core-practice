/* SQL e06 — AVG + MAX + MIN
   Mostre a nota média, a maior nota e a menor nota de todos os animes da tabela.
*/

SELECT AVG(nota) AS nota_media, MAX(nota) as Maior_nota ,MIN(nota) as Menor_nota FROM animes;
