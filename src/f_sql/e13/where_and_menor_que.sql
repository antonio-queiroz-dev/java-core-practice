/* SQL e13 — WHERE com AND + < + ORDER BY
   Liste o titulo e episodios dos animes que têm nota acima de 8.0 E menos de 50 episódios, ordenados por nota decrescente.
*/

SELECT titulo, episodios FROM animes WHERE nota > 8.0 AND episodios < 50 ORDER BY nota desc;
