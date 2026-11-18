/* SQL e21 — AVG com WHERE
   Mesma tabela: qual a média das notas dos animes do gênero Ação? Nomeie a coluna do resultado como media_acao.
*/

SELECT AVG(nota) AS media_acao from animes where genero = 'Ação';
