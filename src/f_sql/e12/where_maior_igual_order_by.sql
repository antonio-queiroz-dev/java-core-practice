/* SQL e12 — WHERE com >= + ORDER BY
   Liste o titulo, nota e ano_lancamento dos animes lançados a partir de 2013, ordenados do mais recente pro mais antigo.
*/

SELECT titulo, nota, ano_lancamento FROM animes WHERE ano_lancamento >= 2013 ORDER BY ano_lancamento DESC;
