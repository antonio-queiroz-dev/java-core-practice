/* SQL e18 — WHERE com IN + BETWEEN + AND + ORDER BY
   No banco de animes: liste titulo, genero, episodios e nota dos animes que sejam do gênero Ação ou Fantasia, tenham nota entre 8 e 10, e mais de 12 episódios. Ordene da maior nota pra menor.
*/

SELECT titulo, genero, episodios, nota FROM animes WHERE genero IN ('Ação', 'Fantasia') AND nota BETWEEN 8 AND 10 AND episodios > 12 ORDER BY nota DESC;
