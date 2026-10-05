/* SQL e03 — WHERE com AND + ORDER BY
   Liste o titulo e episodios dos animes que são do gênero 'Ação' E têm mais de 30 episódios, ordenados por episódios do menor pro maior.
*/

SELECT titulo, episodios FROM animes WHERE genero = 'Ação' AND episodios > 30.0 ORDER BY episodios ASC;
