/* SQL e15 — WHERE com IN + ORDER BY
   Liste o titulo, nota e genero dos animes que são do gênero 'Isekai' ou 'Suspense' ou 'Mistério', ordenados por nota decrescente.
*/

SELECT titulo, nota, genero FROM animes WHERE genero IN ('Isekai', 'Suspense', 'Mistério') ORDER BY nota DESC;
