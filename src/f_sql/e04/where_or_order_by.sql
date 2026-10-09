/* SQL e04 — WHERE com OR + ORDER BY
   Liste o titulo, genero e nota dos animes que são do gênero 'Suspense' OU têm nota maior ou igual a 9.0, ordenados por nota do maior pro menor.
*/

SELECT titulo, genero, nota FROM animes WHERE genero = 'Suspense' OR nota >= 9.0 ORDER BY nota DESC;
