/* SQL e19 — COUNT + AVG + MAX + MIN com WHERE
   Ainda na tabela animes: em uma única consulta, traga quatro informações sobre os animes lançados de 2015 em diante: quantos são, a média das notas, a maior nota e o menor número de episódios. Dê nomes às colunas do resultado.
*/

SELECT COUNT(*) AS quantidade,AVG(nota) AS media,MAX(nota) AS maior_nota, MIN(episodios) AS menos_episodios FROM animes WHERE ano_lancamento >= 2015;
