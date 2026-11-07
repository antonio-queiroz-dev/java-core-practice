/* SQL e17 — WHERE com OR + ORDER BY
   Liste o titulo e nota dos animes que têm nota acima de 8.5 OU que são do gênero 'Isekai', ordenados por nota decrescente.
*/

SELECT titulo, nota FROM animes WHERE nota > 8.5 OR genero = 'Isekai' ORDER BY nota DESC;
