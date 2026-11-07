/* SQL e16 — WHERE com BETWEEN + ORDER BY
   Liste o titulo, nota e episodios dos animes com nota entre 8.0 e 8.8 (inclusive), ordenados por nota crescente.
*/

SELECT titulo, nota, episodios FROM animes WHERE nota BETWEEN 8.0 AND 8.8 ORDER BY nota ASC;
