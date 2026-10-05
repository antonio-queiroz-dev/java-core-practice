/* SQL e02 — SELECT + WHERE com texto + ORDER BY
   Liste o titulo, genero e episodios de todos os animes do gênero 'Ação', ordenados por episódios do maior pro menor.
*/

SELECT titulo, genero, episodios FROM animes where genero = 'Ação' order by episodios DESC;
